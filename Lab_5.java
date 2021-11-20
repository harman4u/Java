import java.util.Scanner;

public class Lab_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = input.next();
		System.out.println();
		for(int i=0; i<word.length(); i++) {
			for(int j=i; j>=0; j--) {
				System.out.print(word.charAt(j)+"\t");
			}
			System.out.println();
		}
		for(int i=word.length()-2; i>=0; i--) {
			for(int j=i; j>=0;j--) {
				System.out.print(word.charAt(j)+"\t");
			}
			System.out.println();
		}
		
		input.close();
	}

}
