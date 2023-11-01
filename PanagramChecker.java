import java.util.Scanner;

public class PanagramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence to check for pangram:");
		String input = scanner.nextLine();
		scanner.close();
		if (isPanagram(input)) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}

	}
	public static boolean isPanagram(String input) {
		input = input.replaceAll("\\s", "").toLowerCase();
		boolean[] alphabetPresence = new boolean[26];
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i); 
			if (Character.isAlphabetic(currentChar)) {	                
				alphabetPresence[currentChar - 'a'] = true;
			}
		}
		for (boolean isPresent : alphabetPresence) {
			if (!isPresent) {
				return false;
			}
		}
		return true;
	}
}

