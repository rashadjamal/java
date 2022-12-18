                   interface animaleat
 		{
			void eat();
 }
  interface animaltravel
  {
	                  void travel();
    }
    class animal implements animaleat,animaltravel
     {
	                      public void eat()
			   {
				System.out.println("animal is eating");
			    }
	                        public void travel()
	                          {
 		           		System.out.println("animal is traveling ");
		                 }
	                     }
                               public class multipleinheritance
                                {
	                                 public static void main(String args [])
	                                  {
		                               animal a=new animal();
		                                a.eat();
		                                 a.travel();
	                                      }
                                       }
 
