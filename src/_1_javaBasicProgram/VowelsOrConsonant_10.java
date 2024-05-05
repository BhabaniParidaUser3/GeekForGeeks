package _1_javaBasicProgram;

import java.util.Scanner;

public class VowelsOrConsonant_10 {

	public static void vowel_or_consonant(char input1)
	{
		if (input1 == 'a' ||input1 == 'e'||input1 == 'i'||input1 == 'o'||input1 == 'u'||input1 == 'A'||input1 == 'E'||input1 == 'I'||input1 == 'O'||input1 == 'U' )
		{
			System.out.println(input1+": is a vowel");
		}
		else
		{
			System.out.println(input1+": is a consonant");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide charachter: ");
		char input=sc.next().charAt(0);
		vowel_or_consonant(input);
		
		

	}

}
