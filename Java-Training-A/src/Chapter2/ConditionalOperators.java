package Chapter2;

public class ConditionalOperators {
    public static void main(String[] args) {
        boolean isMarried = true;
        int x = 15;
        int y = 27;
        int z = 30;

        System.out.println("Married? " + isMarried);
        //boolean expressions
        System.out.println(x + " > " + y + " ? " + (x > y));
        System.out.println(x == z);
        System.out.println(x >= z);
        System.out.println(y != x);

        System.out.println("=======================================");
        System.out.println(z >= (x * 2));//true
        System.out.println((z == y) == (x >= y));//true
                        //false == false
    }
}
