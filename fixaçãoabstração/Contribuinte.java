package fixaçãoabstração;

public abstract class Contribuinte {
    private String nome;
    private Double rendaAnual;

    public Contribuinte(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }

    public abstract Double calculoImposto();

    public String toString(){
        return nome + ": " +
                "$ " + String.format("%.2f", calculoImposto());
    }

}
