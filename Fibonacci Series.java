import java.util.*;
class HelloWorld {
    public static int fibo(int n){
        if(n==1||n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 0; i < n; i++){
			System.out.print(fibo(i) +" ");
		}
    }
}
