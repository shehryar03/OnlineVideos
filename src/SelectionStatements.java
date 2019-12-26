import java.util.Scanner;
public class SelectionStatements {

    public static void main(String[]args){

        /*int n = 0;
        if (n==0)
        {   System.out.print("Nothing");}
        if (n%2==0)
        {   System.out.print("Even");}
        else
        {   System.out.print("Odd");}*/

        int i=9, j=1;
        j=i>7?7:9; // Ternery statement alternate to if else
        System.out.print(j);
       /* 
    	Scanner obj = new Scanner(System.in); // Stream opener object
    	String n = obj.nextLine(); // String input object
    	String convertedToString = n.toString(); // parsing of String obj into string variable
        switch (convertedToString) /// also supports String Interview Question
        {
            case "A":
                System.out.print("A for apple");
                break;
            case "B":
                System.out.print("B for Ball");
                break;
            default:
                System.out.print("Nothing");
        } */
    }
}
