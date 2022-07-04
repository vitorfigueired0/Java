package seção13;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(667, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.printf("Order: %d, %s, %s%n", order.getId(), order.getMoment(), order.getStatus());

        OrderStatus os1 =  OrderStatus.PROCESSING;
        OrderStatus os2 =  OrderStatus.valueOf("PROCESSING");
        System.out.println(os1);
        System.out.println(os2);

    }
}
