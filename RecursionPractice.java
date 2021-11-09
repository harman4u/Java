
public class RecursionPractice {
	public static void main(String[] args) {
		//define original array     
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};     
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
        System.out.println();
        binarySearch(intArray, 0, intArray.length-1, 12);
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
				binarySearch(array, middle+1, last, numberToSearch);
			}
			else if(numberToSearch < array[middle]) {
				binarySearch(array, first, middle-1, numberToSearch);
			}
		}
	}
}


