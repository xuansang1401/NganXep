package nganxep;

import java.util.*;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= Integer.parseInt(in.nextLine());
        while (t-->0){
            String s= in.nextLine();
            if(xuly(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean xuly(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length();i++){
            if (s.charAt(i) =='{' || s.charAt(i) =='[' ||s.charAt(i) =='(' ){
                st.push(s.charAt(i));
            }else {
                if (st.empty()) return false;
                char in = st.peek(), out= s.charAt(i);
                if (in =='(' && out== ')') st.pop();
                else  if (in =='{' && out== '}') st.pop();
                else if (in =='[' && out== ']') st.pop();
                else return false;
            }
        }
        return true;
    }
}
