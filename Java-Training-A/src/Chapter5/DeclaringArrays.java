package Chapter5;
/*An array is a variable that can store multiple
* values of the same data type */
public class DeclaringArrays {
    public static void main(String[] args) {
        int myNumber;
        //declare array with initial values
        int[] arNumbers = {41, 52, 7, 9, 12};//5 elements
        String[] arHobbies = {"Soccer", "Tennis", "Golf"};//3 elements
        double[] arPrices = {12.59, 50.00, 45.90, 17,49};//4 elements

        //declare an empty array
        int[] arEvenNumbers = new int[5];//14, 6, 22, 36, 48
                                        //0    1   2  3   4
        String[] arNames = new String[3];
        /*2. Assign values to array
        Each element should be stored in a position specified by
        an index
         */
        arEvenNumbers[3] = 36;
        arEvenNumbers[2] = 22;
        arEvenNumbers[0] = 14;
        arEvenNumbers[4] = 48;
        arEvenNumbers[1] = 6;
        /*3. Use / Access array elements
        To access array elements, you need to specify the
        position of the element
         */
        //Length = 5                    5
        for (int i = 0; i <= arEvenNumbers.length - 1 ; i++) {
            System.out.print(arEvenNumbers[i] + " ");//14, 6, 22, 36, 48
        }

    }
}
