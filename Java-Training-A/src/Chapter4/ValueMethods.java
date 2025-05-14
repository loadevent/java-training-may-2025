package Chapter4;

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
        int num1 = 10;
        int num2 = 15;

        int sum = num1 + num2;

        return sum;
    }

    public static String getWelcomeMessage(){
        return "=====Welcome To iLAB Java Training=======\n" +
                "-----------------------------------------";
    }

}
