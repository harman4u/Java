import java.util.Scanner;

public class Lab_6 {

	public static void main(String[] args) {
		String[] textArray  = new String[5];
		Scanner keyIn = new Scanner(System.in);
		System.out.println("Enter 5 words:");
		for(int i=0; i<textArray.length; i++) {
			textArray[i] = keyIn.next();
		}
		System.out.println();
		
		for(int i=0; i<textArray.length; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print("~");
			}
			String desiredString = textArray[i].substring(0, textArray[i].length()/2) 
					+ "*" + textArray[i].substring(textArray[i].length()/2+1, textArray[i].length());
			System.out.print(desiredString);
			//char c = textArray[i].charAt((textArray[i].length()/2));
			//textArray[i].replace(c, '*');
			//System.out.print(textArray[i].replace(c, '*'));
			for(int j= 0; j<i ; j++) {
				System.out.print("~");
			}
			System.out.println();
		}
		keyIn.close();
	}

}
