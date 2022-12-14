import java.util.*;

class ll_Demo{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next=null;
        }
    }

    public static ll_Demo insert(ll_Demo list,int x){
        Node newNode = new Node(x);
        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        return list;
    }

    public static ll_Demo delete(ll_Demo list,int key){
        Node current = list.head;
        Node prev = null;
        if(current!=null && current.data==key){ // if head itself hold the value
            list.head=current.next;
            System.out.println(key+" has been deleted...");
            return list;
        }
        while(current!=null && current.data!=key){
            prev=current;
            current=current.next;
        }
        if(current!=null){
            prev.next=current.next;
            System.out.println(key+" has been deleted...");
        }
        if(current==null){
            System.out.println(key+" not Found.....");
        }
        return list;
    }

    public static void printMiddle(ll_Demo list)
    {
        Node slow_ptr = list.head;
        Node fast_ptr = list.head;

        while (fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The middle element is [" + slow_ptr.data + "] \n");

    }

    public static void display(ll_Demo list){
        System.out.print("Linked List: ");

        Node current = list.head;
        while(current.next!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print(current.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ll_Demo obj = new ll_Demo();

        System.out.println("Insert 10 elements:");
        for(int i=0;i<10;i++){
            int x = sc.nextInt();
            obj = insert(obj,x);
        }
        display(obj);
        System.out.print("Enter the value you want to delete: ");
        int val = sc.nextInt();
        obj = delete(obj,val);
        display(obj);
        printMiddle(obj);
    }

}
