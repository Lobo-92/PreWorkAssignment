package com.gl.companystocks;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static double comp[];

	public static void main(String[] args) {

		Stockers stockers = new Stockers();
		stockers.Stockdetails();

		int ch;
		do {

			System.out.println("Enter the operations you want to perform.\n"
					+ "1. Display stock prices in ascending order.\n"
					+ "2. Display stock prices in descending order.\n"
					+ "3. Display the total number of companies for which stock prices rose today.\n"
					+ "4. Display the total number of companies for which stock prices declined today.\n"
					+ "5. Search a specific stock price.\n"
					+ "6. press 0 to exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				stockers.Stockdetails();
				stockers.sortArray(comp, 0, comp.length);
				break;

			case 2:
				stockers.Stockdetails();
				stockers.reverseArray();			
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 6:

				break;

			default:
				break;
			}

		}while(ch<=6);
	}
}
