
import java.util.*;

class HelloWorld {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static int partition(int[] arr,int l,int r){
        int pivot=arr[r];
        int i=l-1;
        
        for(int j=l;j<r;j++){
            if(pivot>arr[j]){
                i++;
                swap(arr,i,j);
            }
        }
        
        swap(arr,i+1,r);
        return (i+1);
    }
        
    public static void quicksort(int[] arr,int l,int r){
        if(l<r){
            int pivot=partition(arr,l,r);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,r);
        }
    }
    public static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
        
    }
}
