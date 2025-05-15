package Chapter5.Exercises;

import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    static int[] arTestScores = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuSelection;
        String userResponse;

        loadTestScores();

        do {
            do {
                displayMenu();

                menuSelection = sc.nextInt();
            }while (menuSelection < 1 || menuSelection > 3);// repaet the menu is the user enters 1 > number > 3

            if (menuSelection == 1){
                studentsWhoPassed();

            }else if(menuSelection == 2){
                studentsWhoFailed();

            } else if (menuSelection == 3) {
                System.out.println("Highest Score is: " + getHighestScore());
            }

            //--------------------------------------------
            System.out.print("\nDo you want to continue? (Y / N): ");
            userResponse = sc.next();

        }while (userResponse.equalsIgnoreCase("Y"));//repeat the process if the user enters 'Y'


    }

    public static void displayMenu(){
        System.out.print("Choose one of the following (1 - 3):\n" +
                "1 - Scores >= 50\n" +
                "2 - Scores < 50\n" +
                "3 - Highest Score\n" +
                "Your Choice: ");
    }

    public static void loadTestScores(){
//        arTestScores[0] = 65;
//        arTestScores[1] = 19;
//        arTestScores[2] = 74;
//        arTestScores[3] = 36;
//        arTestScores[4] = 88;
//        arTestScores[5] = 58;
        Random rnd = new Random();
        int randomScore;

        for (int i = 0; i < arTestScores.length; i++) {
            randomScore = rnd.nextInt(25, 100);
            arTestScores[i] = randomScore;
        }

    }

    public static void studentsWhoPassed(){
        System.out.println("\n==========Test Scores >= 50==========");
        for (int i = 0; i < arTestScores.length; i++) {
            if (arTestScores[i] >= 50){
                System.out.print(arTestScores[i] + "  ");
            }
        }
    }

    public static void studentsWhoFailed(){
        System.out.println("\n==========Test Scores < 50==========");
        for (int i = 0; i < arTestScores.length; i++) {
            if (arTestScores[i] < 50){
                System.out.print(arTestScores[i] + "  ");
            }
        }
    }

    public static int getHighestScore(){
        // 65, 19, 74, 85, 25
        // 0   1   2   3   4
        int highScore = arTestScores[0];//65

        for (int i = 1; i < arTestScores.length; i++) {
            if (arTestScores[i] > highScore){
                highScore = arTestScores[i];
            }
        }

        return highScore;

    }
}
