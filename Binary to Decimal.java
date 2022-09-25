import java.util.*;
class BinToDec {
    public static int power(int n){
        int pow=2;
        if(n==0){
            return 1;
        }
        for(int i=1;i<n;i++){
            pow=pow*2;
        }
        return pow;
    } 
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int sum=0;
        int i=0;
        while(x>0){
            int rem=x%10;
            sum += rem * power(i);  
            x=x/10;
            i++; 
        }
        System.out.println("Binary Value: "+sum);
    }
}
