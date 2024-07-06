package _9_javaStringProgram;

public class ReverseSentence_6 {
	public static void reverseSentence(String value) {
		String[] splitArray = value.split(" ");

		for (int i = splitArray.length - 1; i >= 0; i--) {
			System.out.print(splitArray[i] + " ");
		}

	}

	public static void main(String[] args) {
		String sentence = "This is the input";
		reverseSentence(sentence);

	}

}
