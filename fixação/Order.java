package fixação;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void addItem(OrderItem item){
       items.add(item);
    }
    public Double total(){
        double sum = 0.0;
        for (OrderItem c: items){
            sum += c.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate() + ") - " +client.getEmail() + "\n");
        sb.append("Order items: \n");
        for(OrderItem item : items){
            sb.append(item+ "\n");
        }
        sb.append("total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
