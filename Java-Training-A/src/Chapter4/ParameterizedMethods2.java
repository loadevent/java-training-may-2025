package Chapter4;

import javax.swing.*;

public class ParameterizedMethods2 {
    public static void main(String[] args) {

        displayMessage("Hello, welcome to Java training");
        displayDetails("Mike", "Smith",36,false);

    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public static void displayDetails(String firstname, String lastname, int age, boolean isEmployed){
        String strIsEmployed;

        if (isEmployed){
            strIsEmployed = "Yes, employed";
        }else{
            strIsEmployed = "Not employed";
        }

        System.out.println("Full name: " + firstname + " " + lastname + "\n" +
                "Age: " + age + "\n" +
                "Employed? " + strIsEmployed);
    }
}
