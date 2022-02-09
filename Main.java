package assessments;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	//function to checkPalindrome
	public void checkPalindrome()  {
		
		System.out.println("Enter the input number: \n");
		int num = sc.nextInt();
		int reverseNum = num, temp = 0;
		
		while(num>0) {
			temp = (temp * 10) + (num % 10);
			num /= 10;
		}
		
		if(temp == reverseNum)
			System.out.println("The number is a Palindrome. \n");
		else
			System.out.println("The number is not a Palindrome. \n");

	}
	
	//function to printPattern
	public void printPattern() {
		
		System.out.println("Enter the input number: \n");
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	//function to check no is prime or not
	public void checkPrimeNumber() {
		
		System.out.println("Enter the input number: \n");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		
		if(count > 0)
			System.out.println("The number is not a Prime. \n");
		else
			System.out.println("The number is Prime. \n");

	}
	
	// function to print Fibonacci Series
	public void printFibonacciSeries() {
		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1, temp;
		System.out.println("Enter the input number: \n");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("Invalid input. \n");
			return;
		}
		
		for(int i=1; i <= num; i++) {
			if(i == 1) {
				System.out.print(first);
				continue;
			}
			if(i == 2) {
				System.out.print(", " + second);
				continue;
			}
			else {
				System.out.print(", " + (first+second));
				temp = second;
				second += first;
				first = temp;
			}
		}
		System.out.print("\n");

	}

 
	//main method which contains switch and do while loop
		public static void main(String[] args) {

                Main obj = new Main();
                int choice;
                Scanner sc = new Scanner(System.in);

                do {
                	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
                	System.out.println();

                	choice = sc.nextInt();

                	switch (choice) {

                		case 0:
                			choice = 0;
                			break;

                		case 1: {
                			obj.checkPalindrome();
                		}
                		break;

                		case 2: {
                			obj.printPattern();
                		}
                		break;

                		case 3: {
                			obj.checkPrimeNumber();
                		}
                		break;

                		case 4: {
                			obj.printFibonacciSeries();
                		}
                		break;

                		default:
                			System.out.println("Invalid choice. Enter a valid no.\n");
                	}
                	
                } while (choice != 0);

                System.out.println("Exited Successfully!!!");
                sc.close();
      }

}

