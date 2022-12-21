              public class TestThrowAndThrows  
              {    
                     static void method() throws ArithmeticException  
                      {  
                             System.out.println("Inside the method()");  
                             throw new ArithmeticException("throwing ArithmeticException");  
                       }  
      
                        public static void main(String args[])  
                         {  
                               try  
                                  {  
                                          method();  
                                    }  
                                    catch(ArithmeticException e)  
                                    {  
                                                System.out.println("caught in main() method");  
                                      }  
                                }  
                           }  

 
