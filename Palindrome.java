import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp=n,sum=0,rem;
        while(n>0){
            rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}
