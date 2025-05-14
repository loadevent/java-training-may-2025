package Chapter1;
import Chapter4.VoidMethods;

/*
This class shows different ways of
declaring variables
 */
public class DeclaringVariables {
    public static void main(String[] args) {

        VoidMethods.displayHeading();

        //1. declare
        //datatype variable name
        String firstName;
        int age;
        double salary;
        float wage;
        String emailAddress;
        boolean isMarried;
        char employeeType;//Employee type = P (permanent) or C (contractor)

        //2. assign - store values inside the variables
        //variable name = value;
        firstName = "Kabelo";
        age = 25;
        salary = 10000.85;
        wage = 5000.85F;
        emailAddress = "kabelo@gmail.com";
        isMarried = true;
        employeeType = 'P';

        firstName = "Smith";

        //3. Use - consume the value(s) stored inside the variable
        System.out.println("Firstname: " + firstName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Salary: " + salary);
        System.out.println("Wage: " + wage);
        System.out.println("Email: " + emailAddress);
        System.out.println("Are you married? " + isMarried);
        System.out.println("Employee Type: " + employeeType);

    }
}
