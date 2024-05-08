package _9_javaStringProgram;

public class ReverseString_3 {

	public static void reverseString1(String name)
	{
		char[] convertedarray=name.toCharArray();
		for(int i=convertedarray.length-1;i>=0;i--)
		{
			System.out.print(convertedarray[i]);
		}
		
		
	}
	
	public static StringBuilder reversestring2(StringBuilder name1) {
		name1.reverse();
		return name1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bhabani";
		reverseString1(name);
		
	StringBuilder name1=new StringBuilder("shankar");
	reversestring2(name1);
	System.out.println(name1);
	
		

	}
	

}
