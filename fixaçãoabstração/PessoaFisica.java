package fixaçãoabstração;

public class PessoaFisica extends  Contribuinte{
    private Double gastoComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }
    @Override
    public Double calculoImposto() {
        double aux = 0.0;
        if(getRendaAnual() < 20000){
            aux = getRendaAnual() * 0.15;
        }
        else {
            aux = getRendaAnual() * 0.25;
        }
        aux -= gastoComSaude * 0.50;
        return aux;
    }
}
