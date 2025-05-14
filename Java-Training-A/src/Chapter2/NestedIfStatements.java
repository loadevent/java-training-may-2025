package Chapter2;
/*A student has to submit 2 assignments. They can only
submit assignment 1 if the score >= 55 on the test. They can only
submit assignment 2 if they score >= 60 on assignment 1
 */
public class NestedIfStatements {
    public static void main(String[] args) {
        int testScore = 72;
        int assignment1 = 70;
        int assignment2 = 49;

        if (testScore >= 55){// 1
            //true
            if (assignment1 >= 60){//2
                //true
                if (assignment2 >= 60) {//3
                    //true
                    System.out.println("You passed the module (A)");//A
                } else{
                    //false
                    if (assignment2 >= 45 && assignment2 < 60){
                        System.out.println("You have been promoted (B)");//B
                    }else{
                        System.out.println("Sorry. You failed assignment 2 (C)");//C
                    }
                }
            }else{
                System.out.println("You failed assignment 1 (D)");//D
            }
        }else{
            System.out.println("You failed the test (E)");//E
        }
    }
}
