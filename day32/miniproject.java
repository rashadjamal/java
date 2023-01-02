import java.util.Scanner;
public class miniproject
{
   public static void main(String []args)
   {
         Scanner sc=new Scanner(System.in);
		 int myNummber=(int)(Math.random()*100);
		 int userNumber=0;
		 do
		 {
		 
         System.out.println("guess mu number");
		  userNumber=sc.nextInt();
		 if(userNumber == myNummber)
		 {
			 System.out.println("number is correct");
			  break;
		 }
		 else if(userNumber > myNummber)
		 {
			 System.out.println("number is to large");
				 }
           else
		   {
             System.out.println("number is small");
		   }
		 }
        while(userNumber>=0);
			 System.out.println("my number was");
			  System.out.println(myNummber);		
}
} 
	



		