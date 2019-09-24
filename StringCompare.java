
public class StringCompare {

	public static void main(String[] args) {
		String s1="Testing"; 
		String s2="Testing";
		String s3=new String("Testing");
		String s4="TESTING";
		String s5="TestingJava" ;
	    String s6="J"+"a"+"v"+"a";
		System.out.println( "String s1 = "+s1 +"\n" +"String s2 = "+s2+"\n"+ "String s3 = "+s3 +"\n"+"String s4 = "+s4+"\n"+"String s5 = "+s5+"\n"+"String s6 = "+s6);
		System.out.println(""==" compares reference and not the values");
		System.out.println("equals method compares value and not the reference");
		System.out.println("compareTo method compare value and returns an int if the values compare less than, equal, or greater than");
		System.out.println("Comapre s1 and s2 using == method");
		System.out.println(s1==s2);
		System.out.println("Comapre s1 and s2 using == method");
		System.out.println(s1==s3);
		System.out.println("Comapre s1 and s2 using equals method");
        System.out.println(s1.equals(s2));
        System.out.println("Comapre s1 and s6 using equals method");
        System.out.println(s1.equals(s6)); 
        System.out.println("Comapre s1 and s5 using compareTo method");
        System.out.println(s1.compareTo(s5));
        System.out.println("Comapre s1 and s2 using compareTo method");
        System.out.println(s1.compareTo(s2));
        System.out.println("Comapre s1 and s4 using equalsIgnoreCase method");
	}

}
