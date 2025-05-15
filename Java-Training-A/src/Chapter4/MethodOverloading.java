package Chapter4;
/*Method overloading means creating different methods with the same
* name but different parameter types*/
public class MethodOverloading {
    public static void main(String[] args) {

        short a = 600;
        short b = 500;
        System.out.println("Sum: " + calculate(6,4));
        System.out.println("Sum: " + calculate(6.3,2.7));
        System.out.println("Sum: " + calculate(6.3F,2.7F));
        System.out.println("Sum: " + calculate(a,b));

    }

    public static int calculate(int a, int b){
        return a + b;
    }
    public static double calculate(double x, double y){
        return x + y;
    }
    public static float calculate(float x, float y){
        return x + y;
    }
    public static short calculate(short x, short y){
        return (short) (x + y);
    }

}
