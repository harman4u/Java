
public class RecursionPractice {
	
	
	public static void main(String[] args) {
		System.out.println(endX("xhixhix") );
	}
	
	/**
	 * Given a string, return recursively a "cleaned" string where adjacent chars that 
	 * are the same have been reduced to a single char. So "yyzzza" yields "yza".
	 * stringClean("yyzzza") : "yza"
	 * stringClean("abbbcdd") : "abcd"
	 * stringClean("Hello") : "Helo"
	 * @param str
	 * @return
	 */
	public String stringClean(String str) {
		  if(str.length() == 1) {
			  return str;
		  }
		  if(str.charAt(0) == str.charAt(1)) {
			  
			  return stringClean(str.substring(1));
		  }
		  return str.charAt(0) + stringClean(str.substring(1));
	}

	
	/**
	 * Given a string, compute recursively (no loops) the number of "11" substrings in 
	 * the string. The "11" substrings should not overlap.
	 * count11("11abc11") : 2
	 * count11("abc11x11x11") : 3
	 * count11("111") : 1
	 * @param str
	 * @return
	 */
	public static int count11(String str) {
		  if(str.length() < 2) {
			  return 0;
		  }
		  if("11".equals(str.substring(0, 2))) {
			  return 1 + count11(str.substring(2));
		  }
		  return count11(str.substring(1));
	}
	
	/**
	 * Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
	 * countAbc("abc") : 1
	 * countAbc("abcxxabc") : 2
	 * countAbc("abaxxaba") : 2
	 * @param str
	 * @return
	 */
	public int countAbc(String str) {
		  if(str.length() < 3) {
			  return 0;
		  }
		  if("abc".equals(str.substring(0,3)) || "aba".equals(str.substring(0,3))) {
			  return 1 + countAbc(str.substring(1));
		  }
		  return countAbc(str.substring(1));
	}

	
	/**
	 * We'll say that a "pair" in a string is two instances of a char separated by a char. 
	 * So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 
	 * for A and 1 for x. Recursively compute the number of pairs in the given string.
	 * countPairs("axa") : 1
	 * countPairs("axax") : 2
	 * countPairs("axbx") : 1
	 * @param str
	 * @return
	 */
	public static int countPairs(String str) {
		  if(str.length() < 3) {
			  return 0;
		  }
		  if(str.charAt(0) == str.charAt(2)) {
			  return 1 + countPairs(str.substring(1));
		  }
		  return countPairs(str.substring(1));
	}
	
	/**
	 * Given a string, compute recursively a new string where all the lowercase 'x' chars 
	 * have been moved to the end of the string.
	 * endX("xxre") : "rexx"
	 * endX("xxhixx") : "hixxxx"
	 * endX("xhixhix") : "hihixxx"
	 * @param str
	 * @return
	 */
	public static String endX(String str) {
		  if(str.length() == 0) {
			  return str;
		  }
		  if(str.charAt(0) == 'x') {
			  return endX(str.substring(1)) + "x";
		  }
		  return str.charAt(0) + endX(str.substring(1));
	}

	
	/**
	 * Given a string, compute recursively a new string where identical chars that are 
	 * adjacent in the original string are separated from each other by a "*".
	 * pairStar("hello") : "hel*lo"
	 * pairStar("xxyy") : "x*xy*y"
	 * pairStar("aaaa") : "a*a*a*a"
	 * @param str
	 * @return
	 */
	public static String pairStar(String str) {
		  if(str.length() < 2) {
			  return str;
		  }
		  if(str.charAt(0) == str.charAt(1)) {
			  return str.charAt(0) + "*" + pairStar(str.substring(1));
		  }
		  return str.charAt(0) + pairStar(str.substring(1));
	}

	
	/**
	 * Given a string, compute recursively a new string where all the adjacent 
	 * chars are now separated by a "*".
	 * allStar("hello") : "h*e*l*l*o"
	 * allStar("abc") : "a*b*c"
	 * allStar("ab") : "a*b"
	 * @param str
	 * @return
	 */
	public static String allStar(String str) {
		  if(str.length() <= 1) {
			  return str;
		  }
		  return str.charAt(0) + "*" + allStar(str.substring(1));
	}
	
