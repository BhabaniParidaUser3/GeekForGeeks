package _9_javaStringProgram;

public class GetACharacterFromString_1 {
	
	//1stmethod
	public static char getCharfromString(String name,int index)
	{
		return name.charAt(index) ;
	}
	
	//2ndmethod
	public static char getchar(String name,int index)
	{
		char[] convertArray=name.toCharArray();
		char ch1=convertArray[index];
		return ch1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="bhabani";
		int index=3;
		char ch=getCharfromString(name,index);
		System.out.println(ch);
		char ch1=getchar(name,index);
		System.out.println(ch1);
		
	}

}
