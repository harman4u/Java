//-------------------------------------------------------------------------
//Assignment 3
//Written By: HARMANVIR SINGH (Student ID: 40019114)
//For COMP 248 Section U- Winter 2021
//-------------------------------------------------------------------------



/** This program randomly generate a 3X3 matrix and check if the matrix is the
	magic square. It tests two features:
 		* The numbers 1,2,3...9 occur in the matrix.
 		* Sum of rows and columns and diagonals equal to each other.
**/



public class MagicSquare {

	public static void main(String[] args) {
		int n = 3;  //rows and columns are 3.
		int number = 1; //Number that occur in each little square of matrix to assign the value in the array.
		int row;
		int column;
		
		//Declaring and initializing an array of 3X3.
		int[][] magicSquare = new int[n][n];  
		
		//I will start the program by placing 1 at array[0,1] position in the array.
		row = 0;		//Assigning row = 0.
		column = 1;	//Assigning column as 1.
		
		//These two variables will remember the position where last number was inserted.
		int lastRow = row, lastColumn = column; 
		
		/* Algorithm 
		 * 1) Starting with number 1 at middle position in first row, 
		 * 	  and then moving over and up each time. Considering Magic Square 
		 * 	  wrapped around and touching each other like a continuous circle.
		 * 2) We know that values of each and every element in the array is initialized
		 * 	  with 0, so if the value is zero then it will be considered as empty space
		 *    where a number can be inserted.
		 * 3) If the place is empty after moving over and up, and incrementing the number, 
		 *    then another number is inserted. After the number is incremented by 1,
		 *    column is incremented by 1 to move over and row is decremented by 1 to move up.
		 * 4) If the place is occupied then number is inserted at the bottom of the place 
		 *    where last number was inserted.
		 *  This process is continued until number gets larger than 9.
		 * */
		while(number <= (n*n)) { 
			if(magicSquare[row][column] ==0) {
				magicSquare[row][column] = number;
				//Remembering the position of last inserted number.
				lastRow = row;
				lastColumn = column;
				number++;
				//Moving over and up.
				column++;
				row--;				
			}
			else {
				//If place is occupied then moving towards the bottom of last inserted number.
				row = lastRow;
				column = lastColumn;
				row++;
				//If number moves out of bottom row then moving it to top row.
				//(Considering Magic Square wrapped around and touching each other).
				if(row == 3) {
					row = 0;
				}				
			}
			
			//If number moves out from the top row then moving it to the bottom.
			//(Considering Magic Square wrapped around and touching each other).
			if(row == -1) {
				row= n-1;
			}
			
			//If the number moves out from the right of the last column then moving
			//it back to left column.
			if(column == n) {
				column = 0;
			}			
		}
		
		//Displaying the Magic Square.
		System.out.println("The randomly generated matrix is:");
		for(int i=0; i<magicSquare.length; i++) {
			for(int j=0; j<magicSquare.length; j++) {
				System.out.print(magicSquare[i][j]+" ");
			}
			System.out.println();
		}
	}
}
