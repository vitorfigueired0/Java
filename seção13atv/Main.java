package seção13atv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter departament name: ");
        String dep = inp.nextLine();
        Departament departament = new Departament(dep);
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = inp.next();
        System.out.print("Level: ");
        String level = inp.next().toUpperCase();
        System.out.print("Base Salary: ");
        double bSalary = inp.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), bSalary, departament);
        System.out.print("How many contracts to this worker? ");
        int numberContracts = inp.nextInt();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i<numberContracts; i++){
            System.out.printf("Enter contract #%d data:%n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf1.parse(inp.next());
            System.out.print("Value per hour: ");
            double value = inp.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = inp.nextInt();
            HourContract contract = new HourContract(date, value, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter the month to calculate income MM: ");
        int month = inp.nextInt();
        System.out.print("Enter the year to calculate income YYYY: ");
        int year = inp.nextInt();
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament " + worker.getDepartament().getName());
        System.out.printf("Income for %s/%s: %.2f%n", month, year, worker.income(year, month));
        
    }
}
