package hang_doi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SoLocPhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			tinh(n);
		}
	}

	private static void tinh(int n) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		List<String> list = new ArrayList<String>();
		q.add("6");
		q.add("8");
		while (true) {
			String tmp = q.poll();
			if (tmp.length() <= n) {
				list.add(tmp);
			} else
				break;
			q.add(tmp + "6");
			q.add(tmp + "8");
		}
		System.out.println(list.size());
		for (int i = list.size() - 1; i >= 0; i--)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}
}
