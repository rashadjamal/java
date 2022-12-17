              class NoMoneyException extends Exception
              {
                     public NoMoneyException(String msg)
                     {
                            super(msg);
                     }
               }   
                class Bank1
                 {
                         public static void main(String[] args) throws NoMoneyException
                         {
                                  int balance=500,withdrawlAmount=1000;
                                  if(balance<withdrawlAmount)
                                  throw new NoMoneyException("Sorry,Insufficient Balance");
                        }
               }

