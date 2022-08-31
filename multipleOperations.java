import java.util.Scanner;

public class multipleOperations {
	
	Scanner sc = new Scanner(System.in);
		
		public void checkPalindrome() {
			int remainder,sum = 0,temp;
			System.out.println("Enter a number to check if it's a Palindrome.");
			int value = sc.nextInt();
			
			temp = value;
			while(value>0) {
				remainder = value%10;
				sum = (sum*10)+remainder;
				value = value/10;
			}
			if(temp == sum)
				System.out.println(temp + " is a Palindrome.");
			else
				System.out.println(temp + " is not a Palindrome");
		}
		
		public void printPattern() {
			String pattern = "";
			System.out.println("Enter a number to print the pattern");
			int value = sc.nextInt();
			if(value>0) {
				for (int i = value; i>0; i--) {
					for (int j=0; j<i; j++) {
						pattern +="*";
					}
					System.out.println(pattern);
					pattern = "";
				}
				System.out.println();
			}else
				System.out.println("Enter a valid no");
		}
		
		public void checkForPrimeNo() {
			System.out.println("Enter a number to check if it is prime number.");
			int value = sc.nextInt();
			boolean flag = false;
			for (int i=2; i<= value/2; ++i) {
				if(value%i==0) {
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println(value + " is a prime number.");
			else
				System.out.println(value + " is not a prime number.");
			System.out.println();
		}
		
		public void printFibonacciSeries() {
			System.out.println("Enter a number to print Fibonacci series.");
			int value = sc.nextInt();
			int first=0, second=1, sum=0;
			
			if(value==0) {
				System.out.println("The Fibonacci series is " + first);
			}else if(value==1) {
				System.out.println("The Fibonacci series is " +first+"," +second);
			}else {
				System.out.println("The Fbonacci series is " +first+"," +second);
				
				while(value>1) {
					sum = first+second;
					System.out.println("," + sum);
					first = second;
					second = sum;
					value -=1;
				}
			}
			System.out.println();
			System.out.println();
		}
		
		public static void main(String[] args) {
			
			multipleOperations obj = new multipleOperations();
			
			int choice;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("Enter your choice from the below list.\n"
						+ "1. Find Palindrome of a number.\n"
						+ "2. Print the pattern.\n"
						+ "3. Check for Prime number.\n"
						+ "4. Print Fibonacci Series.\n"
						+ "Enter 0 to exit.");
				System.out.println();
				
				choice = sc.nextInt();
				switch(choice) {
				case 0:
					choice=0;
					break;
					
				case 1:{
					obj.checkPalindrome();
				}break;
				
				case 2:{
					obj.printPattern();
				}break;
				
				case 3:{
					obj.checkForPrimeNo();
				}break;
				
				case 4:{
					obj.printFibonacciSeries();
				}break;
				
				default:
					System.out.println("Invalid number.");
				}
			}while(choice!=0);
			System.out.println("Exited successfully!");
			
			sc.close();
		}
	}
		
