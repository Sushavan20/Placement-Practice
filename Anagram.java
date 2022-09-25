import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String2: ");
        String s2 = sc.nextLine();
        
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram.");
            return;
        }
         
        char[] c1 = new char[s1.length()];
        char[] c2 = new char[s2.length()];
        
        for(int i=0;i<s1.length();i++){
            c1[i]=s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            c2[i]=s2.charAt(i);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                System.out.println("Not Anagram.");
                return;
            }
        }
        System.out.println("Anagram.");
    }
}
