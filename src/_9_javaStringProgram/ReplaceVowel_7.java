package _9_javaStringProgram;

public class ReplaceVowel_7 {
	public static void replaceVowel(String value)
	{
		//Method-01
		/*
		 * for(int i=0;i<value.length();i++) { char c1=value.charAt(i); if(c1=='a') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='e') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='i') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='o') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='u') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='A') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='E') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='I') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='O') {
		 * value=value.replace(value.charAt(i), 'v'); } else if(c1=='U') {
		 * value=value.replace(value.charAt(i), 'v'); } } System.out.println(value);
		 */
		
		//Method-02
		value=value.replaceAll("[aeiouAEIOU]", "v");
		System.out.println(value);
		
		
	}

	public static void main(String[] args) {
		String name="Bhabani";
		replaceVowel(name);

	}

}
