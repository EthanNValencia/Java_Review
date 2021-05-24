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

        int a = 10, b = 6;
        double dbl = 1.5;
    }
}
