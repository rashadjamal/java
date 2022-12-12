class swap	
	{
	public static void main(String args[])
		{
		System.out.println("before swapping");
		int x=10;
                     int y=20;
		System.out.println("values of x :"+x);
		System.out.println("the value of y: "+y);
		System.out.println("After swapping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("values of x:"+x);
		System.out.println("values of y:"+y);
		}
	}	
