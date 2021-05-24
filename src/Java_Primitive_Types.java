/***
 * #1
 * Review Java Primitive Types - With Archibald (https://www.youtube.com/watch?v=bPLqGal8_2Y&t=976s)
 */
public class Java_Primitive_Types {

    /***
     * Generic main class for reviewing the 8 primitive types.
     * @param primitives
     */
    public static void main(String[] primitives){

        /*
        Promotion order of primitive data types is: byte, short, int, long, float, and then double.
        It is important to know the order, especially when using mixed type expressions.
        */

        byte b;     // 1 byte   Max values: -2^7 => 2^7-1 OR -128 to 127
        short s;    // 2 bytes  Max values: -2^15 => 2^15-1 OR -32,768 to 32,767
        int i;      // 4 bytes  Max values: -2^31 => 2^31-1 (big numbers)
        long lng;   // 8 bytes  Max values: -2^63 => 2^63-1 (big numbers)

        float fl;   // 4 bytes  Max values: -2^149 => 2^149-1 (big numbers)
        double dbl; // 8 bytes  Max values: -2^1074 => 2^1074-1 (big numbers)

        boolean bool; // 1 bytes
        char ch;      // 2 bytes

        b = 127;
        s = 32567;
        i = 2147483647;

        fl = 2.5F;
        dbl = 3.4;

        /*
        Something to remember about int...
        If there is a 0 proceeded by numbers means that it is an octal number.
        If there is a 0 proceeded by a x that means it is a hexadecimal number.
        */

        i = 013;
        System.out.println("i = 013; is " + i);
        i = 017;
        System.out.println("i = 017; is " + i);
        i = 0xA04; // hex number
        System.out.println("i = 0xA04; is " + i);
        i = 0b1001;
        System.out.println("i = 0b1001; is " + i);

        /*
        What to put in a long.
        A long can be a good deal bigger than an int, but if it is larger than an int then it will
        require the addition of an L at the end of the number.
        */
        lng = 1235678901020504023L;

        // max_Min();
    }

    /***
     * This is a cool little method that returns the final min and max values associated with their object types.
     */
    public static void max_Min(){
        System.out.println("-- Integer Datatype values --");
        System.out.println("Min = " + Integer.MIN_VALUE);
        System.out.println("Max = " + Integer.MAX_VALUE);

        System.out.println("-- Float Datatype values --");
        System.out.println("Min = " + Float.MIN_VALUE);
        System.out.println("Max = " + Float.MAX_VALUE);

        System.out.println("-- Double Datatype values --");
        System.out.println("Min = " + Double.MIN_VALUE);
        System.out.println("Max = " + Double.MAX_VALUE);

        System.out.println("-- Byte Datatype values --");
        System.out.println("Min = " + Byte.MIN_VALUE);
        System.out.println("Max = " + Byte.MAX_VALUE);

        System.out.println("-- Short Datatype values --");
        System.out.println("Min = " + Short.MIN_VALUE);
        System.out.println("Max = " + Short.MAX_VALUE);
    }
}
