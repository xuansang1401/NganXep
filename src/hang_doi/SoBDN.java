package hang_doi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			System.out.println(tinh(n));
		}
	}

	private static int tinh(long n) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		int dem = 0;
		while (true) {
			String tmp = q.poll();
			if (Long.parseLong(tmp) <= n)
				dem++;
			else
				break;
			q.add(tmp + "0");
			q.add(tmp + "1");
		}
		return dem;

	}
}
