            import java.util.Scanner;
           public  class digit
	 {
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Digit sum and product");
			System.out.println("Enter the number ");
			int number =in.nextInt();
			int remainder ,sum=0;
			int product=1;
			for(int temp=number;temp!=0;temp=temp/10)
			{
				remainder=temp%10;
				sum=sum+remainder;
				product=product*remainder;
			}
			System.out.println("sum of digit of number "+number+": "+sum);
			System.out.println("product of digit of number "+number+":"+product);
		}
	} 
