package stringProg;

public class SachinTendulkar {

	public static void main(String[] args) {
		
		String str="Sachin Tendulkar";

		String[] words = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		//System.out.println();


	/*	for(String word : words)
		{
			char[] chars = word.toCharArray();
			for(int i=word.length()-1;i>=0;i--)
			{

				System.out.print(chars[i]);
			}
			System.out.print(" ");
		}*/

	}

}
