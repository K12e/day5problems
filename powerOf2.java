package day5Problems;

import java.util.Scanner;

public class powerOf2 {
	public static void main(String[] args) {
		int num ,num2=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		
		num=scan.nextInt();
		
		//num = Integer.parseInt(args[0]);

		if (num > 31) {
			System.out.println("value of number should be less than 31");
		}
		else {
			
			System.out.println(num2);
			for (int j = 1; j <= num; j++) {
				num2 = num2 * 2;
				System.out.println(num2);
			}
		}

	}
}
