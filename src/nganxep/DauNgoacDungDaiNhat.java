package nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= Integer.parseInt(in.nextLine());
        while (t-->0){
            String s= in.nextLine();
            System.out.println(tinh(s));
        }
    }

    private static int tinh(String s) {
        Stack<Integer> st= new Stack<>();
        int kq=0;
        st.push(-1);
        for(int i=0; i<s.length();i++){
            if (s.charAt(i)=='(') st.push(i);
            else {
                System.out.println("S1: "+st);
                st.pop();
                System.out.println("POP: "+st);
                if (!st.empty()){
                    kq= Math.max(kq,i-st.peek());
                }else st.push(i);
            }
        }
        return kq;
    }
}
