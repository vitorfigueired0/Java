package fixaçãoherançapolimorfismo;

public class UsedProduct extends Product{
    private String manufactureDate;

    public UsedProduct(String name, Double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }
    @Override
    public String priceTag(){
        return name +
                " (Used) " +
                String.format(" $ %.2f", price) +
                String.format("(Manufacture date: %s)%n", manufactureDate);
    }
}
