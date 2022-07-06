package IntroduçãoHerança;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(367, "Vitor", 1450.60);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc.getHolder(), acc.getNumber(), acc.getBalance());
        acc.withdraw(100.0);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc.getHolder(), acc.getNumber(), acc.getBalance());
        System.out.println();
        SavingsAccount acc1 = new SavingsAccount(667, "Anna Giulia", 3420.4, 0.2);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc1.getHolder(), acc1.getNumber(), acc1.getBalance());
        acc1.withdraw(20.0);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc1.getHolder(), acc1.getNumber(), acc1.getBalance());
        System.out.println();
        BusinessAccount acc2 = new BusinessAccount(775, "Nathan", 600.0, 2000.0);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc2.getHolder(), acc2.getNumber(), acc2.getBalance());
        acc2.withdraw(300.00);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc2.getHolder(), acc2.getNumber(), acc2.getBalance());
        acc2.loan(400.0);
        System.out.printf("Nome: %s, n da conta: %d, saldo: %.2f%n", acc2.getHolder(), acc2.getNumber(), acc2.getBalance());



    }
}
