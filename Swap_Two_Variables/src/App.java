public class App {
    public static void main(String[] args) throws Exception {
        // Lesson: Using knowledge of variable swap the values of two variables
        
        String x = "water";
        String y = "soda";

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // To swap variables create a temp variable to hold one value of x or y
        String temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
