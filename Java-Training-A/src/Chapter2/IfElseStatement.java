package Chapter2;

public class IfElseStatement {
    public static void main(String[] args) {
        int age = 27;

        if (age >= 18) {
            //true clause
            System.out.println("Yes, you can vote");
        } else {
            //false clause
            System.out.println("No. You need to wait until you are 18.");
        }

        //--------------------------

        if (age == 16 || age == 17){//false
            System.out.println("Apply for special vote");
        }else{
            System.out.println("No. You need to wait until you are 18.");
        }
        //-------------------------------------


    }
}
