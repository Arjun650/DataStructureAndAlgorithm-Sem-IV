
class LL{
    Node head;
    Node tail;  
    class Node{
        int data;
        Node next; 

        Node(int data){
            this.data = data; 
            this.next = null ; 
        }
    }

    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            tail = newNode; 
            return;
        }
            newNode.next = head; 
            head = newNode; 
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null ){
            head = newNode; 
            tail = newNode; 
            return;
        }
        Node curNode = head; 
        while(curNode.next != null){
            curNode = curNode.next; 
        }
        curNode.next = newNode;
        tail = newNode;  
    }
    public void addAfter(int data , int after){
        Node newNode = new Node(data);  
        Node curNode = head; 
        if(head == null ){
            head = newNode; 
            tail = newNode; 
            return;
        }
        while( curNode != null && curNode.data != after ){
            curNode = curNode.next; 
        }
        newNode.next = curNode.next; 
        curNode.next = newNode; 
        if(newNode.next == null){
            tail = newNode; 
        }
    }

    public void addBefore(int data , int before){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            tail = newNode; 
        }
        Node curNode = head; 
        Node prevNode = null ; 
        if( before == head.data ){
            // head = newNode; 
            newNode.next = curNode; 
            head = newNode;
            return; 

        }
        while (curNode != null && before != curNode.data ){
            prevNode = curNode;
            curNode = curNode.next; 
        }
        
        newNode.next = prevNode.next;
        prevNode.next = newNode; 
    }
    
    public void deleteFront(){
        int x ; 
        if(head == null){
            System.out.println("There is no any nodes");
        }
        if(head.next == null){
            x = head.data; 
            head = tail = null; 
        }
        else{
            x = head.data;
            head = head.next; 

        }
        System.out.println("the eliminated element is " + x);
    }

    public void deleteBack(){
        if(head == null){
            System.out.println("there is no any node");
        }
        Node curNode = head; 
        Node prevNode = null; 
        while(curNode != null){
            prevNode = curNode; 
            curNode = curNode.next; 
        }
        prevNode.next = null; 
        tail = prevNode; 
    }

    public void deleteSpecific(int specific){
        Node curNode = head; 
        if(head == null){
            System.out.println("There is no any node");
        }
        while( curNode.next != null && specific != curNode.next.data){
            if(curNode != tail){
            curNode = curNode.next.next;
            }
            else{
                tail = curNode; 
                curNode.next = null; 
            } 
        }
    }
    
    public void deleteAfter(int data){
        if(head == null){
            System.out.println("There is no node");
        }

        Node curNode = head; 
        while( curNode != null && curNode.data != data ){
            curNode = curNode.next; 
        }
        if(curNode.next == null){
            System.out.println("There is no node after this");
            tail = curNode; 
        }
        else{
            curNode = curNode.next.next; 
        }
    }

    public void deletebefore(int data){
        if(head == null){
            System.out.println("There is no any node");
        }
        else if(head.data == data){
            System.out.println("There is no node before it");
        }
        Node curNode = head; 
        Node prevNode = null;

        while(curNode.next != null && curNode.next.data != data){
            prevNode = curNode; 
            curNode = curNode.next; 
        }
        if (prevNode == null) {
            System.out.println("Given data not found in the list.");
            return; // added return to exit method
        }
        prevNode.next = curNode.next; 

    }

    public void Search(int data){
        int pos= 0 ; 
        Node curNode = head; 
        while(curNode != null){
            pos++;
            if(curNode.data == data){
                System.out.println("Data found at location " + pos);
            }
            curNode = curNode.next; 
        }
    }

    public void getLength(){
        int size = 0 ; 
        Node curNode = head; 
        while(curNode != null){
            size++;
        }
        System.out.println("The size of the Linked list is " + size);
    }

    

    public void display(){
        Node cur = head; 
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next; 
        }
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addFront(3);
        list.addLast(6);
        list.deleteFront();
        list.addFront(4);
        list.addLast(4);
        list.addAfter(3, 6);
        list.deleteFront();
        list.addAfter(4, 3);
        list.addBefore(5, 3);
        list.display();
        System.out.println(list.tail.data);
        System.out.println(list.head.data);
    }
}