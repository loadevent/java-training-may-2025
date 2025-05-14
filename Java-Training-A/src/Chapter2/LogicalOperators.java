package Chapter2;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 15;
        int y = 27;
        int z = 30;
        {
//            //Logical AND (&&)
//            //true AND true = TRUE
//            //true AND false = FALSE
//            //false AND false = FALSE
//            //false AND true = FALSE
//            System.out.println((x == y) && (z >= y));//false
//            System.out.println((x == (z / 2)) && (y <= z));
//            System.out.println(true && (z >= y));
//            System.out.println((z >= y) && ((x >= y) && (z == 17)));//false
//            //true     &&   (false   &&  false)
//            //true     &&       false
        }

//        //Logical OR (||)
//        //true OR true = true
//        //true OR false = true
//        //false OR false = false
//        //false OR true = true
//        System.out.println((x >= y) || (z <= 100));
//        System.out.println((y <= z) || (z >= (x / 2)));//true


        System.out.println(   (x >= y) || ((z == x) && (y > x))   );//false
                            //   false  &&  false   ||  true
                            //   false  &&         true


    }
}
