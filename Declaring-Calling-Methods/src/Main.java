public class Main {
    public static void main(String[] args)
    {
        ////// Methods //////
        // Used for creating resuable and organized code. 
        // Can receive and return data. 
        // returnType name(typedParameterList)
        // Methods must be declared outside the main class!!!
        
        ShowSum(7.5f, 1.4f, 0);
        System.out.println("Back from ShowSum");

    }

    static void ShowSum(float x, float y, int count)
    {
        if(count < 1)
            return;

        float sum = x + y;
        for(int i = 0; i < count; i++)
            System.out.println(sum);
        
        return;
    }

}
