public class public class CountNodes1 {    
.    
        public class Node{    
            int data;    
            Node next;    
            public Node(int data) {    
                this.data = data;    
            }    
        }    
            
        public int count;    
           
        public Node head = null;    
        public Node tail = null;    
            
         
        public void add(int data){    
            //Create new node    
            Node newNode = new Node(data);    
            //Checks if the list is empty.    
            if(head == null) {    
                    
                head = newNode;    
                tail = newNode;    
                newNode.next = head;    
            }    
            else {    
                //tail will point to new node.    
                tail.next = newNode;    
                //New node will become new tail.    
                tail = newNode;    
           .    
                tail.next = head;    
            }    
        }    
            
   
        public void countNodes() {    
            Node current = head;    
            do{    
                //Increment the count variable by 1 for each node    
                count++;    
                current = current.next;    
            }while(current != head);    
            System.out.println("Count of nodes present in circular linked list: "+count);    
        }    
            
        public static void main(String[] args) {    
            CountNodes cl = new CountNodes();    
            cl.add(1);    
            cl.add(2);    
            cl.add(4);    
            cl.add(1);    
            cl.add(2);    
            cl.add(3);    
             
            cl.countNodes();    
        }    
}    CreateList {  
  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    
    public Node head = null;  
    public Node tail = null;  
    
    public void add(int data){  
      
        Node newNode = new Node(data);  
        
        if(head == null) {  
      
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
    
            tail.next = newNode;  
   .  
            tail = newNode;  
         
            tail.next = head;  
        }  
    }  
  
    
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
        CreateList cl = new CreateList();  
         
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
       
        cl.display();  
    }  
}  