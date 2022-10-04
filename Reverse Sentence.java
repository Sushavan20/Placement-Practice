import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String s[] = input.split(" ");
        String ans="";
        for(int i=s.length-1;i>=0;i--){
            ans+=s[i]+" ";
        }
        System.out.println("Reversed String: " + ans);
    
    }
}
