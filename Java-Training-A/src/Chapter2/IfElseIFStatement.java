package Chapter2;

public class IfElseIFStatement {
    public static void main(String[] args) {
        int age = 36;

        if (age >= 18){
            //true
            System.out.println("Yes, you can vote");
        }else if(age == 16 || age == 17){
            System.out.println("You are " + age + " years old, so you need to apply for special vote");
        }else{
            System.out.println("No, you cannot vote");
        }

        /*Grade: A+ = 90 - 100 (Outstanding), A = 70 - 89 (Excellent), B = 50 - 69 (Good),
        C = 40 - 49 (Need some work), D < 40 (Fail)
         */
        int testMark = 98;
        String grade = "No grade";
        String results = "No results";

        if (testMark >= 90 && testMark <= 100){
            grade = "A+";
        }else if(testMark >= 70 && testMark <= 89){
            grade = "A";
        }else if(testMark >= 50 && testMark <= 69){
            grade = "B";
        } else if (testMark >= 40 && testMark <= 49) {
            grade = "C";
        }else if(testMark < 40 && testMark >= 0){
            grade = "D";
        }

        if (grade.equals("A+")){
            results = "Outstanding";
        } else if (grade.equals("A")) {
            results = "Excellent";
        } else if (grade.equals("B")) {
            results = "Good";
        } else if (grade.equals("C")) {
            results = "Need some work";
        } else if (grade.equals("D")) {
            results = "Fail";
        }

        System.out.println("Grade: " + grade + " (" + results + ")");
    }
}
