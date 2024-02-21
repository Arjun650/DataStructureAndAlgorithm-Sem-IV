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
        list.addFront(4);
        list.addLast(4);
        list.addAfter(3, 6);
        list.addAfter(4, 3);
        list.addBefore(5, 3);
        list.display();
        System.out.println(list.tail.data);
        System.out.println(list.head.data);
    }
}