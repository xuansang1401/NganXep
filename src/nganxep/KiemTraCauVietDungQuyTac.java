package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDungQuyTac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			if (check(s))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	public static boolean check(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char out = s.charAt(i);
			if (out == '(' || out == '[')
				st.push(out);
			else if (out == ']' || out == ')') {
				if (st.empty())
					return false;
				char in = st.peek();
				if (in == '[' && out == ']')
					st.pop();
				else if (in == '(' && out == ')')
					st.pop();
				else
					return false;
			}
		}
		return st.empty();
	}
}
