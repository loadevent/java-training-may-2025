package Chapter2;

public class PrePostIncrement {
    public static void main(String[] args) {
        int age = 25;

        //pre-increment
        System.out.println("Age is: " + ++age);//26
        System.out.println(age);
        System.out.println("============POST INCREMENT=================");

        System.out.println("Age is: " + age++);
        System.out.println(age);//27

        //pre decrement
        System.out.println("============================================");
        System.out.println("Age is: " + --age);//26
        System.out.println(age);

        System.out.println("============POST DECREMENT=================");
        System.out.println("Age is: " + age--);
        System.out.println(age);
    }
}
