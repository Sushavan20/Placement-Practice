
import java.util.*;
class HelloWorld {
    static void changeArr(int[] input)
    {
        int[] temp = new int[input.length];
        for(int i=0;i<input.length;i++){
            temp[i]=input[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                if(input[i]==temp[j]){
                    input[i] = j+1;
                    break;
                }
            }
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
        
        changeArr(arr);
        System.out.print("Output: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
