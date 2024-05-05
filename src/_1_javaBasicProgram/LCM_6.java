package _1_javaBasicProgram;

public class LCM_6 {

	public static void main(String[] args) {

		// Numbers
		int a = 36, b = 60;

		// Checking for the largest // Number between them
		int ans = (a > b) ? a : b;

		// Checking for a smallest number that
		// can dedivided by both numbers
		while (true) {
			if (ans % a == 0 && ans % b == 0)
				break;
			ans++;
		}

		// Printing the Result
		System.out.println("LCM of " + a + " and " + b + " : " + ans);

	}

}
