import java.util.*;

public class circularQueue {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] Args){
        cirQueue a = new cirQueue();
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
                    a.show();
                    break;
                case 4:
                    break;
            }
    }
    }
}



class cirQueue{
    static Scanner in = new Scanner(System.in);
    private int front = -1;
    private int rear = -1; 
    static int size; 
    private int[] que;
    public cirQueue(){
        System.out.println("Enter the size of queue");
        size = in.nextInt();
        que = new int[size];
    }
    public void enqueue(){
        if((front == 0 && rear == size-1 )  || (front == (rear+1)%size )){
            System.out.println("Overflow");
            System.exit(0);
        }
        else if (front == -1){
            rear = front = 0 ; 
        }
        else {
            rear = (rear+1) % size; 
        }
        System.out.println("enter the value");
        int ele = in.nextInt();
        que[rear] = ele;
    }

    public Integer dequeue(){
        if(front == -1 ){
            System.out.println("Queue UnderFlow");
            System.exit(0);

        }
        int data = que[front];
        if( front == rear){
            front = rear = -1; 
        }
        else if (front == size - 1){
            front = 0 ; 
        }
        else
            front = (front + 1) % size ; 
        return data; 
    }

    public void show(){
        if(front == -1){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        else if(rear >= front){
            for (int i = front ; i <= rear ; i++){
                System.out.print(que[i] + "\t");
            }
        }
        else{
            for(int i = front ; i< size-1 ; i++){
                System.out.print(que[i] + "\t");
            }
            for(int i = 0 ; i<size-1 ; i++){
                System.out.print(que[i] + "\t");
            }
        }
    }
}

