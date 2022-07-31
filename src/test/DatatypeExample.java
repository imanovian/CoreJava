package test;

public class DatatypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 40;
		int sum = num1 + num2;
		int mul = num1 * num2; 
		
		System.out.println("This is sum " + sum);
		System.out.println("This is multiplication of two no. " + mul);
		String str1 = "Clean word green world";
				System.out.println(str1);
				System.out.println("The length of string is "+ str1.length());
				
		char ch1 = str1.charAt(0);
		char chn = str1.charAt(str1.length()-1);
		System.out.println("first letter is "+ ch1);
		System.out.println("last letter is "+ chn);
		System.out.println("The sentence is in uppercase now:" + str1.toUpperCase());
		System.out.println("The sentence is in uppercase now:" + str1.toLowerCase());
	}

}
