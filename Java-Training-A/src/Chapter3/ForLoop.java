package Chapter3;
/*For Loop is used when the number of
iterations is known
 */
public class ForLoop {
    public static void main(String[] args) {
        //Display Tuesday 4 times

        for(int x = 1;x < 5;++x){
            System.out.println(x + " - Tuesday");//1
        }

        System.out.println("-----------------------------------");
        //Display numbers from 10 to 1
        for (int i = 10; i >= 1 ; i--) {
            System.out.print(i + "  ");//10, 9, 8 ..... 2, 1
        }

        System.out.println("\n=====================================");
        //For loop with multiple conditions
        /* i        x
          1         5
          2         6
          3         7
          4         8
          5         9
          6         10
        * */

        int i, x;
        for (i = 1, x = 5;   i <= 5 || x <= 7;   i++, x++) {
            System.out.println("Java");//1,2,3,4,5
        }
        System.out.println("i = " + i);
        System.out.println("x = " + x);

        System.out.println("===================================");
        //Increment with more than one

        for (int j = 1; j <= 10 ; j += 2) {
            System.out.print(j + "  ");//1, 3, 5, 7, 9,
        }


    }
}
