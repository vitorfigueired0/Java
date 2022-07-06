package IntroduçãoHerança;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }
    public Integer getNumber() {
        return number;
    }
    public Double getBalance() {
        return balance;
    }
    public void withdraw(Double amount){
        balance -= amount + 5.0;
    }
    public void deposit(Double amount){
        balance += amount;
    }

}
