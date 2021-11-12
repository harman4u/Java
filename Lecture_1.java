import java.util.Scanner;

public class Lecture_1 {
	public static void main(String [] args) {
		Lecture_1 ob=new Lecture_1();
		ob.Pattern_11();	
	}
	
	public void Pattern_11() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		int count;
		for(int i=1; i<=numberOfRows;i++) {
			count = numberOfRows;
			for(int j=numberOfRows; j>=i;j--) {
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
	
	public void Pattern_10() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		int count;
		for(int i=1;i<=numberOfRows; i++) {
			count=1;
			for(int j=1;j<=(2*i-1);j++) {
				if(j<i) {
					System.out.print(count);
					count++;
				}
				else if(j==i) {
					System.out.print(count);
					count--;
				}
				else {
					System.out.print(count);
					count--;
				}
			}
			System.out.println();
		}
	}
	
	public void Pattern_9() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		for(int i=1;i<=numberOfRows; i++) {
			int count = i;
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
	
	public void Pattern_8() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		int count = 1;
		input.close();
		for(int i=1;i<=numberOfRows; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	
	public void Pattern_7() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		for(int i=1;i<=numberOfRows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void Pattern_6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int numberOfRows = input.nextInt();
		input.close();
		for(int i=1; i<=numberOfRows; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void Pattern_5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to insert : ");
		int numberOfRows = input.nextInt();
		input.close();
		for(int i=1;i<=numberOfRows;i++) {
			for(int j=numberOfRows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void Pattern_4() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=6;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=6; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void Pattern_3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		System.out.println("Printing equilatral triangle : ");
		input.close();
		for(int i=1; i<=numberOfRows; i++) {
			for(int j=numberOfRows;j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=i; j>=1;j--) {
				System.out.print("*");
			}
			for(int j=i; j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void Pattern_2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		System.out.println("Printing the inverted right angled triangle .......");
		for(int i=numberOfRows; i>=1;i--) {
			for(int j=i; j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void Pattern_1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int numberOfRows = input.nextInt();
		input.close();
		System.out.println("Printing the right triangle below.......");
		for(int i=1;i<=numberOfRows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void armstrongNumber(int number) {
		int lastDigit = number%10;
		int qotiont = number/10;
		int sumCuberoot = 0;
		int copyNumber = number;
		while(qotiont!=0) {
			qotiont = number/10;
			int cuberoot = 1;
			for(int i=1;i<=3;i++) {
				cuberoot = cuberoot*lastDigit;
			}
			sumCuberoot = sumCuberoot + cuberoot;
			lastDigit = qotiont%10;
			number = qotiont;
		}
		if(sumCuberoot == copyNumber) {
			System.out.println(copyNumber + " : is a Armstrong Number");
		}
		else {
			System.out.println(copyNumber + " : is not a Armstrong Number");
		}
	}
	
	public void palindromeNumber(int number) {
		int reversedNumber = reverseNumber(number);
		if(reversedNumber==number) {
			System.out.println(number + " : is a Palindrome Number.");
		}
		else {
			System.out.println(number + " : is not a Palindrome Number.");
		}
	}
	
	public void allPrimeNumbers() {
		boolean flag = false;
		for(int i=2;i<=100;i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(i+", ");
			}
			flag = false;
		}
	}
	
	public void fibonacciSequence() {
		int firstNumber = 0;
		int secondNumber = 1;
		int result;
		System.out.print(firstNumber+", ");
		System.out.print(secondNumber+", ");
		for(int i=0; i<=50; i++) {
			result = firstNumber + secondNumber;
			System.out.print(result+", ");
			firstNumber = secondNumber;
			secondNumber = result;
		}
	}
	
	public void isPrime(int number) {
		boolean flag = false;
		for(int i=2; i<number;i++) {
			if(number%i == 0) {
				flag = false;
				break;
			}
			else {
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println(number + " : is a prime number.");
		}
		else {
			System.out.println(number + " : is a non prime number");
		}
	}
	
	public String reverseString(String stringToReverse) {
		char lastChar ;
		String reversedString = "";
		int totalChars = stringToReverse.length();
		while(totalChars != 0) {
			lastChar = stringToReverse.charAt(totalChars-1);
			reversedString = reversedString + lastChar;
			totalChars--;
		}
		return reversedString;
	}
	
	public int reverseNumber(int numberToReverse) {
		int reversedNumber=0, qotion, remainder;
		remainder = numberToReverse%10;
		qotion = numberToReverse/10;
		while(qotion!=0) {
			qotion = numberToReverse/10;
			remainder = numberToReverse%10;
			reversedNumber = reversedNumber*10 + remainder;
			numberToReverse = qotion;
		}
		return reversedNumber;
	}
	
	
	public static int fictorialOfNumber(int number) {
		int fictorial = 1;
		while(number>0) {
			fictorial = fictorial * number;
			number--;
		}
		return fictorial;
	}
	
	public static void swapNumbers_1() {
		int number_1=20, number_2=30;
		int swap;
		swap = number_1;
		number_1 = number_2;
		number_2 = swap;
		System.out.println(number_1);
		System.out.println(number_2);
	}
	
	public static void swapNumbers_2() {
		int number_1 = 10, number_2 = 20;
		number_1 = number_1 + number_2;
		number_2 = number_1 - number_2;
		number_1 = number_1 - number_2;
		System.out.println(number_1);
		System.out.println(number_2);
	}
	
	public static void calculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number : ");
		int secondNumber = input.nextInt();
		int result;
		System.out.println("Enter the symbol : ");
		String symbol = input.next();
		
		switch(symbol) {
			case "+" : result = firstNumber + secondNumber;
			System.out.println("Addition is : " + result);
			break;
			case "-" : result = firstNumber - secondNumber;
			System.out.println("Subtraction is : "+ result);
			break;
			case "*" : result = firstNumber*secondNumber;
			System.out.println("Multiplication is : "+result);
			break;
			case "/" : result = firstNumber/secondNumber;
			System.out.println("Division is : " + result);
			break;
			default : System.out.println("Incorrect Sysmbol...");
		}
	}
	
	public static String leapYear(int year) {
		String leapOrNonLeap = "";
		int remainder = year%4;
		if(remainder == 0) {
			leapOrNonLeap = "leap";
		}
		else {
			leapOrNonLeap = "Non Leap";
		}
		return leapOrNonLeap;
	}
	
	public static String checkOddEven(int verifiedNumber) {
		String oddOrEven = "";
		int remainder = verifiedNumber%2;
		if(remainder == 0) {
			oddOrEven = "Even";
		}
		else {
			oddOrEven = "Odd";
		}
		return oddOrEven;
	}
}
