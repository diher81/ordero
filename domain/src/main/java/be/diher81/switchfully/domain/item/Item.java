package be.diher81.switchfully.domain.item;

import java.math.BigDecimal;
import java.util.UUID;

public class Item {

    private UUID itemId;
    private String name;
    private String description;
    private BigDecimal price;
    private long amount;

    public Item(String name, String description, BigDecimal price, long amount) {
        this.itemId = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getAmount() {
        return amount;
    }
}
