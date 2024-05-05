package _1_javaBasicProgram;

public class LargestNumber_5 {
	public int largetNumber(int x,int y,int z)
	{
		if(x>y && x>z)
		  return x;
		else if(y>z && y>x)
			return y;
		else
			return z;
	}

	public static void main(String[] args) {
		LargestNumber_5 LN=new LargestNumber_5();
		int largest;
		largest=LN.largetNumber(20, 21, 20);
		System.out.println(largest+" is the largest number");
		
		

	}

}
