package Chapter1;

import javax.swing.*;

public class UsingDialogBox {
    public static void main(String[] args) {
        //1. declare
        String firstname;
        int age;
        double salary;
        char employeeType;
        String output;

        //2. Assign
        firstname = JOptionPane.showInputDialog("Enter your name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary"));
        employeeType = JOptionPane.showInputDialog("Employee Type (P / C)").charAt(0);

        //3. Use
        //Format the display
        output = "Firstname: " + firstname + "\n"
                + "Age: " + age + "\n"
                + "Salary: " + salary + "\n"
                + "Employee Type: " + employeeType;

        JOptionPane.showMessageDialog(null,output);
    }
}
