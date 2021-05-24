/***
 * #3
 * Review of Control Structures - With Archibald (https://www.youtube.com/watch?v=GCV3l0rXEME)
 */
public class Java_Control_Structures {
    // Selection: if else, switch, ? : (conditional operator)
    // Repetition: for, do while, while, enhanced for loop

    public static void main(String[] args){
        int a = 10, b = 6, c;


        /*
        Conditional operator looks kind of weird.
        The syntax is: (if true) ? do this : else do this
                        a > b    ?     5   :     35
        */
        c = a > b ? 23 : a / b;
        System.out.println(c);
        System.out.println(a > b ? 5 : 35); // this evaluates to a int 5
        System.out.println(a > b ? 5 : 35.5); // this evaluates to a double 5.0

        /*
        Always use proper indentation. Always use { }.
        */
        if (a > b){
            a = 10;
        } else {
            System.out.println("else");
        }

        switch (a % 2){
            case 0:
                System.out.println("It is a 0");
                break;
            case 1:
                System.out.println("It is a 1");
                break;
            default:
                System.out.println("Not 1 or 2");
                break;
        }

        switch("Colin"){
            case "Bob":
                System.out.println("Bob");
                break;
            case "Colin":
                System.out.println("Colin");
                break;
        }
    }
}
