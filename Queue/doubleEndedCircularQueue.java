import java.util.Scanner; 
public class doubleEndedCircularQueue {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Dequeue a = new Dequeue();
        int flag = 9;
        while(flag != 0){
            System.out.println("Enter 1.enqueueFront 2.enqueueRear 3.dequeueFront 4.dequeueRear 5.Show 0.exit ");
            flag = in.nextInt();
            switch(flag){
                case 1:
                    a.enqueueFront();
                    break;
                case 2:
                    a.enqueueRear();
                    break;
                case 3:
                    a.dequeueFront();
                    break;
                case 4:
                    a.dequeueRear();
                    break;
                case 5:
                    a.display();
                    break;
                case 6:
                    System.out.println("enter valid number");
                    break;
            }
        }
    }
}

class Dequeue{
    static Scanner in = new Scanner(System.in);
    private int rear = -1  , front = -1; 
    int [] dequeue;
    static int size;
    Dequeue(){
        System.out.println("Enter the size of the array");
        size = in.nextInt();
        dequeue = new int[size];
    }

    public boolean isFull(){
        if((front == -1 && rear == size - 1 ) || (front == rear + 1 )){
            return true ; 
        }
        else
            return false ; 
    }

    public void enqueueFront(){
        // if((front == -1 && rear == size - 1 ) || (front == rear + 1 )){
            if(isFull()){

            System.out.println("Queue is full");
        }
        else if( front == -1 && rear == -1){
            front=rear = 0 ; 
        }
        else if (front==0 ){
            front = size - 1; 
        }
        else{
            front--;
        }
        System.out.println("enter the value");
        int a = in.nextInt();
        dequeue[front] = a;
    }

    public void enqueueRear(){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(front == -1 && rear == -1){
            front = rear = 0 ; 
        }
        else if (rear == size -1 ){
            rear = 0 ; 
        }
        else{
            rear++;
        }
        System.out.println("enter the element to be added");
        int a = in.nextInt();
        dequeue[rear] = a ; 
    }

    public boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        else{
            return false; 
        }
    }

    public void dequeueFront(){
        int a = dequeue[front];
        if(isEmpty()){
            System.out.println("UnderFlow");
            return ;
        }
        else if (front == rear){
            front = rear = -1; 
        }
        else if(front == size - 1){
            front=  0 ; 
        }
        else{
            front++ ; 
        }
        System.out.println("The front element of the queue is " + a);
    }

    public void dequeueRear(){
        int a = dequeue[rear];
        if(isEmpty()){
            System.out.println("UnderFlow");
            return; 
        }
        else if(front == rear){
            front = rear = 1 ; 
        }
        else if (rear == 0){
            rear = size -1; 
        }
        else{
            rear--;
        }
        System.out.println("The eleminated number is" + a);
    }
    public void display(){
        int i = front; 
        while(i != rear){
            System.out.println(dequeue[i] + "\t");
            i = (i+1)%size;
        }
        System.out.println(dequeue[rear]);
    }
}


