package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {10,20,30,40,50};
		System.out.println("total no. are "+ array1.length);
		System.out.println("second no. is " + array1[1]);
		System.out.println("the last no. is "+ array1[array1.length-1]);
		String str1 = "clean world green world";
				String[] array3 = str1.split(" ");
		System.out.println("the first word is "+ array3[0]);
		System.out.println("the last word is "+ array3[array3.length-1]);
	}

}
