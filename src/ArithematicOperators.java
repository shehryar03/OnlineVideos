public class ArithematicOperators {
    /* revision 1
    Arithmetic +,-,*,/,%
    Bitwise
    Relational 
    */

    public static void main(String[] args)
    {
        int m=2,n=4;
        //double r1= (double) m/n;
        //int r2 = m%n;
        //n++ // n+=1 and n = n+1;
        /*
        n++ post increment
        ++n pre increment
         */
        m = n++;
        //m = ++n;
        
        n += m; // n = n + m
        n += 3; // n = n + 3
        System.out.print(m); // 4
        System.out.print(n); // 5


    }
}
