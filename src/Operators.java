public class Operators {
    static void main() {
        //Operators

        //Aritmetic operators
        var a = 5;
        var b = 3;
        System.out.println("The sum is: " + (a + b));
        System.out.println("The rest is: " + (a - b));
        System.out.println("The multiplication is: " + (a * b));
        System.out.println("The division is: " + (a / b));
        System.out.println("The module is: " + (a % b));

        //Asignation to assgin values in the variables

        a = b; //the assignation value is "="
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1;  //this is to sum and assign, in this case we take the a value and sum 1, for that the result will be 7
        System.out.println(a); //equal to put a = a + 1, the short form is a += 1

        a -= 1;
        System.out.println(a);

        a *= 1;
        System.out.println(a);

        a /= 1;
        System.out.println(a);

        a %= 1;
        System.out.println(a);

        //Compare operators
        System.out.println(a == b); //return true or false, because we are asking if a is equal that b
        System.out.println(a == 0);

        // we use != to know if the values are diferent
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        //logic operators to combine booleans expresions.

        // && And
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // || (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // ! (NOT)
        System.out.println(!true);
        System.out.println(!false);

        //Unary Operators
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(--b);
    }
}
