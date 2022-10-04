// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String zero="",one="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero+=s.charAt(i);
            }
            else{
                one+=s.charAt(i);
            }
        }
        String s1=zero+one;
        System.out.println("New Srting: "+s1);
    }
}
