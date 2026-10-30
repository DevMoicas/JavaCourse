public class VariablesAndConstantsExercices {
    static void main() {
        //1. Declare a String with your name
        String myName = "Moises Alejandro Grimaldo Garcia";
        System.out.println(myName.toUpperCase());
        //2. Create a int variable and assign your age
        int myAge = 21;
        System.out.println("i am "+ myAge + " years old");
        //3. Create a double variable and asign your height
        double myHeight = 1.76;
        System.out.println("I consider that i am tall, because my height is "+ myHeight + "cm");
        //4. Declare a constant with your email
        final String MYEMAIL = "emailmoises@gmail.com";
        System.out.println("Send me an email to: " + MYEMAIL);
        //5. Declare a boolean variable that says if you like program
        boolean likeProgramming = true;
        System.out.println("We asked if Moises like programming and he say's" + likeProgramming);
        //6. Create a Char variable and save your initial.
        char myInitial = 'M';
        System.out.println("My name is Moises, and my initial is: " + myInitial);
        //7. Declare a String variable with your locality and after change the value and print again
        String myLocality = "Colima";
        System.out.println("My locality is: " + myLocality);

        myLocality = "Jalisco";
        System.out.println("My new locality is: " + myLocality);
        //8. Create two variables, a and b, and after sum the both
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        //9.Print the data type of two variables created previously
        System.out.println(myLocality.getClass().getSimpleName());
        System.out.println(myName.getClass().getSimpleName());
        //10. Declare a variable without initial , assign a value before print it.
        String csh;

        csh = "dlgp";

        System.out.println(csh);
    }
}
