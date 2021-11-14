package KiemTraThu;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        while (n-->0){
            String k= in.nextLine();
            if(kitra(k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean kitra(String nextLine) {
        if (nextLine.charAt(nextLine.length()-1)!='.') return false;
        String s="";
        for(int i=0; i<nextLine.length(); i++){
            if (nextLine.charAt(i)=='[' || nextLine.charAt(i)==']'
                    || nextLine.charAt(i)=='(' || nextLine.charAt(i)==')'){
                s=s+nextLine.charAt(i);
            }
        }
        return xuly(s);
    }

    private static boolean xuly(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length();i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if (!st.empty()) {
                    char in = st.peek(), out = s.charAt(i);
                    if (out == ')') {
                        if (in != '(') {
                            return false;
                        }
                    }
                    if (out == ']') {
                        if (in != '[') {
                            return false;
                        }
                    }
                    st.pop();
                }else {
                    return false;
                }
            }
        }

        return st.empty();
    }
}
