class this2
              {
                     int instVar;
                     this2(int intsVar)
                     {
                          this.instVar=instVar;
                          System.out.println("this reference="+this);
                      }
                       public static void main(String args[])
                        {
	this2 obj=new this2(8);
	System.out.println("object reference="+obj);
                          }
               }

