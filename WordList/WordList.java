package WordList;

import java.io.*;
import java.util.Scanner;

/**
 * The WordList program from  <URL> https://math.hws.edu/eck/cs124/javanotes3/c10/exercises.html
 * reads a text file and makes an alphabetical list 
 * of all the words in that file. The list of words is output to another file. Improve the 
 * program so that it also keeps track of the number of times that each work occurs in the 
 * file. Write two lists to the output file. The first list contains the words in alphabetical 
 * order. The number of times that the word occurred in the file should be listed along with 
 * the word. Then write a second list to the output file in which the words are sorted according 
 * to the number of times that they occurred in the files. The word that occurred most often 
 * should be listed first. 
 * @author HARMANVIR SINGH 
 *
 */
public class WordList {
	static WordData[] words = new WordData[10];
	static int pos = 0;
	static PrintWriter output = null;
	static PrintWriter outputLog = null;
	public static void main(String[] args) {
		File fileToRead = new File("TextFile.txt");
		Scanner inputFromOriginalFile = null;
		
		try{
			inputFromOriginalFile = new Scanner(fileToRead);
			output = new PrintWriter("TextFileWithoutDuplicates.txt");
			outputLog = new PrintWriter("LogFile.txt");
			while(inputFromOriginalFile.hasNext()) {
				insertWord(inputFromOriginalFile.next().replace(',', ' ').trim());
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException.....!!");
			System.exit(0);
		}
		inputFromOriginalFile.close();
		writeFile(output);
		output.println();
		try {
			sortArray(words);
		}
		catch(NullPointerException e) {
			System.out.println("eroorrrrrrrrrrrrrr");
		}
		writeFile(output);
		writeLogFile(outputLog);
		outputLog.close();
		output.close();
		System.out.println(words.length +" is the length of an array and position is " + pos );
		
	}
	
	
	
	
	
	private static void insertWord(String wordToInsert) {
		wordToInsert = wordToInsert.replace('.', ' ').trim();
		boolean isEqual = false;
		wordToInsert.toLowerCase();
		if(pos>= Integer.MAX_VALUE) {
			System.out.println("this is the maximum number of words that can be stored....!!");
			writeFile(output);
			System.exit(0);
		}
		//Increasing the size of an array to hold more words.
		if(pos == words.length) {
			WordData[] newArray = new WordData[words.length*2];
			//Copying all the elements of old array to new.
			for(int i=0; i<words.length; i++) {
				newArray[i] = words[i];
			}
			words = newArray;
		}
		for(int i=0; i<pos; i++) {
			if(wordToInsert.equalsIgnoreCase(words[i].getWord())) {
				words[i].count++;
				isEqual = true;
				break;
			}
		}
		if(!isEqual) {
			words[pos] = new WordData(wordToInsert);
			pos++;
		}
	}
	
	private static void writeFile(PrintWriter file) {
		for(int i=0; i<pos; i++) {
			if(i%15 == 0) {
				file.println();
			}
				file.print(words[i].getWord()+" ");
		}
	}
	
	private static void writeLogFile(PrintWriter file) {
		for(int i=0; i<pos; i++) {
			if(i%15 == 0) {
				file.println();
			}
				file.println((i+1) + ". " + words[i]);
		}
	}
	
	private static void sortArray(WordData[] array) throws NullPointerException {
		try {
			int size = pos;  
			//logic for sorting   
			for(int i = 0; i<size; i++){  
				for (int j = i+1; j<size; j++){  
					//compares each elements of the array to all the remaining elements  
					if(array[i].getWord().compareTo(array[j].getWord())>0){  
						//swapping array elements  
						WordData temp = array[i];  
						array[i] = array[j];  
						array[j] = temp;  
					}  
				}  
			}  
		}
		catch(NullPointerException e) {
			System.out.println(" error at " + pos);
		}
		
	}
}
