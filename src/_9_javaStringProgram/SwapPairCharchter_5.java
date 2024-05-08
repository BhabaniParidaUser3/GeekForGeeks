package _9_javaStringProgram;

public class SwapPairCharchter_5 {
	
	public static void swappair(String name)
	{
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length-1;i+=2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		
		for(char c:ch)
		{
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Bhabani";
		swappair(name);

	}

}
