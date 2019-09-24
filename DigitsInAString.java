import java.util.Scanner;

public class DigitsInAString {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
        System.out.println(str);
        int digit=0,sum=0;
        for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>= '0' && ch<='9') {
				sum=sum+ch-48;
			digit++;}					
		} System.out.println("No. of digits in a string : "+digit);
		System.out.println("Sum of all the digits in a String : "+sum);
	}

}
