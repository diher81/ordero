package be.diher81.switchfully.api.order;

import org.joda.time.DateTime;

import java.util.UUID;

public class ItemGroupDto {

    private UUID id;
    private UUID itemId;
    private long amount;
    private DateTime shippingDate;

    public ItemGroupDto(UUID id, UUID itemId, long amount, DateTime shippingDate) {
        this.id = id;
        this.itemId = itemId;
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public UUID getId() {
        return id;
    }

    public UUID getItemId() {
        return itemId;
    }

    public long getAmount() {
        return amount;
    }

    public DateTime getShippingDate() {
        return shippingDate;
    }


    //    public String getShippingDate() {
//        return String.format("Day: %s Month: %s Year: %s",
//                shippingDate.getDayOfWeek() + shippingDate.getDayOfMonth() + shippingDate.getDayOfYear());
//    }

}
