import java.util.*;
class ASCII_CHAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char: ");
        char s = sc.next().charAt(0);
        System.out.println("Ascii valiue of "+s+" is "+(int)s);
    }
}
