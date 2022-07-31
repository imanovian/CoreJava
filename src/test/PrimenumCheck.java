package test;

import java.util.Scanner;

public class PrimenumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the num:");
		int num = scanner.nextInt();
		

        for(int index=2;index<num;index++) {
			
			int rem = num%index;
			
			if(rem==0) {
				
				System.out.println("Num is not Prime");
				break;
				
			
			}

	}
}}