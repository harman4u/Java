import java.util.Scanner;

public class TranslateToWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number less than 1000 : ");
		int number = input.nextInt();
		System.out.println(generateWord(number));
		input.close();

	}
	
	public static String generateWord(int number) {
		String onesPlace, tensPlace, hundredsPlace;
		if(number%100 <10) {
			tensPlace = "";
			onesPlace = digits(number%10);
		}
		else if(number%100 >9   &&    number%100 < 20) {
			tensPlace = teenNumbers(number%100);
			onesPlace = "";
		}
		else {
			tensPlace = tens(number%100);
			onesPlace = digits(number%10);
		}
		number = number/10;
		number = number/10;
		hundredsPlace = digits(number);
		if(hundredsPlace.equals("")) {
			return (tensPlace +""+ onesPlace+" Only").trim();
		}
		return  (hundredsPlace+" Hundred " + tensPlace +""+ onesPlace+" Only").trim();
	}
	
	public static String digits(int digit) {
		String[] array = {" Zero", " One"," Two", " Three", " Four", " Five", 
				" Six", " Seven", " Eight", " Nine"};
		if(digit == 0) {
			return "";
		}
		return array[digit];
	}
	
	public static String teenNumbers(int number) {
		String[] array = {"Ten", "Eleven", "Tweleve", "Thirteen","Fourteen", "Fifteen", 
				"Sixteen", "Seventeen", "Eighteen","Nineteen"};
		int position = number%10;
		return array[position];
	}
	
	public static String tens(int number) {
		String[] array = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
		//number = number/10;
		int position = number/10 - 2;		
		return array[position];
	}

}
