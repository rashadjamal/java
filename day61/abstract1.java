                  abstract class abstract1
                  {
	             abstract void run();
                   }
                   class honda extends abstract1
                   {
	                 void run()
	                 {
		             System.out.println("running safely");
		        }
		         public static void main(String [] args)
	                  {
		             abstract1 obj=new honda();
		             obj.run();
	                   }
		}
