public class doublyLinkedList {
    Node head;
    Node tail; 
    class Node{
        int data;
        Node prev; 
        Node next; 

        Node(int data){
            this.data = data; 
            this.prev = null; 
            this.next = null; 
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
        head.prev = newNode; 
        head = newNode; 
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node curNode = head; 
        if(head == null){
            head  =newNode; 
            tail = newNode; 
            return; 
        }
        while (curNode.next != null ){
            curNode = curNode.next; 
        }
        newNode.prev = curNode; 
        curNode.next = newNode; 
        tail = newNode; 

    }
    public void addAfter(int data, int after){
        Node newNode = new Node(data); 
        Node curNode = head; 

        if(head == null){
            System.out.println("Empty List");
            return; 
        }

        while(curNode != null && curNode.data != after){
            curNode = curNode.next; 
        }
        if (curNode == null) {
            System.out.println("Node with data " + after + " not found");
            return;
        }
        newNode.prev = curNode; 
        newNode.next = curNode.next; 
        curNode.next.prev = newNode;  
        curNode.next = newNode;
    }

    public void addBefore(int data , int before){
        Node newNode = new Node(data); 
        Node curNode = head; 

        if(head == null){
            System.out.println("Empty List");
            return; 
        }

        while(curNode != null && before != curNode.data){
            curNode = curNode.next; 
        }
        if (curNode == null) {
            System.out.println("Node with data " + before + " not found");
            return;
        }

        newNode.prev = curNode.prev; 
        newNode.next = curNode; 
        curNode.prev.next = newNode; 
        curNode.prev = newNode; 
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == null){
            head = tail = null; 
        }
        else{
            head= head.next; 
            head.prev = null; 
        }
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty");
            return; 
        }
        if(tail.prev == null){
            head= tail = null; 
        }
        else{
            tail = tail.prev; 
            tail.next = null; 
        }
    }
    public static void main(String[] args){

    }
    
}
