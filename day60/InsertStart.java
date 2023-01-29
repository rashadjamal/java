public class InsertStart {  
  
   
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
  
    
    public void addAtStart(int data) {  
       
        Node newNode = new Node(data);  
  
         
        if(head == null) {  
           
            head = newNode;  
            tail = newNode;  
        }  
        else {  
          
            Node temp = head;  
            
            head = newNode;  
 
            head.next = temp;  
        }  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        InsertStart sList = new InsertStart();  
  
        //Adding 1 to the list  
        sList.addAtStart(1);  
        sList.display();  
  
        //Adding 2 to the list  
        sList.addAtStart(2);  
        sList.display();  
  
        //Adding 3 to the list  
        sList.addAtStart(3);  
        sList.display();  
  
        //Adding 4 to the list  
        sList.addAtStart(4);  
        sList.display();  
    }  
}  