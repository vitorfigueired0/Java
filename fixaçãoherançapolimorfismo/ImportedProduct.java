package fixaçãoherançapolimorfismo;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }
    public Double totalPrice(){
        return price + customsFee;
    }
    @Override
    public final String priceTag(){
        return name +
                String.format(" $ %.2f ", totalPrice())+
                String.format("(Customs Fee: $ %.2f)%n", customsFee);
    }

}
