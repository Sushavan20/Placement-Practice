import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String num="",ch="",others="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='0' && input.charAt(i)<='9'){
                num=num+input.charAt(i);
            }
            else if((input.charAt(i)>='A' && input.charAt(i)<='Z')||(input.charAt(i)>='a' && input.charAt(i)<='z')){
                ch=ch+input.charAt(i);
            }
            else{
                others=others+input.charAt(i);
            }
        }
        System.out.println("Numbers: "+num);
        System.out.println("Characters: "+ch);
        System.out.println("Others: "+others);
    }
}
