package Programs.LogicalPrograms;

import java.util.Scanner;

public class reversingNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = scan.nextInt();
		int reverse = 0;  
		
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10; 
		System.out.println(remainder);
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
	}


