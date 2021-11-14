package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			System.out.println(xuly(s));
		}
	}

	public static int xuly(String s) {
		Stack<Character> st = new Stack<Character>();
		int xoa = 0, rs = 0;
		for (int i = 0; i < s.length(); i++) {
			if (st.size() == 0)
				st.push(s.charAt(i));
			else if (s.charAt(i) == '[') {
				if (st.peek() == ']') {
					rs += st.size() + xoa;
					st.pop();
				} else
					st.push(s.charAt(i));
			} else if (s.charAt(i) == ']') {
				char c = st.peek();
				if (c == '[') {
					st.pop();
					xoa += 2;
				} else
					st.push(s.charAt(i));
			}
			if (st.size() == 0)
				xoa = 0;
		}
		return rs;
	}
}
