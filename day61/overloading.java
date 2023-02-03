	             class animal
             {
	         public void dispay()
	         {
		      System.out.println("I am an animal");
	         }
             }
             class dog extends animal	
             {
	         public void display()
	        {
		     System.out.println("I am a dog");
	        }
             }
             class overrideq 
           {
	     public static void main(String args[])
	     {
		dog d1=new dog();
		d1.display();
	     }	
           }

