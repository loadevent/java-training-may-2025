package Chapter4;

import javax.swing.*;
import java.util.Scanner;

/*Parameters are data items needed for the method to work.
When the method is called, data items are needed as arguments.
 */
public class ParameterizedMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;

        System.out.println("==========Hard-Coded==========");
        System.out.println("Sum: " + calculateSum(5,10));//15

        System.out.println("\n==========Use A Scanner==========");

        System.out.print("Enter number 1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        number2 = sc.nextInt();

        System.out.println("Sum: " + calculateSum(number1, number2));

        System.out.println("\n==========Use Dialog box==========");
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2"));

        JOptionPane.showMessageDialog(null, "Sum: " + calculateSum(number1, number2));

    }
                                    //5         10
    public static int calculateSum(int num1, int num2){
      int sum = num1 + num2;//15

      return sum;//15
    }
}