	/**
	 * Given an array of ints, compute recursively if the array contains somewhere a value 
	 * followed in the array by that value times 10. We'll use the convention of considering 
	 * only the part of the array that begins at the given index. In this way, a recursive call 
	 * can pass index+1 to move down the array. The initial call will pass in index as 0.
	 * array220([1, 2, 20], 0) : true
	 * array220([3, 30], 0) : true
	 * array220([3], 0) : false
	 * @param nums	an integer array.
	 * @param index	index of an array.
	 * @return		true if the array contains somewhere a value followed in the array 
	 					by that value times 10.
	 */
	public static boolean array220(int[] nums, int index) {
		  if(index >= nums.length-1) {
			  return false;
		  }
		  if(nums[index]*10 == nums[index+1]) {
			  return true;
		  }
		  return array220(nums, index+1);
	}
	
	/**
	 * Given an array of ints, compute recursively the number of times that the value 
	 * 11 appears in the array. We'll use the convention of considering only the part 
	 * of the array that begins at the given index. In this way, a recursive call can 
	 * pass index+1 to move down the array. The initial call will pass in index as 0.
	 * array11([1, 2, 11], 0) : 1
	 * array11([11, 11], 0) : 2
	 * array11([1, 2, 3, 4], 0) : 0
	 * @param nums	an array of integers.
	 * @param index	index of an array.
	 * @return	returns number of times 11 appears an array.
	 */
	public static int array11(int[] nums, int index) {
		  if(index == nums.length) {
			  return 0;
		  }
		  if(nums[index] == 11) {
			return 1 + array11(nums, index+1);  
		  }
		  return array11(nums, index+1);
	}
	
	
	/**
	 * Given an array of ints, compute recursively if the array contains a 6. We'll use 
	 * the convention of considering only the part of the array that begins at the given 
	 * index. In this way, a recursive call can pass index+1 to move down the array. The 
	 * initial call will pass in index as 0.
	 * array6([1, 6, 4], 0) : true
	 * array6([1, 4], 0) : false
	 * array6([6], 0) : true
	 * @param nums	array of integers.
	 * @param index	index of an array.
	 * @return	returns true if 6 is found otherwise false.
	 */
	public static boolean array6(int[] nums, int index) {
		if(index == nums.length) {
			return false;
		}
		if(nums[index] == 6) {
			return true;
		}
		return array6(nums, index+1);
	}
	
	/**
	 * Given a string, compute recursively a new string where all the 'x' chars have been removed.
	 * noX("xaxb") : "ab"
	 * noX("abc") : "abc"
	 * noX("xx") : ""
	 * @param str	any string to be tested.
	 * @return	a string without any 'x' in it.
	 */
	public String noX(String str) {
		  if(str.length() == 0) {
			  return str;
		  }
		  if(str.charAt(0) == 'x') {
			  return ""+ noX(str.substring(1));
		  }
		  return str.charAt(0) + noX(str.substring(1));
	}
	
	/**
	 * Given a string, compute recursively (no loops) a new string where all appearances 
	 * of "pi" have been replaced by "3.14".
	 * changePi("xpix") : "x3.14x"
	 * changePi("pipi") : "3.143.14"
	 * changePi("pip") : "3.14p"
	 * @param str	Any string value.
	 * @return	String in which "pi" have been replaced by "3.14
	 */
	public String changePi(String str) {
		  if(str.length() < 2) {
			  return str;
		  }
		  if(str.charAt(0) == 'p' & str.charAt(1) == 'i' ) {
			  return "3.14" + changePi(str.substring(2));
		  }
		  return str.charAt(0) + changePi(str.substring(1));
	}
	
