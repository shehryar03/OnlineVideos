public class Iteration {
    public static void main(String[] args)
    {
//     /// for loop used for fixed iterations
//    /// FOR LOOP ///
//    for (int a=0;a<6;a++)
//    {
//    	System.out.println("Ich liebe dich");
//    }
//    
//   /// WHILE LOOP ///
//   int x = 0;
//   while(x<=7)
//   {
//	   System.out.println("Mehr");
//	   x++;
//   }
//   
//   //// DO WHILE ///
//   int y = 0;
//   do
//   {
//	   System.out.println("WHILE LOOP");
//	   y++;
//   } while(y<=6);
   
   /// FOR EACH LOOP ///
   int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
   for(int arraycounter[] : array)
   { for(int counter : arraycounter) 
   {
	   System.out.print(" "+ counter);
   }
   System.out.println();
   }
}
}