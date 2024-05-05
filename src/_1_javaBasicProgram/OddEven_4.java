package _1_javaBasicProgram;

public class OddEven_4 {
	public void OddEven(int x)
	{
		if(x%2==0)
		{
			System.out.println(x+" is a Even Number");
		}
		else
		{
			System.out.println(x+" is a Odd Number");
		}
	}

	public static void main(String[] args) {
		
		OddEven_4 oe=new OddEven_4();
		oe.OddEven(12);

	}

}
