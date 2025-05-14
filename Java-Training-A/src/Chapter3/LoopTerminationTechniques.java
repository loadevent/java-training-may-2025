package Chapter3;

import java.util.Random;

public class LoopTerminationTechniques {
    public static void main(String[] args) {
        //exit the loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
            if (i == 4){
                break;//end / exit the loop
            }
        }
        //skip an iteration
        System.out.println("\n==============================");
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;//start the next iteration
            }
            System.out.print(i + " ");
        }
        System.out.println("\n==============================");

        Random rndNumber = new Random();//generator (1 - 20)
        int number;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Test");
            number = rndNumber.nextInt(1,20);
            if (number == 7){
                break;
            }
        }





    }
}
