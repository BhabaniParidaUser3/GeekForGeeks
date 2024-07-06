package _9_javaStringProgram;

public class ReplaceCharcter_2 {

	public static void replaceCharchter(StringBuffer name,int index,char replacechar) {
		name.setCharAt(index, replacechar);
		System.out.println(name);

		
	}
	
	public static void replaceCharchter1(StringBuilder name1,int index,char replacechar) {
		name1.setCharAt(index, replacechar);
		System.out.println(name1);

		
	}
	
	public static void replaceCharchter2(String name2,int index,char replacechar) {
		name2=name2.replace(name2.charAt(index), replacechar);
		System.out.println(name2);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name=new StringBuffer("Bhabani");
		int index=4;
		char replacechar='z';
		replaceCharchter(name,index,replacechar);
		
		StringBuilder name1=new StringBuilder("Shankar");
		replaceCharchter1(name1,index,replacechar);
		
		String name2="Parida";
		replaceCharchter2(name2,index,replacechar);
		
		
		

	}

	

}
