package Chapter3.Exercises;

import java.util.Scanner;

/*
The program should allow the user to enter any number
of integers, calculate and display their sum. The program should
stop when the user enters zero
 */
public class WhileLoopExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        //declare and initialize the loop control variable
        int testScore;
        System.out.print("Enter the test score. Enter zero to stop: ");
        testScore = input.nextInt();//56

        //test the test score
        while (testScore != 0){
            sum = sum + testScore;
            //change the value of test score
            System.out.print("Enter the test score. Enter zero to stop: ");
            testScore = input.nextInt();
        }
        //display
        System.out.println("Sum: " + sum);
        /*
        * 56
        * sum = sum + 56
        *
        * 78
        * sum = sum + 78
        *
        * */
        //display the sum (199)


    }
}
