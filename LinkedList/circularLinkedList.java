public class circularLinkedList {
    Node head; 
    Node tail; 
    class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data = data; 
            this.next = null; 
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode; 
            head.next = head; 
        }
        else{
            Node curNode = head; 
            while(curNode.next != null){
                curNode = curNode.next; 
            }
            curNode.next = newNode; 
            newNode.next = head; 
        }
    }
    
}
