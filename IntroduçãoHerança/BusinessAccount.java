package IntroduçãoHerança;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }
    public void loan(Double amount){
        if(loanLimit >= amount) {
            deposit(amount);
        }
    }
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 100.0;
    }
}
