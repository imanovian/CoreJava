package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5};
		try { 
			System.out.println(array[5]);
		}
		catch(ArrayIndexOutOfBoundException e) {
			System.out.println("Catch exception");
		}
	}

}
