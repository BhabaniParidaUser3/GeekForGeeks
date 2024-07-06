package _9_javaStringProgram;

import java.util.Arrays;

public class StringSorting_4 {

	public static void ResultOfSorting(String name) {
		char[] convert = name.toCharArray();
		
	
		//Arrays.sort(convert);

		for (char ch : convert) {
			System.out.print(ch);
		}

		for (int i = convert.length - 1; i >= 0; i--) {
			System.out.print(convert[i]);

		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bhabani";
		ResultOfSorting(name);

	}

}
