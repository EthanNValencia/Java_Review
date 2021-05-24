import org.w3c.dom.ls.LSOutput;

/***
 * #2
 * Review of Java Operators - With Archibald (https://www.youtube.com/watch?v=C2kzzIs-GMU)
 */
public class Java_Operators {


    /*
    Arithmetic Operators are:
    + - * / %

    Comparators/Relational Operators are:
    > < >= <= == !=

    Logical Operators are:
    && & || | ! ^

    Bitwise Operators are:
    >> >>> << ~

    Pre and Post Assignments are:
    ++ --

    Combined Assignments are:
    += -= *= %= /=

    Unary Operators are: (these are in the Java language, but they do nothing)
    + -

    Cast Operators are:
    (type) (int) (double)
    */
    public static void main(String[] args){
        System.out.println(15|8);
        System.out.println(+45); // does nothing

        int a = 10, b = 6, c = a/b;
        System.out.println(c);
        double dbl = 1.5;

        // Arithmetic Operators do not work on bytes. A down cast is necessary.
        byte b1 = 10, b2 = 5, b3;
        b3 = (byte)(b1 + b2); // it looks weird, but it works. The addition was done in int.
        System.out.println(b3);
        b3++;
        System.out.println(b3);

        /*
        int, long, float, and double all do arithmetic operations differently.
        EX: doing division in float is different from doing division in double.
        */

        /*
        Booleans are either true or false.
        */
        boolean result = 10 > 30;
        System.out.println("Result is: " + result);
        result = 10 <= 30;
        System.out.println("Result is: " + result);

        result = true & ++a > 11;
        System.out.println("Result is: " + result);

        result = !(10 > 34) && true; // not operator, !false is true. True and true is true.
        System.out.println("Result is: " + result);
    }
}
