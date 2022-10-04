import java.util.*;

class HelloWorld {
    public static void Merge(int arr[],int l,int mid, int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[] Sorted = new int[10];

        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                Sorted[k]=arr[i];
                i++;
            }
            else{
                Sorted[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            Sorted[k]=arr[i];
            i++;
            k++;
        }
        while(j<=r){
            Sorted[k]=arr[j];
            j++;
            k++;
        }
        for(i=l;i<=r;i++){
            arr[i]=Sorted[i];
        }
    }

    public static void MergeSort(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of array: ");
        int[] arr = new int[10];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }

        //print
        MergeSort(arr,1,n);
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
