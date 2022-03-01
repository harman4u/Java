
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=0;
		for(int i=n-1;i>=0;i--) {
			x++;
			for(int j=3*i;j>=0;j--) {
				System.out.print(" ");	
			}
			for(int k=x;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();	
		}
		scan.close();
	}

	/**
	 * Solution for 1
	 */
	public static void solution1(){
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER t");
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("ENTER a");
			int a = in.nextInt();
			System.out.println("ENTER b");
			int b = in.nextInt();
			System.out.println("ENTER n");
			int n = in.nextInt();
			int y=0;
			int x=2;
			int v=2;
			for(int j=0;j<=n-1;j++) {
				y=0;
				x=2;
				v=2;
				for(int k=2;k<=j;k++) {
					x=2*x;
					v=x+v;
				}
				if(!(j==0)) {
					y=a+b*(v+1);
					System.out.print(y+", ");
				}
				else {
					y=a+b;
					System.out.print(y+", ");
				}
			}
			System.out.println();
		}
		in.close();
	}

	/**
	 * Solution for 2
	 */
	public static void solution2() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

		if (scan.hasNext()){
			System.out.println(0);
		}else {

			String[]a = s.trim().split("[ !,?._'@]+");
			ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
			System.out.println(listOfStrings.size());

			for(String str:listOfStrings){
				System.out.println(str);
			}    
		}
		scan.close();
	} 

	/**
	 * Checks if the number is Anagram.   
	 * @param a
	 * @param b
	 * @return
	 */
	static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		boolean f = false;
		char[] c = a.toCharArray();
		char temp='a';
		// Arrays.sort(c);
		for(int i=0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		char[] d = b.toCharArray();
		// Arrays.sort(d);
		for(int i=0;i<d.length-1;i++) {
			for(int j=i+1;j<d.length;j++) {
				if(d[i]>d[j]) {
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		String A = new String (c);
		String B = new String (d);
		if (A.equals(B)) {
			f=true;
		}
		return f;
	}

	/**
	 * Solution 3
	 */
	public static void solution3() {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	/**
	 * Solution 4 for the answer.
	 */
	public static void solution4() {
		final Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if(n%2==1){
			System.out.println("Weird");
		}
		else if (n%2==0 && n>=2 && n<=5){
			System.out.println("Not Weird");
		}
		else if(n%2==0 && n>=6 && n<=20){
			System.out.println("Weird");
		}
		else if(n%2==0 && n>=20){
			System.out.println("Not Weird");
		}
		scanner.close();
	}


	/**
	 * Solution 5
	 */
	public static void solution5() {
		int[] a= {1,2,3,4,5};
		int j=0;
		int k=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the direction");
		int d=s.nextInt();
		for(int m=0;m<d;m++){
			int firstTerm=a[0];
			int lastTerm=a[4];

			for(int i=0;i<5;i++) {
				if(i==0) {
					firstTerm=a[0];
				}else {
					a[i-1]=a[i];

				}
				j=0;
			}
			a[4]=firstTerm;
			//a[]=lastTerm;
		}
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
	}

	/**
	 * Solution 6  
	 */
	public static void solution6() {
		final Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int sum=0;
		int largestSum=0;
		int temp=0;
		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(sum>largestSum) {
					largestSum=sum;
				}
				sum=0;
			}
		}
		System.out.println(largestSum);
		scanner.close();
	}

	/**
	 * Solution7
	 */
	public static void solution7() {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n] ;
		int count=0;
		int sum=0;
		int j=0;
		for(int i=0;i<array.length;i++){
			array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length-1;i++){
			if(array[i]<0) {
				j++;
			}
			if((array[i]+array[i+1])<0) {
				j++;
			}
			sum=0;
			j=0;
			for(int k=j;k<=j+i;k++) {
				sum=sum+array[k];
				j++;
				if((j+i)>=array.length) {
					break;
				}
			}
			if(sum<0) {
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * Solution 8
	 */
	public static void solution8() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=n-1;i++){
			a[i]=scan.nextInt();
		}
		scan.close();
		// Prints each sequential element in array a
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/**
	 * Solution 9
	 */
	public static void solution9() {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		Locale inlocal=new Locale("en","in");
		NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat inFormat=NumberFormat.getCurrencyInstance(inlocal);
		NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat franceFormat =NumberFormat.getCurrencyInstance(Locale.FRANCE);
		// Write your code here.
		String us =usFormat.format(payment);
		String india = inFormat.format(payment);
		String china=chinaFormat.format(payment);
		String france=franceFormat.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

	/**
	 * Solution 10
	 */
	public static void solution10() {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		//Enter your code here. Print output to STDOUT. 
		int size=A.length();
		String B="";
		for(int i=size-1;i>=0;i--){
			B=B+A.charAt(i);
		}
		if(A.equalsIgnoreCase(B)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	/**
	 * Solution 11
	 */
	public static void solution11() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = null;

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER month
	 *  2. INTEGER day
	 *  3. INTEGER year
	 */
	public static String findDay(int month, int day, int year) {

		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			String monthString=sc.next();
			String dayString=sc.next();
			String yearString=sc.next();
			month=Integer.parseInt(monthString);
			day=Integer.parseInt(dayString);
			year=Integer.parseInt(yearString);     
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month-1, day);
			return( new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
		}
		return null;
	}

	/**
	 * Solution 12
	 * @return
	 */
	public static String findDay() {
		Scanner sc =new Scanner(System.in);
		Calendar calendar=null;

		while(sc.hasNext()) {


			String monthString=sc.next();
			String dayString=sc.next();
			String yearString=sc.next();

			int month=Integer.parseInt(monthString);
			int day=Integer.parseInt(dayString);
			int year=Integer.parseInt(yearString);

			calendar = Calendar.getInstance();
			calendar.set(year, month-1, day);

			System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
		}
		return (new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
	}

	/**
	 * Solution 13
	 */
	public static void solution13(){
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			try
			{
				long x=sc.nextLong(); 
				System.out.println(x+" can be fitted in:");
				if(x>=-128 && x<=127)
				{
					System.out.println("* byte");

				}

				if(x>=Short.MIN_VALUE  && x<=Short.MAX_VALUE ) {
					System.out.println("* short");
				}

				if(x>=Integer.MIN_VALUE  && x<=Integer.MAX_VALUE ) {
					System.out.println("* int");
				}

				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
					System.out.println("* long");
				}
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}
		}
	}
}












