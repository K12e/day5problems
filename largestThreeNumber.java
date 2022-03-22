package day5Problems;

import java.util.Scanner;

public class largestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number");
		num=scan.nextInt();
		num1=scan.nextInt();
		num2=scan.nextInt();
		if(num>num1)
		{
			System.out.println("num is greatest number");
		}
		else if(num1>num2)
		{
			System.out.println("num1 is greatest number");
		}
		else
		{
			System.out.println("num2 is greatest number");
		}
	}

}
