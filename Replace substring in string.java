
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a String : ");
         String s1 = sc.nextLine();
         System.out.print("Enter the String to be replaced : ");
         String oldString = sc.nextLine();
         System.out.print("Enter the new String : ");
         String newString =sc.nextLine();
    
         s1 = s1.replace(oldString, newString);
         System.out.println("New String is :"+s1);
    }
}
