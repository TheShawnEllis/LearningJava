public class Main {
    public static void main(String[] args) throws Exception {
        ////// Logical Operators //////
        // Evaluates both sides of the expression
        // & (And) : Both must be true (true & true)
        // | (Or) : One or both must be true (false | true, true | false, true|true)
        // ^ (Xor) : Only one can be true (false ^ true, true ^ false)
        // ! (Negate) : Reverses true (false)

        ////// Conditional Logic //////
        // Only evalutes the right when needed
        // && - executes the right only when left is true becuase both needs to be true
        ////// (true && true)
        // || - executes the right only when left is false (false || true, true || ----)

        int students = 150;
        int rooms = 4;

        if (students / rooms > 30)
            System.out.println("Its croweded");

        rooms = 0;
        if (rooms != 0 && students / rooms > 30)
            System.out.println("No body in here!!");

        ////// Block Statements //////
        // Variables and code that are in a block only can be read by code in the block
        double newStudents = 30.0d, totalRooms = 4.0d;
        if(rooms > 0.0d) 
        {
            System.out.println(newStudents);
            System.out.println(totalRooms);
            double avg = newStudents / totalRooms;
            System.out.println(avg);
        }
    }
}
