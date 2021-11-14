package hang_doi;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class GiaTriNhoNhatCuaXau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			int k = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			System.out.println(xuly(s, k));
		}

	}

	public static long xuly(String s, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		int d[] = new int[300];
		for (int i = 0; i < s.length(); i++) {
			d[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (d[s.charAt(i)] > 0) {
				q.add(d[s.charAt(i)]);
				d[s.charAt(i)] = 0;
			}
		}
		while (k-- > 0 && q.size() > 0) {
			int t = q.poll();
			t--;
			q.add(t);
		}
		long rs = 0;
		while (q.size() > 0) {
			int t = q.poll();
			rs += t * t;
		}
		return rs;
	}
}
