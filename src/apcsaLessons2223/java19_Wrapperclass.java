package apcsaLessons2223;

public class java19_Wrapperclass {
    public static void main(String[] args) {
/*
 // WRAPPER CLASS
 wrapper class is dedicated to its primitives (int byte long short boolean double)
 wrapper class names starts with capital letter
 every primitive has its own wrapper class
 wrapper class is different then primitives since they are objects.

   PRIMITTIVES(default values)                           WRAPPER CLASS(default names)
   byte       0                                           byte           all null
   short      0.0                                         short
   long       0                                           long
   float      0                                           float
   double     0                                           double
   boolean    false                                       boolean
   char       ` `                                         char
 */

        // boxing and autoboxing
        // if you convert primitive to wrapper it is autoboxing/boxin
        int a = 3;
        Integer b = a;

        // Unboxing
        // if you assign/convert wrapper to primitive it is unboxing
        Character c = 'A';
        char c2 = c; // unboxing

        // you can convert a double to an intger but yo cannot convert a duble to inrger

        int d = 3;
        double e = d;

        Integer f = 3;
        //Double g =f;

        // WRAPPER CLASS METHODS
        int maxNumberOfGivenTwoInt = Integer.max(3,6);
        int maxNumberOfIntClass = Integer.MAX_VALUE;
        System.out.println(maxNumberOfIntClass);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        String str = "123";
        int number = 123;

        System.out.println(Integer.toString(123));
        System.out.println(Integer.valueOf(str)+123);
        System.out.println(String.valueOf(123));
        double p = 3.9;
        double k = (int)p;
        System.out.println(k);
        System.out.println(k);
    }
}
