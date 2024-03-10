
public class MergeInOrder {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addBefore(int data, int before) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curNode = head;
        Node prevNode = null;
        if (before == head.data) {
            newNode.next = curNode;
            head = newNode;
            return;
        }
        while (curNode != null && before != curNode.data) {
            prevNode = curNode;
            curNode = curNode.next;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void entry(int dataa, MergeInOrder list) {
        Node curNode = head;
        if (dataa == curNode.data) {
            Node newNode = new Node(dataa);
            newNode.next = head;
            head = newNode;
            return;
        } else {
            while (curNode != null) {
                if (dataa <= curNode.data) {
                    addBefore(dataa, curNode.data);
                    break; // Break the loop once insertion is done
                }
                curNode = curNode.next; // Move to the next node
            }
        }
    }

    public void mergeInOrder(MergeInOrder list, MergeInOrder Original) {
        Node curNode1 = list.head;
        while (curNode1 != null) {
            entry(curNode1.data, Original);
            curNode1 = curNode1.next;
        }
    }

    public static void main(String[] args) {
        MergeInOrder list1 = new MergeInOrder();
        MergeInOrder list2 = new MergeInOrder();
        list1.addLast(3);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(9);
        list2.addLast(1);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(8);
        list2.addLast(12);
        list1.mergeInOrder(list2, list1);
        list1.display();
    }
}
