              import java.util.*;
              public class febonacci
             {
	        public static void main(String args[])
	        {
	               Scanner sc=new Scanner(System.in);
		int t1=0,t2=1;
		System.out.println("Enter the number of term");
		int n=sc.nextInt();
		System.out.println("First"+n+"term of fibonaci series:");
		for(int i=0;i<n;i++)
		{
		        System.out.println(t1+"");
		         int sum=t1+t2;
		          t1=t2;
		          t2=sum;
		}
	     }
	}