package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan {
	private static class Data {
		public int val, ind;

		public Data(int val, int ind) {
			this.val = val;
			this.ind = ind;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			xuly(a, n);
		}
	}

	private static void xuly(int[] a, int n) {
		// TODO Auto-generated method stub
		int l[] = new int[n];
		Stack<Data> st = new Stack<Data>();
		for (int i = 0; i < n; i++) {
			while (!st.empty() && st.peek().val <= a[i]) {
				st.pop();
			}
			if (st.empty())
				l[i] = -1;
			else
				l[i] = st.peek().ind;
			st.push(new Data(a[i], i));
		}
		for (int i = 0; i < n; i++) {
			System.out.print(i - l[i] + " ");
		}
		System.out.println();
	}
}
