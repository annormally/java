public class Casting {
    public static void main(String[] args) {

        // Widening Casting
        int intToDouble = 4;
        double doubleToInt = intToDouble; // Automatically casting from int to double
        System.out.println(intToDouble);
        System.out.println(doubleToInt);

        // Narrowing casting
        double doubleToInt2 = 5.55f;
        int intToDouble2 = (int) doubleToInt2; // Manual casting from double to int
        System.out.println(doubleToInt2);
        System.out.println(intToDouble2);
    }
}
