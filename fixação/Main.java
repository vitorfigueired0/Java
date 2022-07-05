package fixação;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = inp.next();
        System.out.print("Email: ");
        String email = inp.next();
        System.out.print("Birth Date(DD/MM/YYYY): ");
        String birthDate = inp.next();
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = inp.next().toUpperCase();
        System.out.print("How many items in order?");
        int n = inp.nextInt();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
        for (int i = 1; i<=n; i++){
            System.out.printf("Enter #%d item data:%n", i);
            System.out.print("Product name: ");
            String prodName = inp.next();
            System.out.print("Price: ");
            double prodPrice = inp.nextDouble();
            System.out.print("Quantity: ");
            int prodQuantity = inp.nextInt();
            Product product = new Product(prodName, prodPrice);
            OrderItem orderItem = new OrderItem(product, prodQuantity, product.getPrice());
            order.addItem(orderItem);
        }
        System.out.println("Order Sumary:");
        System.out.println(order);

    }
}
