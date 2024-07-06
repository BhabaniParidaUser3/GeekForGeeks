package _9_javaStringProgram;

public class charDigitSpecialCount_8 {
	static int charcount;
	static int digitcount;
	static int spacecount;
	public static void chardigitspecialCount(String input) {
		char[] convertArray=input.toCharArray();
		for(int i=0;i<convertArray.length;i++)
		{
			
					boolean result1=Character.isAlphabetic(convertArray[i]);
					if(result1==true)
					{
						charcount++;
					}
					
					boolean result2=Character.isDigit(convertArray[i]);
					if(result2==true)
					{
						digitcount++;
					}
					@SuppressWarnings("deprecation")
					boolean result3=Character.isSpace(convertArray[i]);
					if(result3==true)
					{
						spacecount++;
					}
		}
		System.out.println("Number of Charchter present in string : "+charcount);
		System.out.println("Number of Digit present in string : "+digitcount);
		System.out.println("Number of space present in string : "+spacecount);

		

		

	}

	public static void main(String[] args) {
		String input = "Bhabani@1#1$3%4 Shankar@1#1$3%4 parida@1#1$3%4 @1#1$3%4";
		chardigitspecialCount(input);

	}

}
