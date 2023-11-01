import java.util.Scanner;

public class Roman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Roman numeral: ");
		String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for case insensitivity
		scanner.close();

		int result = romanToInteger(romanNumeral);
		System.out.println("Integer equivalent: " + result);
	}

	public static int romanToInteger(String s) {
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			int currentVal = romanCharToInt(s.charAt(i));

			if (i + 1 < s.length()) {
				int nextVal = romanCharToInt(s.charAt(i + 1));

				if (currentVal < nextVal) {
					result -= currentVal;
				} else {
					result += currentVal;
				}
			} else {
				result += currentVal;
			}
		}

		return result;
	}

	public static int romanCharToInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}

