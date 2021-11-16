import java.lang.reflect.Array;
import java.util.Date;
import java.util.Scanner;

public class Excercise {

	

	public static void main(String[] args) {
		
		Car c1 = new Car("Mazda", "cx 5", 2020);
		c1.setFuelType("hybrid");
		c1.setPrice(45000.00);
		
		Car c2 = new Car("Ford ", "Ford ", 2020);
		c2.setFuelType("hybrid");
		c2.setPrice(43000.00); 
		
		Car c3 = new Car("Tesla", " model s", 2019);
		c3.setFuelType("electric ");
		c3.setPrice(115000.00);
		
		Car c4 = new Car("Ford ", "mustang  ", 2020);
		c4.setFuelType("hybrid");
		c4.setPrice(46000.00);
		
		Car [] cars = new Car[4];
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		cars[3] = c4;
		
		
		
		
		
		
		 
		Scanner keyIn = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter the array index :");
		int index = keyIn.nextInt();
		for(int i = 0; i<4; i++) {
			if(cars[i].isComparable(cars[index])) {
				counter++;
				System.out.println("Car "+cars[i]+" is comparable to " + cars[index]);
			}
			if(counter==0) {
				System.out.println("No comparable cars found!");
			}
		}
		keyIn.close();
		
		
		
		
		
		
	}
	
	public static boolean checkISBN(int number) {

		int productSum = 0;

		int originalNumber = number;

		int i = 1;

		

		while(number != 0) {

			productSum += (number%10)*i; 

			number = number/10;

			i++;

		}

		if(productSum % 11 == 0) {

			System.out.println("ISBN number is "

		+ originalNumber + " and it is a Valid ISBN number...!!");

			return true;

		}

		else {

			System.out.println("ISBN number is "

		+ originalNumber + " and it is not a Valid ISBN number...!!");

			return false;

		}		

	}
	
	
	
	
	
	//Recursive Method.
	public static void printTriangle(int sideLength) {
		if(sideLength < 0) {
			return;
		}
		printTriangle(sideLength-1);
			for(int i=0; i<sideLength; i++) {
				System.out.print("[]");
		}
			System.out.println();
			
	}
	
	//Generating a password of a given length with at least one digit and one special character(pg. 213).
	public static String generatePassword(int givenLength) {
		final char[] ALPHA_UPPER_CHARACTERS = { 'A', 'B', 'C', 'D',
				'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		final char[] ALPHA_LOWER_CHARACTERS = { 'a', 'b', 'c', 'd',
				'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		final char[] NUMERIC_CHARACTERS = { '0', '1', '2', '3', '4',
				'5', '6', '7', '8', '9' };
		final char[] SPECIAL_CHARACTERS = { '~', '`', '!', '@', '#',
				'$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', '[', '{',
				']', '}', '\\', '|', ';', ':', '\'', '"', ',', '<', '.', '>', '/',
		'?' };
		String password="";
		char[][] passwordArray = {ALPHA_UPPER_CHARACTERS, ALPHA_LOWER_CHARACTERS, NUMERIC_CHARACTERS, SPECIAL_CHARACTERS };

		//password = passwordArray[2][(int)(Math.random()*passwordArray[2].length)]+"";
		//password += passwordArray[3][(int)(Math.random()*passwordArray[3].length)];
		while((givenLength)>0) {
			int i = (int)(Math.random()*4);
			int j = (int)(Math.random()*passwordArray[i].length);
			password += passwordArray[i][j]+"";
			givenLength--;
		}
		password = password.replace(password.charAt((int)(Math.random()*8)), passwordArray[2][(int)(Math.random()*passwordArray[2].length)]);
		
		return password;
	}

	//Lab 5
	public static void lab() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = input.next();
		System.out.println();
		for(int i=0; i<word.length(); i++) {
			for(int j=0; j<word.length()-i; j++) {
				System.out.print(word.charAt(j) + "\t");
			}
			System.out.println();
		}
		for(int i=1; i<word.length(); i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(word.charAt(j) + "\t");
			}
			System.out.println();
		}
		input.close();
	}
	
	//Generates a random Matrix
	public static void generateMatrix() {
		int[][] matrix = new int[3][3];
		int count = 1;
		int randomOne ;
		int randomTwo ;
		//Generates a random matrix
		while(count<=9) {
			randomOne = (int)(Math.random()*3);
			randomTwo = (int)(Math.random()*3);
			if(matrix[randomOne][randomTwo] == 0) {
				matrix[randomOne][randomTwo] = count;
				count++;
			}
		}
		//Displays a matrix.
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//Prints all the substring of a word, sorted by length.
	public static void p4_12() {
		String word = "rumo";
		for (int i = 1; i <= word.length(); i++) {
		     for (int j = 0; j <= word.length() - i ; j++) {
		    	 System.out.println("   j is : "+ j + " | j + i is : "+ (j+i));
		  System.out.println(word.substring(j, j + i));
		     }
		}		
	}
	
	//Print the number of vowels.
	public static void p4_3d() {
		String str = "Woods Are Lovely Dark And Deep.";
		char[] vowels = {'a', 'e', 'i', 'o', 'u','A','E', 'I','O','U'};
		int counter =0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<vowels.length; j++) {
				if(vowels[j] == str.charAt(i)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
	
	
	//Print the string, with all the vowels replaced by an underscore.
	public static void p4_3c() {
		String str = "Woods Are Lovely Dark And Deep.";
		char[] vowels = {'a', 'e', 'i', 'o', 'u','A','E', 'I','O','U'};
		for(int i= 0; i<vowels.length; i++) {
			str = str.replace(vowels[i], '_');
		}
		System.out.println(str);
	}
	
	//Every second letter of the string.
	public static void p4_3b() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of string : ");
		while(input.hasNext()) {
			char secondDigit = input.next().charAt(1);
			System.out.println(secondDigit);
		}
		input.close();
	}
	
	//Printing only uppercase letters in the string.
	public static void p4_3a() {
		String str = "Woods Are Lovely Dark And Deep.";
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i)+" ");
			}
		}
		
	}
	
	//All adjacent duplicates.(page 188)
	public static void p4_2d() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the series of numbers to check adjacent duplicates : ");
		int digit1;
		int digit2;
		int lastPrinted = 0;
		digit1 = input.nextInt();
		while(input.hasNextInt()) {
			digit2 = input.nextInt();
			if(digit1 == digit2) {
				if(lastPrinted != digit1) {
					lastPrinted = digit1;
					System.out.print(digit1+" ");
				}			
			}
			digit1 = digit2;
		}
		
		input.close();
	}
	
	//The sum of all odd digits of an input.
	public static void p4_1e() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number for which you want \nto perform the sum of odd Digits : ");
		int number = input.nextInt();
		int digit = number%10;
		int sum = 0;
		while(number != 0) {
			digit = number%10;
			if(digit%2 == 1) {
				sum = sum + digit;
			}
			number = number/10;
		}
		System.out.println("Sum of digits is : " + sum);
		input.close();
	}
	
	//Sum of all squares between 1 and 100.
	public static void p4_1b(){
		int sum = 0;
		int square, counter = 1;
		square = counter*counter;
		while(square<=100) {
			sum = sum +square;
			counter++;
			square = counter * counter;
		}
		System.out.println(sum);
	}
}
