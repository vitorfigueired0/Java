package fixaçãoherançapolimorfismo;

public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public String priceTag(){
        return name +
                String.format(" $ %.2f%n", price);
    }
}
