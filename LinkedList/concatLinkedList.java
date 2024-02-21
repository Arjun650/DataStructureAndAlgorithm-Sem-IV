public class concatLinkedList {
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
        public void display1(concatLinkedList list1){
            Node cur = list1.head; 
            while(cur != null){
                System.out.println(cur.data);
                cur = cur.next; 
            }
        }

        public void display2( concatLinkedList list2){
            Node cur = list2.head; 
            while(cur != null){
                System.out.println(cur.data);
                cur = cur.next; 
            }
        }

        public void concat(concatLinkedList list1 , concatLinkedList list2){
            if(list1.head == null){
                list1.head = list2.head; 
            }
            Node curNode = list1.head; 
            while(curNode.next != null){
                curNode = curNode.next; 
            }
            curNode.next = list2.head; 
        }
    

    public static void main(String[] args){
        concatLinkedList list1 = new concatLinkedList();
        concatLinkedList list2 = new concatLinkedList();
        list1.addFront(3); 
        list1.addFront(4);
        list1.addFront(1);
        list1.addFront(2);
        list2.addFront(5);
        list2.addFront(6);
        list2.addFront(7);
        list2.addFront(8);
        // list1.display1(list1);
        System.out.println(".......................");
        // list2.display2(list2);
        list1.concat(list1 , list2);
        list1.display1(list1);

    }

}
