import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            char x = sc.next().charAt(0);
            arr[i]=x;
        }
        
        int[] frq = new int[256];
        Arrays.fill(frq,0);
        
        for(int i=0;i<n;i++){
            frq[arr[i]]++;
        }
        
        for(int i=0;i<256;i++){
            if(frq[i]==1){
                System.out.println((char)i);
            }
        }
        
    }
}
