import java.util.Scanner;

public class stack{
    static Scanner in = new Scanner(System.in);
    static int top = -1 ; 
    int count = 0  ; 
    static int sizee ;

    void push(int[] sta){
        if(top == sizee){
            System.out.println("overflow");
            System.exit(0);
        }
        else{
            int ele;
            System.out.println("Enter the element to add");
            ele = in.nextInt();
            if (top < sizee -1){
            top+= 1 ;
            sta[top] = ele;
            System.out.println("pushed");}
            else{
                System.out.println("stack overflow");
                System.exit(0);
            }
        }
    }
    void pop(int[] sta){
        if(top == -1){
            System.out.println("underflow");
            System.exit(0);
            System.out.println("Pop");
        }
        else{
            top -= 1 ; 
        }
    }
    void show(int[] sta){
        for(int i = 0 ; i<= top ; i++){
            System.out.print(sta[i] + " ");
        }
    }
    void peek(int[] sta){
        System.out.println("top Stack " + sta[top]);
    }
    public static void main(String[] args){
        // System.out.println("hello ");
        System.out.println("enter the size of stack");
        sizee = in.nextInt();
        int[] sta = new int[sizee];
        
        int choice =0 ; 
        stack a = new stack() ; 
        while(choice != 4){
            System.out.println("Enter 1.push 2.pop 3.show 4.peek 5. exit");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    a.push(sta);
                    break;
            
                case 2:
                    a.pop(sta);
                    break;
                case 3:
                    a.show(sta);
                    break;
                case 4:
                    a.peek(sta);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }
}