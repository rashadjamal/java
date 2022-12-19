               class test
               {
	           public void display()
	           {
		           System.out.println("welcome - 1");
	            }
	             public final void show()
	             {
		            System.out.println("welcome - 2");
	              }
                  }
                  public class finalmethod extends test
                  {
	               public void display()
	         {
		       System.out.println("Fine");
	           }
	           public static void main(String args[])
	            {
		          Finalmethod f= new finalmethod();
		          f.display();
	           	f.show();
	               }
                   }

 
