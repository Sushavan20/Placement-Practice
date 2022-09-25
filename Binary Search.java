import java.util.*;

class ALGO {
    public static void BinarySeach(int[] arr,int l,int r,int num){
        if(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==num){
                System.out.println(num+ " Found at position "+(mid+1));
            }
            else{
                if(num>arr[mid]){
                    BinarySeach(arr,mid+1,r,num);
                }
                else{
                    BinarySeach(arr,l,mid,num);
                }
            }
        }
        else{
            System.out.println(num+ " Not Found");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of array: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        BinarySeach(arr,0,n,num);
        
    }
}
