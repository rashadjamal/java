           import java.util.*;
           public class palindrome
          {
	public static void main(String agrs[])		
	{
		int num,temp,reverse =0,rightdigit;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		num=in.nextInt();
		temp=num;
		while(temp!=0)
		{
			rightdigit=temp%10;
			reverse=reverse*10+rightdigit;
			temp=temp/10;
		}
		if(reverse==num)
		{
	               	System.out.println(num+"is palindrome");
		}
		else
		{
			System.out.println(num+"is not palindrome number");
		}		
	}
}
