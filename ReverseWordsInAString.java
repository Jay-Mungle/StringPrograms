
public class ReverseWordsInAString {

	public static void main(String[] args) {
		String s1="Narendra Modi is PM of India";
		String s2[]=s1.split(" ");
		for (int i = s2.length-1; i >=0 ; i--) {
			System.out.print(" "+s2[i]);
		}

	}

}
