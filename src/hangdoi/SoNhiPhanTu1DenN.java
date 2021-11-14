package hangdoi;

import java.util.*;

public class SoNhiPhanTu1DenN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n= in.nextInt();
            xuly(n);
        }
    }

    private static void xuly(int n) {
        Queue q= new LinkedList<String>();
        q.add("1");
        while (n-->0){
            String out =(String) q.peek();
            System.out.print(out+" ");
            q.poll();
            q.add(out+"0");
            q.add(out+"1");
        }
        System.out.println();
    }
}
