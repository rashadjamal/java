               interface animal1
     {
	              public abstract void moves();
     }
               interface bird
               {
	            void fly();
                }
                 public class interfacedemo implements animal, bird
       {
	              public void moves()
	              {
		           System.out.println("Animals move on land");
	               }

	                   public void fly()
	                   {
		                    System.out.println("Birds fly in air");
	                    }
                              public static void main(String args[])
	                     {
	                	        interfacedemo i=new interfacedemo();
		                   i.moves();
		                   i.fly();
	                        }
                          }
 
