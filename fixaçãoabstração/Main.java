package fixaçãoabstração;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();
        Contribuinte contribuinte;

        System.out.print("Insira o número de contribuintes: ");
        int num = scan.nextInt();

        for (int i = 0; i<num; i++){
            System.out.printf("Dados do #%d° contribuinte:%n", i+1);
            System.out.print("Pessoa física ou Jurídica (PF/PJ): ");
            String escolha = scan.next().toUpperCase().trim();
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Renda anual: ");
            double renda = scan.nextDouble();
            if(escolha.equals("PF")){
                System.out.print("Gastos com saúde: ");
                double gastos = scan.nextDouble();
                contribuinte = new PessoaFisica(nome, renda, gastos);
            }
            else {
                System.out.print("Número de funcionários: ");
                int funcNum = scan.nextInt();
                contribuinte = new PessoaJuridica(nome, renda, funcNum);
            }
            list.add(contribuinte);
        }
        System.out.println();
        System.out.println("Impostos recolhidos:");
        for(Contribuinte c : list){
            System.out.println(c);
        }
        System.out.println();
        System.out.println("Total de imposto:");
        double sum = 0.0;
        for(Contribuinte c : list){
            sum+= c.calculoImposto();
        }
        System.out.printf(" $ %.2f", sum);
    }
}
