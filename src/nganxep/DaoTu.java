package nganxep;

import java.util.*;

public class DaoTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= Integer.parseInt(in.nextLine());
        while (t-->0){
            String s= in.nextLine();
            xuly(s);
        }
    }

    private static void xuly(String s) {
        Stack<Character> stack= new Stack<>();
        Scanner sc= new Scanner(s);
        while (sc.hasNext()){
            String tmp = sc.next();
            for(int i=0; i<tmp.length();i++){
                if (tmp.charAt(i) != ' '){
                    stack.push(tmp.charAt(i));
                }else {
                    while (!stack.empty()){
                        System.out.print(stack.peek());
                        stack.pop();
                    }
                }
            }
            while (!stack.empty()){
                System.out.print(stack.peek());
                stack.pop();
            }
        }
    }
}
