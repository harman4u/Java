package winter2019;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Driver {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Starting the program....!!");
		PrintWriter outputStream = null;
		long elapsedTime = 0;
		double random = 0.0;
		int counter = 0;
		for(int j=1; j<100; j++) {
			try {
				outputStream = new PrintWriter(new FileOutputStream("myTextFileForRandomVariable.txt"));
				if(j==1) {
					System.out.println("Found the file...!!");
					System.out.println("Writing on it....\n.\n.\n.\n.");
					
				}
				for(int i=1; i<1000000; i++) {
					random += Math.random(); 
					counter++;
				}
				outputStream.println(j + "  " + random/counter + "\t\t");
				//System.out.println(random/counter);
				
			}
			catch(FileNotFoundException e) {
				System.out.println("File not created...!!");
				System.out.println("Ending the program...!!");
				System.exit(0);
			}
			outputStream.close();
			System.out.println(".");
			
		}
		System.out.println("Succesfully written...!!");
		System.out.println("Ending the program....!!");
		elapsedTime = System.nanoTime() - startTime;
		System.out.println(elapsedTime);

		//System.out.println(elapsedTime);
		
	}
	
	public static boolean checkConditionFor52Weeks(String date_1, String date_2) {
		String[] date_1Array = date_1.split("-");
		String[] date_2Array = date_2.split("-");
		int year_1 = Integer.parseInt(date_1Array[0]);
		int year_2 = Integer.parseInt(date_2Array[0]);
		int month_1 = Integer.parseInt(date_1Array[1]);
		int month_2 = Integer.parseInt(date_2Array[1]);
		int day_1 = Integer.parseInt(date_1Array[2]);
		int day_2 = Integer.parseInt(date_2Array[2]);
		
		if(year_2 - year_1 > 1) { //When difference of years is not zero.
				return false;
		}
		if(year_2 - year_1 < 0){
			return false;
		}
		if(  (year_2 - year_1 == 0) && (month_2 >= month_1) ) {
			if(!(month_1 == 1 && month_2 ==12)) {
				return true;
			}
			else if(month_1 == 1 && month_2 ==12){
					if(day_1 == 1 && day_2 == 31) {
						return false;
					}
					else {
						return true;
					}
			}
		}
		else {
			return false;
		}
		if(year_2 - year_1 == 1) {
			if(month_1 >= month_2) {
				if((day_1 > day_2) && day_1 - day_2 >= 2) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	
	
	
	boolean checkFourWeeksCondition(String date_1, String date_2) {
		String[] date_1Array = date_1.split("-");
		String[] date_2Array = date_2.split("-");
		int year_1 = Integer.parseInt(date_1Array[0]);
		int year_2 = Integer.parseInt(date_2Array[0]);
		int month_1 = Integer.parseInt(date_1Array[1]);
		int month_2 = Integer.parseInt(date_2Array[1]);
		int day_1 = Integer.parseInt(date_1Array[2]);
		int day_2 = Integer.parseInt(date_2Array[2]);
		
		if(year_2 - year_1 > 1) {
			return true;
		}
		if(year_2 - year_1 < 0) {
			return false;
		}
		if(year_2 == year_1) {
				if(month_2 - month_1 > 1) {
					return true;
				}
				if(month_2 == month_1) {
					if(day_2 - day_1 > 28) {
						return true;
					}
					else {
						return false;
					}
				}
				if(month_2 - month_1 == 1) {
					if(day_1 - day_2 < 3) {
						return true;
					}
					else {
						return false;
					}
				}
		}
		if(year_2 - year_1 == 1) {
			if(month_1 != 12) {
				return true;
			}
			else {
				if(month_2 != 1) {
					return true;
				}
				else {
					if(day_1 - day_2 <= 2) {
						return true;
					}
					else {
						return false;
					}
				}
			}
		}
		return false;
	}

}
