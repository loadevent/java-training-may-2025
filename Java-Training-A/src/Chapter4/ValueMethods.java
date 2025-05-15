package Chapter4;

import java.util.Scanner;

/*This class demonstrate methods that returns values*/
public class ValueMethods {
    public static void main(String[] args) {
        System.out.println(getWelcomeMessage());
        int answer;
        //variable = value
        answer = getSum();
        System.out.println(answer);

    }
    //Method to calculate and return the sum of 2 integers
    //access modifier   static    return type   method name()
    private static int getSum(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        return sum;
    }

    public static String getWelcomeMessage(){
        return "=====Welcome To iLAB Java Training=======\n" +
                "-----------------------------------------";
    }

}
