package be.diher81.switchfully.api.order;

import be.diher81.switchfully.api.customer.CustomerDto;
import be.diher81.switchfully.domain.customer.Customer;
import be.diher81.switchfully.domain.order.Order;
import be.diher81.switchfully.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {

    private OrderService orderService;
    private OrderMapper orderMapper;

    @Inject
    public OrderController(OrderService orderService, OrderMapper orderMapper) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<OrderDto> getOrders() {
        List<OrderDto> orderDtos = new ArrayList<>();
        for (Order order : orderService.getOrders()) {
            orderDtos.add(orderMapper.toDto(order));
        }
        return orderDtos;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public BigDecimal addNewOrder(@RequestBody OrderDto orderDto) {
        return orderService.addOrder(orderMapper.toDomain(orderDto));
    }
}