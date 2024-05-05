package _1_javaBasicProgram;

public class SwapTwoNumber_3 {

	public void swapping(int m,int n)
	{
		int temp=m;
		m=n;
		n=temp;
		System.out.println("swapping value of m:"+m+"swapping value of n:"+n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumber_3 stn=new SwapTwoNumber_3();
		int m=10;
		int n=20;
		stn.swapping(m, n);
		

	}

}
