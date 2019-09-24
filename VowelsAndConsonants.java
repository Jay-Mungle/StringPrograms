
public class VowelsAndConsonants {

	public static void main(String[] args) {
		String str ="i live in new sangawi";
		int temp=0;
		int con=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=(str.charAt(i));
			
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			temp++;	
			}
			else {
				con++;
			}
			
		}System.out.println(" Vowels in the String are : "+temp);
		System.out.println(" Consonants in the String are : "+con);

	}

}
