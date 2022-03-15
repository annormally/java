public class Variables {
    public static void main(String[] args) {

        /**
         * Declaring(Creating) Variables
         * type variableName = value;
         */

        String name = "Annormally";
        System.out.println(name);

        int number = 15;
        System.out.println("Number: " + number);

        // Change number from 15 to 25
        int number2 = 15;
        number2 = 25;
        System.out.println("Number 2: " + number2);

        /**
         * Final Variables
         */

        final int number3 = 15;
        // number3 = 30; will generate an error => cannot assign a value to a final variable

        /**
         * Other types
         */

        int number4 = 13;
        float floatNumber = 9.88f;
        char charText = 'A';
        boolean trueOrFalse = false;
        String stringText = "Hello";

        /**
         * Display Variables
         */

        String nameString = "Annormally";
        System.out.println("Hello " + nameString);

        String firstString = "Hello ";
        String secondString = "World";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);

        // The + character works as a mathematical operator.
        int firstNumber = 5;
        int secondNumber = 5;
        System.out.println(firstNumber + secondNumber);

        /**
         * Declare Many Variables
         */

        int x = 1, y = 2, z = 10;
        System.out.println(x + y + z);

        /**
         * Java Identifiers
         */

        // Good
        int minutes = 60;

        // ok, but not so easy to understand what m actually is
        int m = 60;
    }
}
