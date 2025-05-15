package Chapter6;

//Scope Issue:
public class DebugExercise10 {     
   public static void main(String[] args) {         
      int x = 10;         
      if (x > 5) {             
      int y = x * 2;         
  }         
    System.out.println("Y: " + y);
 } 
}