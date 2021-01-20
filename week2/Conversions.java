/*
Name
 */
public class Conversions {
    public static void main(String[] args) {
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // https://www.w3schools.com/java/java_type_casting.asp
        // implicit casting / widening


        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


        // explicit casting // narrowing

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9



        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Converting instead of casting
        // You can use valueOf
        // huh?
        int myInt3 = 9;
        double myDouble3 = Double.valueOf(myInt3);

        System.out.println(myInt3);      // Outputs 9
        System.out.println(myDouble3);   // Outputs 9.0


        String myString4 = "9";
        int myInt4 = 9;
        double myDouble4 = Double.valueOf(myInt4);
        double myStringDouble4 = Double.valueOf(myString4);

        // The following does NOT work
        // double mySS = (double)myString4 ;

        System.out.println(myInt4);      // Outputs 9
        System.out.println(myDouble4);   // Outputs 9.0
        System.out.println(myStringDouble4);   // Outputs 9.0


        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // https://stackoverflow.com/questions/10577610/what-is-the-difference-between-double-parsedoublestring-and-double-valueofstr?lq=1
        // Even more... yikes
        // You can use parse
        String myString5 = "9";
        double myStringDouble5 = Double.parseDouble(myString5);

        System.out.println(myString5);
        System.out.println(myStringDouble5);
    }


}
