import java.util.*;

class Queue{
    static final int MAX=5;
    int front,rear;
    int[] arr = new int[MAX];
    
    Queue(){
        front=0;
        rear=-1;
    }
    
    boolean isEmpty(){
        if(front>rear){
            return true;
        }
        return false;
    }
    
    boolean isFull(){
        if(rear>=MAX-1){
            return true;
        }
        return false;
    }
    
    void enqeue(int x){
        if(isFull()){
            System.out.println("Queue Overflow...");
        }
        rear++;
        arr[rear]=x;
        System.out.println(x+" has been pushed in Queue...");
    }
    
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow...");
        }
        int temp = arr[front];
        front++;
        return temp;
    }
    
    int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow...");
        }
        return arr[front];
    }
    
    void show(){
        if(isEmpty()){
            System.out.println("Queue is EMpty...");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

}

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Queue s = new Queue();
        int choice;
        do{
            System.out.println("Enter 1 for push");
            System.out.println("Enter 2 for pop");
            System.out.println("Enter 3 for peek");
            System.out.println("Enter 4 for display");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element: ");
                    int x = sc.nextInt();
                    s.enqeue(x);
                    break;
                case 2:
                    System.out.println("Popped Item: "+s.dequeue());
                    break;
                case 3:
                    System.out.println("Peeked Item: "+s.peek());
                    break;
                case 4:
                    System.out.print("Current Stack: ");
                    s.show();
                    break;
                default:
                    System.out.print("Wrong input");
            }
        }while(choice>=1 && choice<=4);
    }
}
