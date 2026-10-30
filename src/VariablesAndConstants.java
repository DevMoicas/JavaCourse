public class VariablesAndConstants {
    static void main() {
        //Variables are to save information, you can imagine that variable is a box where we will save a value

        //To declare a variable first we should put the data type:
        String name = "Moises"; //in this "Box", we save name, the data type is String (Text), and it always will be text.
        System.out.println("the variable name is equal to: " + name);

        /*We can update the value of the variable, but it should be of the same type, for example
         * if we have name = "Moises", we can change it for other string, for example name = "Alejandro",
         * but if we try to change the value to other data type (example: name = 20;) we will have a error, because
         * the data type is diferent than when we start the variable*/

        name = "Alejandro";
        System.out.println("The new value of name is equal to: " + name);

        //Int data type
        //we use the data type int to save only int numbers

        int age = 21;
        System.out.println("The variable age is equal to: " + age);

        //Constants this value cant change

        final String EMAIL = "correomoises@gmail.com"; //if we want declare a constant, we should use the "final" word at the start, before data type
        //when we declare a constant , is a best practice that the name of it, wil be in UPPERCASE
        System.out.println("The value of the constant EMAIL is: " + EMAIL);

        //In java , we can create variables the diferently, we can use the reserve word "var"

        var year = 2026; /*when we use var, we don't specify data type, because var automatically detect the data type
         */
        System.out.println("The var year is: " + year);
    }
}
