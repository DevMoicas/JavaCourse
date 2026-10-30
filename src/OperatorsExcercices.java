public class OperatorsExcercices {
    static void main() {
        //1. Create a variable with the result of each aritmetic operation
        int aA = 10;
        int aB = 5;

        System.out.println(aA + aB);
        System.out.println(aA - aB);
        System.out.println(aA * aB);
        System.out.println(aA / aB);
        System.out.println(aA % aB);
        //2. Create a variable for each type of asignation operation
        int number = 10;

        number += 20;
        System.out.println(number); //print 30

        number -= 5;
        System.out.println(number); //print 25

        number *= 2;
        System.out.println(number); //Print 50

        number /= 5;
        System.out.println(number); //print 10
        //3. Print 3 true comparations with diferents Operators of comparation
        System.out.println(true == true);
        System.out.println(5 != 10);
        System.out.println(10 < 20);
        //4. Print 3 false comparations with diferents Operators of comparation
        System.out.println(false == true);
        System.out.println(5 != 5);
        System.out.println(10 > 100);
        //5. Use the operator And
        System.out.println(10 == 10 && 20 == 20); //true
        //6. Use the operator or.
        System.out.println(2000 < 10 || 10 == 10);
        //7. Combine both logic operators
        System.out.println(((1000 < 3) && (50 < 100)) && ((10 == 10) && (20 >1)));
        //8. add a negation
        System.out.println(((1000 < 3) && (50 < 100)) && (!(10 == 10) && (20 >1)));
        //9. print 3 examples of unary operators
        int exampleOne = 10;

        exampleOne =+ 10;
        System.out.println("The result will be ten , and the result is: " + exampleOne); //print 10 because first equal and after sum but not save the new valuee
        if(exampleOne == 10) {
            System.out.println("The result in the first example is correct");
        } else {
            System.out.println(("Bad result in the first example, check the symbols"));
        }
        exampleOne += 20;
        System.out.println("The result will be thirty , and the result is: " + exampleOne);//print 30 first sum and after save the value
        if(exampleOne == 30) {
            System.out.println("The result in the second example is correct");
        } else {
            System.out.println("The result in the second example is bad, check the symbols");
        }


        int exampleTwo = 10;

        for(int i = 0; i < exampleTwo; i++) {
            System.out.println(i);
        }

        int exampleThree = 9;

        exampleThree -= 1;
        System.out.println(exampleThree);
        //10.Combine aritmetic operators, comparation and logics


    }
}
