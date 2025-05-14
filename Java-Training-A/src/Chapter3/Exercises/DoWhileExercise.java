package Chapter3.Exercises;

import java.util.Scanner;

/*The program should ask the user to enter 2 integers,
* then as them to select one operator (+, -, *, /) to
* compute the results*/
public class DoWhileExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double results = 0;
        String operator;

        boolean isMarried = false;

        System.out.print("Enter number 1: ");//3
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");//4
        num2 = input.nextInt();
        //display the menu to the user

        do {
            System.out.print("Choose an operator: \n" +
                    "(+) to add \n" +
                    "(-) to subtract \n" +
                    "(*) to multiply \n" +
                    "(/) to divide \n" +
                    "Your choice: ");
            operator = input.next();//#
                        //# false            false               false                   false               = !false
        }while(!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")));


            if (operator.equals("+")) {
                results = num1 + num2;
            }else if (operator.equals("*")){
                results = num1 * num2;
            }else if(operator.equals("-")){
                results = num1 - num2;
            }else if(operator.equals("/")){
                results = num1 / num2;
            }

            System.out.println("Results: " + results);
    }
}
