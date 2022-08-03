package stringProg;

public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String str = "avish$#kar8800";
		
		str = str.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(str);
	}

}
