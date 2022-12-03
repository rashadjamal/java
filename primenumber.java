import java.util.Scanner;
class primenumber
{
	public static void main(String args[])
	{
		int n,count=0,;
		System.out.println("enter anumber");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if (count==2)
			System.out.println("prime number");
		else
				System.out.println(" not prime number");
	}
}
		