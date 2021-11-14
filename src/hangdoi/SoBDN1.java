package hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            long n= in.nextLong();
            xuly(n);
        }
    }

    private static void xuly(long n) {
        Queue<Long> q= new LinkedList();
        q.add(1l);
        int dem =0;
        while (!q.isEmpty()){
            long x = q.peek();
            q.poll();
            if (x<=n){
                dem++;
                q.add(x*10);
                q.add(x*10+1);
            }else {
                break;
            }
        }
        System.out.println(dem);
    }
}
