public class App {
    public static void main(String[] args) throws Exception {
        ////// Conditional Logic and Relational Operators //////
        // Relational Operators
            // > Greater than
            // < Less than
            // >= Great than or equal to
            // <= Less than or equal to
            // == Equal to 
            // != Not equal to 

        // Conditional Assignment - returns value based on result of condition
            // result = condition ? tre-value : false-value;
        
        int value1 = 7;
        int value2 = 5;
        int maxValue = (value1 > value2) ? value1 : value2;
        System.out.println(maxValue);

        ////// If-Else Statement //////
        if (value1 > value2)
        {
            System.out.println("Value1 is bigger");
        }
        else
        {
            System.out.println("Value2 is bigger");
        }

        // if-else-if 
        if (value1 > value2) 
        {
            System.out.println("value1 bigger");
        }
        else if (value1 < value2)
        {
            System.out.println("value2 is bigger");
        }
        else System.out.println("Both are equal");
    }
}
