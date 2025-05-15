package Chapter6;

//Method Call Issue:
public class DebugExercise7 {     
   public static void main(String[] args) {         
     printMessage("Hello, World!");     
 }   
   
private static void printMessage(String message) {         
    System.out.println("Message: " + message);         
   // return message;
  }  
}