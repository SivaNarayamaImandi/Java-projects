package programs;

import java.util.Scanner;

public class Code {

	public static String StringChallenge(String atr) {
		String result = "";
		for (int i = 0; i < atr.length(); i++) {
			char currentChar = atr.charAt(i);
			if (i > 0) {
				char previousChar = atr.charAt(i - 1);
				if ((currentChar - '0') % 2 != 0 && (previousChar - '0') % 2 != 0) {
					result += "-";
				} else if ((currentChar - '0') % 2 == 0 && (previousChar - '0') % 2 == 0) {
					result += "*";
				}
			}
			result += currentChar; 
		}
		String ChallengeToken = "aylsnOu2qd";
		String finalOutput = result + ChallengeToken;
		StringBuilder finalResult = new StringBuilder();
		for (int i = 0; i < finalOutput.length(); i++) {
			if ((i + 1) % 4 == 0) {
				finalResult.append("_");
			}
			finalResult.append(finalOutput.charAt(i));
		}
		return finalResult.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(StringChallenge(scanner.nextLine()));
	}
}
