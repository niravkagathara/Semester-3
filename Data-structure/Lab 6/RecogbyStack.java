import java.util.Scanner;
import java.util.Stack;

class RecogbyStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> s = new Stack<Character>();
		System.out.print("Enter String: ");
		String str = sc.next();
		sc.close();
		int l = str.length()/2;
		if (str.charAt(l) != 'c') {
			System.out.println("C is not in the middle of the String");
			System.exit(0);
		}
		int i;
		for (i = 0; i < str.length(); i++) {
			char next = str.charAt(i);
			if (next == 'c') {
				break;
			}
			s.push(next);
		}

		boolean flag = true;
		for (int j = i + 1; j < str.length(); j++) {
			char next = str.charAt(j);
			if (next != s.pop()) {
				System.out.println("------------------\nInvalid String\n------------------");
				flag = false;
				break;

			}
		}
		if (flag) {
			System.out.println("------------------\nValid String\n------------------");
		}
		
	}
}
