import java.util.*;
class Par_Check {
    public static boolean check(String s){
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            
            if(stack.isEmpty()){
                return false;
            }
            
            char t;
            switch(c){
                case ')':
                    t = stack.pop();
                    if (t == '{' || t == '['){
                        return false;
                    }
                    break;
                case '}':
                    t = stack.pop();
                    if (t == '(' || t == '['){
                        return false;
                    }
                    break;
                case ']':
                    t = stack.pop();
                    if (t == '(' || t == '{'){
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        if (check(str))
            System.out.println("True");
        else
            System.out.println("False");
        
        
    }
}
