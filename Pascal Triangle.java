import java.util.*;

class HelloWorld {
    public static int Factorial(int n){
        if(n==0 || n==1)
            return 1;
        else{
            int fac=1;
            for(int i=2;i<=n;i++){
                fac+=fac*i;
            }
            return fac;
        }
    }
    public static int nCr(int n,int r){
        return Factorial(n)/(Factorial(n-r)*Factorial(r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print(" "+nCr(i,k));
            }
            System.out.println();
        }
    }
}
