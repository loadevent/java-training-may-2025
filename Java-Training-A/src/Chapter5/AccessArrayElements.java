package Chapter5;

public class AccessArrayElements {
    //global declarations
   static int[] arNumbers = {4, 523, 7, 9, 65, 221, 18, 37, 66, 218, 1098};

    public static void main(String[] args) {
        String[] arHobbies = {"Soccer", "Tennis", "Golf", "Hiking", "Chess", "Hockey"};//6 elements
        double[] arPrices = {12.59, 50.00, 45.90, 17,49};//4 elements
        /*1. elements = 5
        last position = 4

        2. elements = 4
        last position = 3

        3. elements = 4
        last position = 3
         */

        System.out.println("Hobbies: " + arHobbies.length);
        int x = 0;

        while (x < arHobbies.length){
            System.out.println(arHobbies[x]);
            x++;
        }
        System.out.println("================= > 10 ====================");

        //display numbers > 10
        //41, 52, 7, 9, 12
        for (int i = 0; i < arNumbers.length; i++) {
            if (arNumbers[i] < 20){//12 > 10
                System.out.println(arNumbers[i]);//41, 52, 12
            }
        }

        //increasePrices();
        displayEvenNumbers();
        displayMultiplesOfThree();
        displayOddNumbers();

    }
    public static void increasePrices(){
        double[] arPrices = {12.59, 50.00, 45.90, 17,49};
        //[0] = 12.59 + (12.59 * 0.05)
        System.out.println("==============Original Array====================");

        for (int i = 0; i < arPrices.length; i++) {
            System.out.print(arPrices[i] + "    ");
        }
        System.out.println("\n==============After 5% increase====================");

        for (int i = 0; i < arPrices.length; i++) {
            arPrices[i] = arPrices[i] + (arPrices[i] * 0.05);
            System.out.print(arPrices[i] + "    ");
        }
    }
    public static void displayEvenNumbers(){
        //% modulus operator: returns the remainder of a division
        //boolean isEven = (arNumbers[0] % 2 == 0);
        System.out.println("\n============EVEN NUMBERS===================");
        for (int i = 0; i < arNumbers.length; i++) {
            if (arNumbers[i] % 2 == 0){
                System.out.print(arNumbers[i] + "   ");
            }
        }
    }
    public static void displayMultiplesOfThree(){
        System.out.println("\n============Multiples of Three===================");
        for (int i = 0; i < arNumbers.length; i++) {
            if (arNumbers[i] % 3 == 0){
                System.out.print(arNumbers[i] + "   ");
            }
        }
    }
    public static void displayOddNumbers(){
        System.out.println("\n============Odd Numbers===================");
        for (int i = 0; i < arNumbers.length; i++) {
            if (arNumbers[i] % 2 != 0){
                System.out.print(arNumbers[i] + "   ");
            }
        }
    }
}
