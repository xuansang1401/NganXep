package ngan_xep;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			System.out.println(tinh(s));
		}
	}

	public static int tinh(String s) {
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int kq = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				st.push(i);
			else {
				st.pop();
				if (!st.empty()) {
					kq = Math.max(kq, i - st.peek());
				} else
					st.push(i);
			}
		}
		return kq;
	}
}
