import java.util.Scanner;

public class OccurancesOfCharecter {

	public static void main(String[] args) {
		String str = "kaillllash";
		System.out.println("Occurances of each charecter in a String :");
		int j;
       int k=1;
		for (int i = 0; i < str.length(); i++) {
			int temp = 1;
			for (j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					temp++;

				}

			}
           if (str.charAt(i)!=' ') {
			System.out.println(str.charAt(i) + " = " + temp);
			str=str.replace(str.charAt(i), ' ');
			
            }
		}

	}
}