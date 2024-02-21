import java.util.*;
public class queue {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        impQueue a = new impQueue();
        int choice =0 ; 
        while(choice != 4){
            System.out.println("Enter 1.enqueue 2.dequeue 3.show 4. exit");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    a.enqueue();
                    break;
            
                case 2:
                    int e = a.dequeue();
                    System.out.println("The dequeued value is " + e);
                    break;
                case 3:
                    a.display();
                    break;
                case 4:
                    break;
            }
    }

    }}

class impQueue{
    Scanner in = new Scanner(System.in);

    int front = -1 ; 
    int rear = -1 ; 
    int size; 
    int [] queue; 
    impQueue(){
        System.out.println("enter the size of the array");
        size = in.nextInt();
        queue = new int[size];
    }
    public void enqueue(){
        if(rear == size-1){
            System.out.println("Overflow");
            System.exit(0);
        }
        else{
            if(rear == -1 && front == -1){
                rear = 0 ; 
                front = 0 ; 
            }
            else{
                rear += 1 ; 
            }

            System.out.println("enter the element you want to enter");
            int ele = in.nextInt();
            queue[rear] = ele;
            System.out.println("enqueued");
        }
    }
    public Integer dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Underflow");
            System.exit(0);
            return null ; 
        }
        else{
            if(front == rear){
                int a = queue[front];
                front = -1 ; 
                rear = -1; 
                return a ;
            }
            else {
                int  a = queue[front];
                front += 1 ; 
                return a ; 
            }
        }
    }
    public void display(){
        for (int i = front ; i<= rear ; i++){
            System.out.println(queue[i]);
        }
    }
}