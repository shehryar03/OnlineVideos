public class FirstCode {
    public static void main(String args[])
    {
     long l = 50000000000l; // 8 bytes we have to mention l in the end of the number
     short num3 = 5; // 2 bytes -> 16 bits -32768 to 32768
     byte b = 1; // 1 bytes -> 8 bits -128 to 127
     int num1 = 5; // 4 bytes -> 32bits
     int num5 = 50_000; // we can put underscore between the numbers consider as commas
     double num2 = 5.5;
     double INTTRY= 5; // 8 bytes it can store int but will return 5.0 as double stores decimal values
     float f = 10.5f; // 4 bytes have to mention f in the end.
     int doubletry  = (int)5.6; // This is called type casting we don't need .6 Also called Explicit conversions
     num1 = 8;
     char c = 'A';
     c = 66; // American Standard code for information interchange. output of 66 will be B.
     //System.out.print(num1);
     //System.out.print(num2);
     System.out.print(l);
    }
}
