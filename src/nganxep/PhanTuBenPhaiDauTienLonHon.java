package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhaiDauTienLonHon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(), a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			xuly(a, n);
		}
	}

	private static void xuly(int[] a, int n) {
		// TODO Auto-generated method stub
		int r[] = new int[n], i;
		Stack<Integer> st = new Stack<Integer>();
		for (i = n - 1; i >= 0; i--) {
			while (!st.empty() && st.peek() <= a[i])
				st.pop();
			if (st.empty())
				r[i] = -1;
			else
				r[i] = st.peek();
			st.push(a[i]);
		}
		for (i = 0; i < n; i++)
			System.out.print(r[i] + " ");
		System.out.println();
	}
}
