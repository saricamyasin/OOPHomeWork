package week2;

import java.util.Scanner;

public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.name = "Ali";
        w1.socialSecurityNumber = 1234;
        w1.wage = 18.5f;
        w1.workingHours = 8;
        w1.displayInfo();
        w1.displaySalary();

        System.out.println("-------------------------------");

        System.out.print("Name : ");
        w2.name = scan.nextLine();
        System.out.print("Social Securit Number : ");
        w2.socialSecurityNumber = scan.nextInt();
        System.out.print("Wage : ");
        w2.wage = scan.nextFloat();
        System.out.print("Working Hours : ");
        w2.workingHours = scan.nextInt();
        w2.displayInfo();
        w2.displaySalary();
    }

    public void displayInfo(){
        System.out.println(name + " " +socialSecurityNumber);
    }
    public void displaySalary(){
        System.out.println("Salary : " + wage*workingHours);
    }
}
