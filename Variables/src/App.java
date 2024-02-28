public class App {
    public static void main(String[] args) throws Exception {
        /*  There are eight primitive data types in Java, an only one reference type defined by Java:
                Data Type	Size        Description
                byte	    1 byte      Stores whole numbers from -128 to 127
                short	    2 bytes     Stores whole numbers from -32,768 to 32,767
                int	        4 bytes     Stores whole numbers from -2,147,483,648 to 2,147,483,647
                long	    8 bytes     Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                float	    4 bytes     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
                double	    8 bytes     Stores fractional numbers. Sufficient for storing 15 decimal digits
                boolean	    1 bit       Stores true or false values
                char	    2 bytes     Stores a single character/letter or ASCII values
                **String    varies      Reference type that stores a sequence of characters

            Primitive data type specifies the size and type of variable values, and it has no additional methods.
            Refrence data types are defined by the developer except for string, can be null, and has additional methods
         */

        // To declare a variable add the data type and a name
        int x;
        int currentYear;

        // To assign a variable is giving it a value.
        x = 1;
        byte myByte = 12; // Uses less memory than int
        currentYear = 2024;
        
        // Initialization is declaring and assigning a value at one time.
        int myInt = 2005;

        // Printing a variable
        System.out.println("My number is : " + x);

        // Some data types require a suffix when initializing these are called literals
        long myLongNumber = 12345670008474364L; // integer literal
        float myFloatingNumber = 3.14355f; // floating-point literal
        double myPreciseNumber = 3.1435583764789947d;

        boolean myBool = true; // booleans only hold true/false
        char myChar = '#'; // single character wrapped in single quotes

        String myName = "Coding Guy";

        System.out.println("Hello, " + myName);
    }
}
