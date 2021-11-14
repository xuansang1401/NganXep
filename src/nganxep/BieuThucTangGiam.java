package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucTangGiam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			xuly(s);
		}
	}

	private static void xuly(String s) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		int dem = 1, d = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				dem++;
				st.push(dem);
				d = 0;
			} else {
				d++;
				dem++;
				int t = d;
				while (t-- > 0) {
					st.pop();
				}
				t = d;
				st.push(dem);
				int k = dem - 1;
				while (t-- > 0) {
					st.push(k);
					k--;
				}
			}
		}
		String rs = "";
		while (st.size() > 0) {
			rs = st.peek() + rs;
			st.pop();
		}
		System.out.println(rs);
	}
}