	/**
	 * Given a string, compute recursively (no loops) a new string where all the lowercase 
	 * 'x' chars have been changed to 'y' chars.
	 * changeXY("codex") : "codey"
	 * changeXY("xxhixx") : "yyhiyy"
	 * changeXY("xhixhix") : "yhiyhiy"
	 * @param str
	 * @return
	 */
	public static String changeXY(String str) {
		char ch;
		if(str.length() == 0) {
			return str;
		}
		ch = str.charAt(0);
		if(str.charAt(0) == 'x') {
			return 'y' + changeXY(str.substring(1));
		}
		return ch + changeXY(str.substring(1));
	}

	
	/**
	 * Given a string, compute recursively (no loops) the number of times lowercase "hi" 
	 * appears in the string.
	 * countHi("xxhixx") : 1
	 * countHi("xhixhix") : 2
	 * countHi("hi") : 1
	 * @param str 		the string in which we need to search.
	 * @return			number of times "hi" appeared in the string.
	 */
	public int countHi(String str) {
		if(str.length() == 0) {
			return 0;
		}
		if(str.charAt(0) == 'h' && str.length() > 1) {
			if(str.charAt(1) == 'i') {
				return 1 + countHi(str.substring(1));
			}
		}
		return countHi(str.substring(1));
	}
	
	/**
	 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	 * countX("xxhixx") : 4
	 * countX("xhixhix") : 3
	 * countX("hi") : 0
	 * @param str		the string in which we need to search.
	 * @return			number of times "x" appeared in the string.
	 */
	public int countX(String str) {
		  if(str.length() == 0) {
			  return 0;
		  }
		  if(str.charAt(0) == 'x') {
			  return 1 + countX(str.substring(1));
		  }
		  return countX(str.substring(1));
	}
	
	/**
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
	 * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost 
	 * digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 * count7(717) : 2
	 * count7(7) : 1
	 * count7(123) : 0
	 * @param n		positive number.
	 * @return		number of times 7 appeared
	 */
	public static int count7(int n) {
		  if(n == 0) {
			  return 0;
		  }
		  if(n%10 == 7) {
			  return 1 + count7(n/10);
		  }
		  return count7(n/10);
	}
	
	/**
	 * Given a non-negative int n, compute recursively (no loops) the count of the 
	 * occurrences of 8 as a digit, except that an 8 with another 8 immediately to 
	 * its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the 
	 * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost 
	 * digit (126 / 10 is 12).
	 * count8(8) : 1
	 * count8(818) : 2
	 * count8(8818) : 4 
	 * @param n  	positive number
	 * @return		occurrences of 8 as a digit, except that an 8 
	  				with another 8 immediately to 
	  				its left counts double
	 */
	public static int count8(int n) {
		 if(n == 0) {
			  return 0;
		 }
		if(n%10 == 8) {
			if(n%100 == 88) {
				return 2 + count8(n/10);
			}
			return 1 + count8(n/10);
		}
		return count8(n/10);
	}
	
	/**
	 * Given a non-negative int n, return the sum of its digits recursively (no loops). 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide 
	 * (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 * sumDigits(126) : 9
	 * sumDigits(49)  : 13
	 * sumDigits(12)  : 3
	 * @param n
	 * @return
	 */
	public static int sumDigits(int n) {
		 if(n < 10) {
			  return n;
		  }
		  return n%10 + sumDigits(n/10);
	}

