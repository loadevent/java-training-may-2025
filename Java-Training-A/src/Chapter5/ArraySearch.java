package Chapter5;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        String[] arHobbies = {"Soccer", "Tennis", "Golf", "Hiking", "Chess", "Hockey"};//6 elements
        Scanner sc = new Scanner(System.in);
        String strSearch;
        int position = -1;

        System.out.print("Enter the hobby you would like to search for: ");
        strSearch = sc.next();//Rugby

        for (int i = 0; i < arHobbies.length; i++) {
            if (arHobbies[i].equalsIgnoreCase(strSearch)){//
                position = i;//
            }
        }

        if (position == -1){
            System.out.println(strSearch + " is not found");
        }else {
            System.out.println(strSearch + " is found at position " + position);
        }
    }
}
