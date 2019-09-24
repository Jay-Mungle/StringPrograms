
public class woedsInAString {

	public static void main(String[] args) {
		String str="I love Java Prgramming";
		String s[]=str.split(" "); 
		int temp=0;
		for (String string : s) {
			System.out.println(string);
			temp++;
		}System.out.println("Total words in a String are : "+temp);

	}

}
