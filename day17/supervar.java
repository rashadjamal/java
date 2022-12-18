
                 class supervar
                 {
	             int x=10;
                  }
                  public class demo1 extends supervar
                  {
	             int x=20;
                   	    public void display()
	              {
		           System.out.println(x);
		            System.out.println(super.x);
		            System.out.println(x+super.x);
	                }
                           public static void main(String args[])
	                  {
		                 demo1 d=new demo1();
		                  d.display();
	                       }
	                 }
