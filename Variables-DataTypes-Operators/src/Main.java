
public class Main {
    public static void main(String[] args) {
        // Variables - Declare, assign, initialize
        int myVar;
        myVar = 50;
        System.out.println(myVar);;

        int anotherVar = 100; 
        System.out.println(anotherVar);

        // Final - modifer for a variable that cannot be changed
        final int maxStudents = 25;
        final int someVariable;
        someVariable = maxStudents;

        // Primitive Data Types - types built into the language
        // Primitive types are stored by value. They are treated independly in memory
        byte myByteMin = -128;
        byte myByteMax = 127;
        short myShortMin = -32768;
        short myShortMax = 32767;
        int myIntMin = -2147483648;
        int myIntMax = 2147483647;
        long myLongMin = -9223372036854775808L; // Must use suffix "L" for long types
        long myLongMax = 9223372036854775807L; // Must use suffix "L" for long types
        float myfloat = 42.195f; // Must use "f" for the floating literal
        double myDouble = -213.70708089689d; // Must use "d" for the double literal
        char myChar = 'D'; // Char types must be in single quotes. 
        char myUnicodeChar = '\u00DA'; // Char types can represent a unicode character by using backslash u followed by 4-digit hex value
        boolean myBool = true; // Only uses true or false keywords

        //////      Arithmetic Operators
        // Basic operators (+ - * / %)
        int someValue = 5;
        int someSecondValue = 5;

        // Prefix Operators (++ or -- before variable) - Performs operation first then reads the value
        System.out.println(++someValue);
        System.out.println(someValue);
                    
        // Postfix Operators (++ or -- after variable) - Reads the value first then performs the operation
        System.out.println(someSecondValue++);
        System.out.println();
        
        // Compound Operators - performs and assign to the variable on the left (+= -= *= /= %=)
        int myValue = 50;
        myValue += 13;
        System.out.println(myValue);

        // Operator Precedence
            // Operators are evaluated left to right 
            // Operations insid () take precedence
            // Operators in () are evaluated inside to out
        int valA = 21;
        int valB = 6; 
        int valC = 3;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);

        //////  Type Conversion
        float floatVal = 1.0f; 
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;
        
        // Implicit type conversion - automatically performed by the compiler
        short convertResult1 = byteVal; // Widening conversions work with no issue
            //short convertResult2 = longVal; // Shortening conversions will fail    

        // Explicit conversion - performed in code using cast operator
        short convertResult2 = (short)longVal; // Cast must be used to shorten a conversion
        short convertResult3 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;

        System.out.println("success");
    }
}