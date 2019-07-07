public class FirstCode {
    public static void main(String args[])
    {

     long l = 50000000000l; // 8 bytes
     short num3 = 5; // 2 bytes -> 16 bits -32768 to 32768
     int num1 = 5; // 4 bytes -> 32bits
     double num2 = 5.5;
     double INTTRY= 5; // it can store int but will return 5.0 as double stores decimal values
     int DOUBLETRY  = (int)5.6; // This is called type casting we don't need .6 Also called Explicit conversions

     num1 = 8;
     //System.out.print(num1);
     //System.out.print(num2);
     System.out.print(l);
    }
}
