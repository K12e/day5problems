package day5Problems;
//

import java.util.Scanner;


public class FlipCoin {

	public static void main(String[] args) {
		
		int n, h_cnt = 0, t_cnt = 0;
		double heads, tails;
	Scanner scan = new Scanner(System.in);

		System.out.print("enter no. of times you want to flip the coin: ");
		n = scan.nextInt();

		
		for (int j = 0; j < n; j++) {
			double random = Math.random();
			if (random < 0.5)
				t_cnt++;
			else
				h_cnt++;
		}

		heads = h_cnt / (double) n * 100;
		tails = t_cnt / (double) n * 100;
		System.out.println("Percentage of heads: " + heads );
		System.out.println("Percentage of tails: " + tails );

	}

}