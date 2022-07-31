package test;

import java.util.Scanner;

public class Evennumcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the num:");
		int num1 = scanner.nextInt();
				if(num1%2==0)
				{
					System.out.println("The num is even");
				}
				else
				{
					System.out.println("the num is odd");
				}

	}

}
