package entities;

import entities.enums.OrderStatus;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Client client;
    private Instant date;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();

    private DateTimeFormatter fmt = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss")
            .withZone(ZoneId.systemDefault());

    public Order() {
    }

    public Order(Client client, Instant date, OrderStatus status) {
        this.client = client;
        this.date = date;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(fmt.format(date));
        sb.append("\nOrder statud: ");
        sb.append(status);
        sb.append("\n");
        sb.append(client);
        sb.append("\nOrder items:\n");
        for (OrderItem item : items) {
            sb.append(item);
            sb.append("\n");
        }
        sb.append("Total price: ");
        sb.append(total());

        return sb.toString();
    }
}
