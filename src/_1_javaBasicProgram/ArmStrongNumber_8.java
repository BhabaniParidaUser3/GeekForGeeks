package _1_javaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumber_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 160;
		int k = input;
		List<Integer> digit = new ArrayList<Integer>();
		while (input > 0) {
			digit.add(input % 10);
			input = input / 10;

		}
		int sum = 0;
		int j = 0;
		for (int i = 0; i < digit.size(); i++) {
			j = digit.get(i);
			sum += (j * j * j);

		}

		System.out.println(sum);

		
		  if(sum==k) {
		  System.out.println("Input number :"+k+" is a Armstrong Number"); } else {
		  System.out.println("Input number :"+k+" is not a Armstrong Number"); }
	}

}
