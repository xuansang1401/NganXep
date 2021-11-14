package nganxep;

import java.util.Scanner;
import java.util.Stack;

public class HinhChuNhatLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            int n= in.nextInt(), a[]= new int[n];
            for (int i=0; i<n;i++){
                a[i]=in.nextInt();
            }
            lonhat(a,n);

        }
    }

    private static void lonhat(int[] a, int n) {
        int trai[]= new int[n], phai[]= new int[n];
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<n; i++){
            stack.push(a[i]);
            while (!stack.empty() && a[i] >= stack.peek()) stack.pop();
            if (!stack.empty()) trai[i]= stack.peek();
            else trai[i]=-1;

        }
    }
}
