public class Main
{
    public static void main(String[] args)
    {
        ////// While Loops /////
        // While loops check the condition before running the code in its body.
        int someValue = 4;
        int factorial = 1;
        while(someValue > 1)
        {
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);

        ////// Do-While Loop //////
        // Checked at the end of the loop and will always run once.
        int iVal = 5;
        do
        {
            System.out.print(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        }while(iVal < 25);

        ////// For Loop //////
        // Condition is checked at loop start and runs specified amount of instance
        // For loops need an initializer, condition, and counter
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }

    }
}