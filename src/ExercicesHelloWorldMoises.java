import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ExercicesHelloWorldMoises {
    static void main()throws IOException {
        //1. Print a message with your name
        System.out.println("Moises Grimaldo"); //this is a print of my name
        //2. Print two lines: "Hello and after "Mundo" using only one print
        System.out.println("Hello \n World");  //Using \n we can do a line jump using the same println
        //3. Add a comment in each program line
        System.out.println("Comments in each program line done");
        //4. Create a comment with a lot of lines
        System.out.println("Comment with a lot lines:");
        /*this a example
        * the comment using a lot of lines
        * we use this type of comments when we want describe some large thing, opinion,etc*/


        //5. Print your age, favorite color and country
        System.out.println("Information about me:");
        System.out.println("I am 21 years old, but my birthday is in December 1");
        System.out.println("My favorite color is electric blue,althoug my car is white");
        System.out.println("I am from Mexico City");

        //6. Explote the diferents System.XXX.println() beyond out
        System.out.println("This is an example of System.out.println(sout)");
        System.err.println("This is a System.err.println (err message)"); //error always will show in the final of the execution
       //System.in

        /*When we want use System.in, we should put in the file top the following import:
        * import java.util.Scanner;
        * System.in is for receive information from the final user, for example if you want some information about him.
        * firs we should create the object scanner, for example:*/
        Scanner personalInformation = new Scanner(System.in);
        System.out.println("Print your age: ");
        int age = personalInformation.nextInt(); //next int read a number and int age is a variable where we will save the user input.

        System.out.println("You are " + age + " years old");

        /* is a best practice use Scanner when we want save small information, but imagine that we want process all the
        * translation from youtube video.....there is a lot of text and if we use Scanner, the reader will be slow,
        * for that we have Buffer, we use Buffer if we will proccess big information or big text, now i will present  a buffer example: */

        BufferedReader song = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write your favorite lyric song: ");
        String lyricSong = song.readLine();

        System.out.println("Your favorite lyric song is: " + lyricSong); //Important: this format was created with a readline, if we put a text with more than 1 line, the system only print the first line

        //7. Use a lot of println to print one sentence
        System.out.println("if you can imagine");
        System.out.println("You can");
        System.out.println("Develop it, and remember that technology is the future");
        System.out.println("And future is today");
        //8. Print ASCII design (For example a happy face using keyboard chracters)
        System.out.println("Stairs ASCIII");
        System.out.println("|           |");
        System.out.println("_____________");
        System.out.println("|             |");
        System.out.println("_________________");
        //9. Try run the program without main

        //10. Try change the file name using a diferent name of the class and compile.
        //the name is changed automatically
    }
}
