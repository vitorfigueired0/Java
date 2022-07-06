package fixaçãoabstração;

public class PessoaJuridica extends Contribuinte{
    private Integer funcNum;

    public PessoaJuridica(String nome, Double rendaAnual, Integer funcNum) {
        super(nome, rendaAnual);
        this.funcNum = funcNum;
    }

    public Integer getFuncNum() {
        return funcNum;
    }
    @Override
    public Double calculoImposto() {
        if(funcNum > 10) {
            return getRendaAnual() * 0.14;
        }
        else {
            return getRendaAnual() * 0.16;
        }
    }
}
