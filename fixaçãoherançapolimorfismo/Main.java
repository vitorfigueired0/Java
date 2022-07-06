package fixaçãoherançapolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Product> products = new ArrayList<>();;
        Product product;
        System.out.print("Enter the number of products: ");
        int prodNum = scan.nextInt();
        for (int i = 0; i<prodNum; i++){
            System.out.printf("Product #%d data: %n", i+1);
            System.out.print("Commom, used or imported (c/u/i)? ");
            String usage = scan.next();
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            if (usage.equals("u")){
                System.out.print("Manufacture date (DD/MM/YYYY):  ");
                String date = scan.next();
                product = new UsedProduct(name, price, date);
            }
            else if (usage.equals("i")){
                System.out.print("Customs Fee: ");
                double customsFee = scan.nextDouble();
                product = new ImportedProduct(name, price, customsFee);
            }
            else {
                product = new Product(name, price);
            }
            products.add(product);
        }
        System.out.println();
        System.out.println("Price tags:");
        for(Product prod : products){
            System.out.print(prod.priceTag());
        }
    }
}
