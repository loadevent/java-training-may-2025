package Chapter4;

import javax.swing.*;
import java.util.Scanner;

/*A method should be created inside the class.
* You cannot create a method inside another method*/
public class VoidMethods {
    public static void main(String[] args) {
        displayHeading();//method call

        displayOutro();

    }
    //access modifier return type method name()
    public static void displayHeading(){
        System.out.println("\n" +
                "=====Welcome To iLAB Java Training=======\n" +
                "-------------------------------------------");
    }

    //(private) Only accessible withing the class
    private static void displayOutro(){
        System.err.println("\n" +
                "===== Thank You for using our system =======\n" +
                "--------------------------------------------");
    }


}
