package chatGPTJavaInterviewPgmingQuestions;

public class SumOfDigitsInAString {
	public static void main(String[] args) {
		int num = 0;
		String str = "Java was invented in 1982 ans is still used in 2025 and wil be used in 6700 ";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				num += Integer.parseInt("" + str.charAt(i));
			}
		}
		System.out.println("Sum of all digits in String:" + num);
	}
}
