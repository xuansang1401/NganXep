package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			System.out.println(sua(s));
		}
	}

	private static int sua(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || st.size() == 0 && s.charAt(i) == ')') {
				st.add(s.charAt(i));
			} else {
				if (st.peek() == '(') {
					st.pop();
				} else
					st.push(s.charAt(i));
			}
		}
		int d1 = 0, d2 = 0;
		while (st.size() > 0) {
			if (st.peek() == '(')
				d1++;
			else
				d2++;
			st.pop();
		}
		int rs = d1 / 2 + d2 / 2 + d1 % 2 + d2 % 2;
		return rs;
	}

}
