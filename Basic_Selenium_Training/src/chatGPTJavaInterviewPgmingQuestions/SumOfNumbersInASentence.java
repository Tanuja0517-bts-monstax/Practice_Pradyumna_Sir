package chatGPTJavaInterviewPgmingQuestions;

public class SumOfNumbersInASentence {
	public static void main(String[] args) {
		int num = 0;
		int temp = 0;
		int rev = 0;
		String str = "Java was invented in 1982 ans is still used in 2025 and wil be used in 6700 ";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				rev = Integer.parseInt("" + str.charAt(i));
				temp = (temp * 10) + rev;
				// num+=Integer.parseInt(""+str.charAt(i));
			} else if (temp != 0) {
				num += temp;
				temp = 0;
				rev = 0;
			}

		}
		System.out.println("Sum of all digits in String:" + num);
	}
}
