package Chapter1;

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        //1. declare
        String firstname;
        int age;
        double salary;
        char employeeType;
        //declare a scanner object
        Scanner input = new Scanner(System.in);

        //2. Assign - assign values
        System.out.print("Enter your firstname: ");
        firstname = input.next();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter Salary: ");
        salary = input.nextDouble();

        System.out.print("Enter Employee Type (P / C): ");
        //employeeType = "Permanent".charAt(0);
        employeeType = input.next().charAt(0);

        //3. Use
        System.out.println("---------------OUTPUT--------------");
        System.out.println("Firstname: " + firstname);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Type: " + employeeType);

    }
}
