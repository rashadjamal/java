public class InsertEnd {  
  

    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
  
    public Node head = null;  
    public Node tail = null;  
  
    public void addAtEnd(int data) {  
         
        Node newNode = new Node(data);  
  
     
        if(head == null) {  
          
            head = newNode;  
            tail = newNode;  
        }  
        else {  
 
            tail.next = newNode;  
           
            tail = newNode;  
        }  
    }  
  
  
    public void display() {  
      
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the end of the list: ");  
        while(current != null) {  
            
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        InsertEnd sList = new InsertEnd();  
   
        sList.addAtEnd(1);  
        sList.display();  
  
        
        sList.addAtEnd(2);  
        sList.display();  
  
        
        sList.addAtEnd(3);  
        sList.display();  
  
        
        sList.addAtEnd(4);  
        sList.display();  
    }  
}  