	/** 							<NOT SOLVED>
	 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 
	 * 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or 
	 * multiplication) the total number of blocks in such a triangle with the given number of rows.
	 * triangle(0) : 0
	 * triangle(1) : 1
	 * triangle(2) : 3
	 * @param rows		given number of rows.
	 * @return			the total number of blocks in a triangle 
	  					with the given number of rows.
	 */
	public static int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		return rows + triangle(rows-1);
	}
	
	/**
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the 
	 * normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a 
	 * raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without 
	 * loops or multiplication).
	 * bunnyEars2(0) : 0
	 * bunnyEars2(1) : 2
	 * bunnyEars2(2) : 5
	 * @param bunnies 	number of bunnies
	 * @return			returns number of ears according to the question.
	 */
	public static int bunnyEars2(int bunnies) {
		if(bunnies == 0) {
			return 0;
		}
		if(bunnies == 1) {
			return 2;
		}
		if(bunnies == 2) {
			return 5;
		}
		return bunnyEars2(bunnies-2) + 5;
	}
	
	/**
	 * We have a number of bunnies and each bunny has two big floppy ears. We want to 
	 * compute the total number of ears across all the bunnies recursively (without 
	 * loops or multiplication).
	 * bunnyEars(0) : 0
	 * bunnyEars(1) : 2
	 * bunnyEars(2) : 4
	 * @param bunnies	total number of bunnies.
	 * @return  		total number of ears.
	 */
	public static int bunnyEars(int bunnies) {
		if(bunnies == 0) {
			return 0;
		}
		  if(bunnies == 1) {
			  return 2;
		  }
		  return 2 + bunnyEars(bunnies-1);
	}
	
	/**
	 * Printing vertical Numbers.
	 * @param number 	any positive number.
	 */
	public static void writeVertical(int number) {
		if(number < 0) {
			System.out.println("Positive number was expected...!!");
			System.exit(0);
		}
		if(number < 10) {
			System.out.println(number);
		}
		else {
			writeVertical(number/10);
			System.out.println(number%10);
		}
	}
	
	/**
	 * This method reverse the given number.
	 * @param number any positive number
	 */
	public static void reverseNumber(int number) {
		if(number<10) {
			System.out.println(number);
		}
		else {
			System.out.print(number%10);
			reverseNumber(number/10);
		}
	}
	
	/**
	 * This method generates the sequence of number starting from 1 to given number. 
	 * @param number	any positive number.
	 */
	public static void writeNumbers(int number) {
		if(number <= 1) {
			System.out.print(number + " ");
		}
		else {
			writeNumbers(number-1);
			System.out.print(number + " ");
		}
	}
	
	/**
	 * This method writes the sequence of numbers in the reverse order.
	 * @param number 	any number.
	 */
	public static void reverseWriteNumber(int number) {
		if(number == 0) {
			System.out.print(number);
		}
		if(number < 0) {
			System.out.print(number + " ");
			reverseWriteNumber(number+1);
		}
		//number > 0
		if(number > 0) {
			System.out.print(number + " ");
			reverseWriteNumber(number-1);
		}
	}
	
	/**
	 * This method returns a double number after computing the power of the given number.
	 * power can have any value either positive or negative.
	 * @param base		the number for which the power to be calculated.
	 * @param power		the power of the given number.
	 * @return			double number after calculating the value of the power.
	 */
	public static double power(int base, int power) {
		if(power == 0) {
			return 1;
		}
		if(power > 0) {
			return base * power(base, power-1);
		}
		if(power<0) {
			return (1.0/base)*power(base, power+1);
		}
		return 0;
	}
	
	/**
	 * This method calculates the Factorial ,of the given number.
	 * @param n		the number for which one wants to calculate the factorial.
	 * @return		an integer calculated as factorial.
	 */
	public static int factorial(int n) {
		if(n<0) {
			System.out.println("Illegal argument,\nPositive number was expected...!!");
			System.exit(0);
		}
		if(n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	
	/**
	 * This is an enhanced version of finding the factorial of a number
	 * @param number
	 * @param factorial
	 * @return  the factorial of the number.
	 */
	public static int tailRecursionFactorial(int number, int factorial) {
		if(number < 0) {
			System.out.println("negative");
			return 1;
		}
		if(number == 1) {
			return factorial;
		}
		return tailRecursionFactorial(number-1, factorial * number);
	}
	
	/**
	 * This is a wrapper method for the tailRecursionFactorial(int number, int factorial)
	 * @param number 		number for which you want to calculate the factorial.
	 * @return				It returns the factorial of the number.
	 */
	public static int wrapperFactorial(int number) {
		return tailRecursionFactorial(number, 1);
	}
	
	/**
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive 
	 * definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
	 * Each subsequent value is the sum of the previous two values, so the whole 
	 * sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) 
	 * method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
	 * fibonacci(0) : 0
	 * fibonacci(1) : 1
	 * fibonacci(2) : 1
	 * @param n		the number you want to return.
	 * @return		It returns the nth number in the sequence.
	 */
	public static int fibonacciSequenceNumber(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return fibonacciSequenceNumber(n-1) + fibonacciSequenceNumber(n-2) ;
	}
	
	/**
	 * This method generates one of the most popular Fibonacci Sequence in Mathematics and Computer Science.
	 * @param firstNumber		First number of the sequence.
	 * @param secondNumber		Second number of the sequence.
	 * @param numberOfTerms		Number of terms to be printed after the first and second numbers.
	 */
	public static void myFibonacciSequence(int firstNumber, int secondNumber, int numberOfTerms) {
		if(numberOfTerms < 1) {
			System.out.print(firstNumber + " " + secondNumber + " ");
		}
		else {
			System.out.print(firstNumber + " " + secondNumber + " ");
			firstNumber = firstNumber + secondNumber;
			secondNumber = firstNumber + secondNumber;
			myFibonacciSequence(firstNumber, secondNumber, numberOfTerms-2);
		}
	}
	
	/**
	 * This method generates one of the most popular Fibonacci Sequence in Mathematics and Computer Science.
	 * @param firstNumber		First number of the sequence.
	 * @param secondNumber		Second number of the sequence.
	 * @param numberOfTerms		Number of terms to be printed after the first and second numbers.
	 */
	public static void fibonacciSequence(int firstNumber, int secondNumber, int numberOfTerms) {
		if(numberOfTerms < 0) {
			System.out.print(firstNumber + " " + secondNumber + " ");
		}
		if(numberOfTerms == 0) {
			System.out.print(firstNumber +" ");
		}
		else if(numberOfTerms == 1) {
			System.out.print(secondNumber +" ");
		}
		else {
			System.out.print(secondNumber + " ");
			fibonacciSequence(secondNumber, firstNumber + secondNumber, numberOfTerms-1);
		}
	}

	/**
	 * Binary search to find the number in the array. If found then displays the message
	 * if not found then corresponding message is declared.
	 * @param array				array to search in.
	 * @param first				first element of the array.
	 * @param last				last element of the array.
	 * @param numberToSearch	number to search in the array.
	 */
	public static void binarySearch(int[] array, int first, int last, int numberToSearch) {
		int middle = (first+last)/2;
		if(first > last) {
			System.out.println("Number not found...!!");
		}
		else {
			if(numberToSearch == array[middle]) {
				System.out.println("Found: " + numberToSearch + " at " + (middle+1) + ".");
			}
			else if(numberToSearch > array[middle]) {
				System.out.println("middle : " + middle + "  " + array[middle]);
				binarySearch(array, middle+1, last, numberToSearch);
			}
			else if(numberToSearch < array[middle]) {
				System.out.println("middle : " + middle+ "  " + array[middle]);
				binarySearch(array, first, middle-1, numberToSearch);
			}
		}
	}
	
	/**
	 * This method sorts the array given as parameter.
	 * @param intArray		Array to sort.
	 */
	public static void sortArray(int [] intArray) {
		    
        int temp = 0;    
 
        //print original array    
       System.out.println("Original array: ");    
       for (int i = 0; i <intArray.length; i++) {     
           System.out.print(intArray[i] + " ");    
        }    
        //Sort the array in ascending order using two for loops    
        for (int i = 0; i <intArray.length; i++) {     
          for (int j = i+1; j <intArray.length; j++) {     
              if(intArray[i] >intArray[j]) {      //swap elements if not in order
                 temp = intArray[i];    
                 intArray[i] = intArray[j];    
                 intArray[j] = temp;    
               }     
            }     
        } 
        //print sorted array    
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <intArray.length; i++) {     
            System.out.print(intArray[i] + " ");    
        } 
	}
}


