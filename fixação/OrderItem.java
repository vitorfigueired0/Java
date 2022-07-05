package fixação;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Product product, Integer quantity, Double price){
        this.product = product;
        this.quantity = quantity;
        this.price = price;

    }
    public Double getPrice() {
        return price;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public Double subTotal(){
        return  quantity * price;
    }
    public Product getProduct() {
        return product;
    }
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}