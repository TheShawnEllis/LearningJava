public class Main 
{
    public static void main(String[] args) 
    {
        double[] leftVals = {100.0d, 40.0d, 50.0d, 25.0d };
        double[] rightVals = {31.0d, 22.0d, 12.0d, 5.0d };
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++)
        {
            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
        }
            
        for(double answer : results)
            System.out.println(answer);
    }

    static double execute(char opCode, double leftVal, double rightVal)
    {
        double result;

        switch(opCode)
        {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = (rightVal != 0) ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            break;
        }    
        return result;
    }
}