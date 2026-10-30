public class DataTypes {
    static void main() {
        //Primitive data type are the data type that start with lowercase
        int age = 20; //represent a int number
        System.out.println(age);

        double MyDouble = 0.2; //Double is to represent decimal values
        System.out.println(MyDouble);
        //we have more decimal values , they are: float, long and byte

        char myChar1 = 'C';
        char myChar2 = 2; //We use char to save alone values
        System.out.println("Char1 value is the letter: " + myChar1);
        System.out.println("Char2 value is the number: " + myChar2);

        boolean myBoolean = true;
        System.out.println("The boolean value is: " + myBoolean); //Boolean only can have true or false

        //why string starts with UpperCase?....if primitive data types starts with lowercase

        /*in programming, some programmers consider String as primitive data type because is used as primitive datatype
        * but remember that String ISNT primitive data type, String is a class*/
        String myString = "hola mundo";

        /* all the primitive data types has their class, for example we have boolean, but also
        * we have Boolean, and with all the values we have the class*/

        System.out.println(myString.getClass().getSimpleName());
    }
}
