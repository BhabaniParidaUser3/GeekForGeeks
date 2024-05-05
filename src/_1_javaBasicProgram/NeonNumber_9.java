package _1_javaBasicProgram;

import java.util.ArrayList;
import java.util.List;

public class NeonNumber_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input =7;
int temp=input;
int square=input*input;
List<Integer> digit=new ArrayList<Integer>();
while(square>0)
{
	digit.add(square%10);
	square=square/10;
}
int indexvalue=0;
int sum=0;
for(int i=0;i<digit.size();i++)
{
	indexvalue=digit.get(i);
	sum +=indexvalue;
}

if(sum == temp)
{
	System.out.println(temp +":is a Neon Number");
}
else
{
	System.out.println(temp +":is not a Neon Number");
}

	}

}
