import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        char[] s = new char[input.length()]; 
        int i;
        int len=input.length();
        for(i=0;i<input.length();i++){
            s[len-1-i]=input.charAt(i);
        }
        System.out.println("New String");
        System.out.println(s);
    }
}
