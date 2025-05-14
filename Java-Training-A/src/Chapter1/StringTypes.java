package Chapter1;

public class StringTypes {
    public static void main(String[] args) {
        //declare
        String sentance;
        //assign
        sentance = "Today is Monday";
                  //T o d a y    i s   M  o  n  d  a  y
                  //0 1 2 3 4 5 6  7 8 9 10 11 12 13 14

        System.out.println("The length: " + sentance.length());
        System.out.println(sentance.toUpperCase());
        System.out.println("'y' is found at position: " + sentance.indexOf("y"));
        System.out.println(sentance.charAt(4));
        System.out.println(sentance.indexOf("o",8));
        System.out.println(sentance.equals("Yes, it is"));
        System.out.println(sentance.equals("today is Monday"));
        System.out.println("-------------------------");
        System.out.println(sentance.equalsIgnoreCase("today Is moNdaY"));

    }
}
