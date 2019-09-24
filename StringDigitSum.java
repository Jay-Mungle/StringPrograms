
public class StringDigitSum {

	public static void main(String[] args) {
		String s = "I live In56 Navi34 Sangwi12 In Pune "; 
		int count=0,digit=0,sum=0;
		System.out.print("Digits available in this String are : ");
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			
			if (ch >='0' && ch <='9')
			{
				System.out.print(s.charAt(i));
				System.out.print(" ");
				digit++;
				sum=sum+s.charAt(i)-48;
			}
			}
			System.out.println();
			System.out.println("The total no of Digits are: "  + digit );
			System.out.println("And the sum of all the digits is: " + sum );
			

	}

}
