package _1_javaBasicProgram;

import java.util.Scanner;

public class ReadandPrint_1 {
	/* How to Read and Print an Integer value in Java */
	public void myScanner()
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please provide the string input");
		String name=sc.nextLine();
		System.out.println("User provided string value is :"+name); 
		
		System.out.println("Please provide the integer input");
		int num=sc.nextInt();
		System.out.println("User provided integer value is :"+num);
		
		
		
		
		
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		
		ReadandPrint_1 rp=new ReadandPrint_1();
		rp.myScanner();
	}

}
