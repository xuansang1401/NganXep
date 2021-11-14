package hang_doi;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class NoiDay {
	static int mod = (int) (1e9 + 7);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			while (n-- > 0)
				q.add(sc.nextInt());
			System.out.println(noiDay(q));
		}

	}

	private static int noiDay(PriorityQueue<Integer> q) {
		// TODO Auto-generated method stub
		int rs = 0;
		while (q.size() > 1) {
			int a = q.poll();
			int b = q.poll();
			int tmp = (a + b) % mod;
			q.add(tmp);
			rs += tmp;
			rs %= mod;
		}
		return rs;
	}
}
