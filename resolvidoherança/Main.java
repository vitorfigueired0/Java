package resolvidoherança;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int empNum = scan.nextInt();
        for (int i = 0; i<empNum; i++){
            System.out.printf("Employee #%d data:%n", i+1);
            System.out.print("Outsourced (y/n): ");
            String choice = scan.next();
            if(choice.equals("y")){
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour:: ");
                double vph = scan.nextDouble();
                System.out.print("Additional charge: ");
                double outCharge = scan.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, vph, outCharge);
                employeeList.add(employee);
            }
            else {
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour:: ");
                double vph = scan.nextDouble();
                Employee employee = new Employee(name, hours, vph);
                employeeList.add(employee);
            }

        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : employeeList){
            System.out.printf("%s - %.2f%n", emp.getName(), emp.payment());
        }

    }

}
