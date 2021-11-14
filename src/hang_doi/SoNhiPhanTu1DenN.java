package hang_doi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhanTu1DenN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			xuly(n);
		}
	}

	private static void xuly(int n) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		while (n-- > 0) {
			String tmp = q.poll();
			System.out.print(tmp + " ");
			q.add(tmp + "0");
			q.add(tmp + "1");
		}
		System.out.println();
	}
}
