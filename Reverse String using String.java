import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        String output="";
        int len=input.length();
        for(int i=0;i<len;i++){
            char temp = input.charAt(i);
            output=temp+output;
        }
        System.out.println("New String");
        System.out.println(output);
    }
}
