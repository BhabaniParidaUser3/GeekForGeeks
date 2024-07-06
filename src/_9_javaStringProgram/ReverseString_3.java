package _9_javaStringProgram;

public class ReverseString_3 {

	//Method01
		public static void reverseString1(String name) {
			for (int i = name.length() - 1; i >= 0; i--) {
				System.out.print(name.charAt(i));
			}

		}
	// Method02
	public static StringBuilder reversestring2(StringBuilder name1) {
		name1=name1.reverse();
		return name1;
	}
	
	
	
	

	public static void main(String[] args) {
		String name = "Bhabani";
		reverseString1(name);

		StringBuilder name1 = new StringBuilder("Bhabani");
		reversestring2(name1);
		System.out.println("\n"+name1);
		
		

	}

}
