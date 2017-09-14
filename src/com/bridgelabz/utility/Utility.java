/***********************************************
 * purpose : To store all logic of the Functional
 * 			 programs
 *           
 * @author Dipendra Rana
 * @version 5.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

	public static Scanner scanner = new Scanner(System.in);

	public static int count = 0;
	
	public static long startTime,stopTime;
	
	public static int incriment=0;
	
	public static void couponGenerator(int number) {
		int iteration = 0, randomNum;
		int storeElement[] = new int[number];
		while (iteration < number) {
			randomNum = 0 + (int) (Math.random() * number);
			if (checkArray(iteration, randomNum, storeElement)) {
				storeElement[iteration] = randomNum;
				// System.out.println(storeElement[i]);
				iteration++;
			}
			count++;
		}
		System.out.println(""+count);
	}
	
	public static boolean checkArray(int index, int radomNum, int array[]) {
		int found = 0;
		if (index == 0)
			return true;
		else {
			for (int i = 1; i < index; i++) {
				if (array[i] == radomNum) {
					found = 1;
					break;
				}
			}
			if (found == 1)
				return false;
			else
				return true;
		}
	}
	
	public static <generic> void arrayDisplay(int row, int coloumn, 
								ArrayList<ArrayList<generic>> array) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				System.out.print(array.get(i).get(j)+" ");
			System.out.println();
		}
	}	

	public static void checkingInt(int intArray[]) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				for (int k = j + 1; k < intArray.length; k++) {
					if (intArray[i] + intArray[j] + intArray[k] == 0) {
						System.out.println(intArray[i] + " " + intArray[j] + " " + intArray[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The no. of such distinct tripletpairs are = " + count);
	}
	
	public static void replaceName(String name) {
		String template="Hello <<UserName>>, How are you?";
		if (name.length() >= 3) {
			template=template.replaceAll("<<UserName>>", name);
			System.out.println(template);
		}	
		else
			System.out.println("Name should be greater than 3 characters");
	}
	
	public static void percentageHorT(int times) {
		double countT = 0, countH = 0;
		if (times >= 1) {
			for (int i = 0; i < times; i++) {
				if (Math.random() < 0.5)
					countT++;
				else
					countH++;
			}
			System.out.println("Head appeared " + ((countH / times) * 100) + "%");
			System.out.println("Tail appeared " + ((countT / times) * 100) + "%");
		}
	}
	
	public static boolean leapYearFinder(int year) {
		if (Utility.numberOfDigitChecker(year) == 4) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				return true;
				//System.out.println("Leap Year");
			else
				return false;
				//System.out.println("Not Leap Year");
		}
		else
			return false;
	}
	
	public static int numberOfDigitChecker(int number) {
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
	
	public static void powerOf2(int power) {
		if (power >= 0 || power < 31) {
			for (int i = 0; i <= power; i++) {
				System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
			}
		}
	}
	
	public static void harmoninumber(int times) {
		double harmonicsum;
		for (double i = 0; i < times; i++) {
			harmonicsum = 0;
			for (double j = 0; j < i + 1; j++)
				harmonicsum = harmonicsum + (1 / (j + 1));
			System.out.println("H" + (int) (i + 1) + " = " + harmonicsum);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T genericTwoDArray(int row, int coloumn, int choose) {
		ArrayList<ArrayList<T>> twoDArray = new ArrayList<ArrayList<T>>();
		for (int i = 0; i < row; i++)
			twoDArray.add(new ArrayList<T>());
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				if (choose == 1)
					twoDArray.get(i).add((T) Integer.valueOf(scanner.nextInt()));
				else if (choose == 2)
					twoDArray.get(i).add((T) Double.valueOf(scanner.nextDouble()));
				else
					twoDArray.get(i).add((T) Boolean.valueOf(scanner.nextBoolean()));
		}
		return (T) twoDArray;
	}
	
	public static void primeFactorization(int number) {
		int product=1,staticNo=number;
		int i=2;
		while(i<=number){
			if(primeChecker(i)&&number%i==0&&product!=staticNo) {
				System.out.println(i);
				product=product*i;
				number=number/i;
			}
			else if(product==staticNo)
				break;
			else
				i++;
		}
	}
	
	public static boolean primeChecker(int number) {
		count=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				count++;
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static void gamblingSimulator(int stake,int goal,int noOfTimes) {
		int win=0;
		for(int i=0;i<noOfTimes;i++) {
			int cash=stake;
			while(cash>0&&cash<goal) {
				if(Math.random()<0.5) 
					cash++;
				else 
					cash--;
				}
			if(cash==goal)
				win++;
		}
		System.out.println("no. of Wins = "+win);
		System.out.println("Wins is "+((double)win/noOfTimes*100)+"%");
		System.out.println("Loss is "+(100-(double)win/noOfTimes*100)+"%");
	}
	
	public static void euclideanDistance(int xPoint,int yPoint) {
		double distance=Math.sqrt(Math.pow(xPoint, 2)+Math.pow(yPoint,2));
		System.out.println("Euclidean distance from the point ("+xPoint+","+yPoint+
							") to the origin (0,0) is "+distance);
	}
	
	public static void quadraticRootFinder(int aValue,int bValue,int cValue) {
		double root1,root2;
		int delta=(int)Math.pow(bValue, 2)-(4*aValue*cValue);
		if(delta==0) {
			System.out.println("There is only one real root");
			root1=(-bValue+Math.sqrt(delta))/(2*aValue);
			System.out.println("root = "+root1);
		}
		else if(delta>0) {
			System.out.println("There is two real root");
			root1=(-bValue+Math.sqrt(delta))/(2*aValue);
			root2=(-bValue-Math.sqrt(delta))/(2*aValue);
			System.out.println("root1 = "+root1);
			System.out.println("root2 = "+root2);
		}
		else
			System.out.println("No root posiible");
	}

	public static void effectiveTemperature(double tempFahrenheit,double speed) {
		if(tempFahrenheit>50&&speed>120||speed<3) {
			double windChill=35.74+0.6215+
					(0.4275*tempFahrenheit-35.75)*Math.pow(speed, 0.16);
			System.out.println(windChill);
		}
	}
	
	public static void stopWatchSimulator() {
		long startTime=System.currentTimeMillis();
	
		long total = 0;
	    for (int i = 0; i < 200000000; i++) {
	      total = total+ i;
	    }
		long stopTime=System.currentTimeMillis();
		System.out.println(stopTime-startTime+" millisecond");
	}
	
	public static void checkingForPowerOf2(int number) {
		int power=(int)(Math.log10(number)/Math.log10(2));
		if(Math.pow(2, power)==number)
			System.out.println(number+" is power of two");
		else
			System.out.println(number+" is Not!!!power of two");
	}

	public static void stringPermutationRecursion(char[] word,String[] storeWords,int startingIndex,int lastIndex) {
		if(startingIndex==lastIndex) {
			System.out.println(Arrays.toString(word)+" "+(incriment+1));
			storeWords[incriment]=String.copyValueOf(word);
			incriment++;
		}	
		else {
			for(int i=startingIndex;i<=lastIndex;i++) {
				swap(word,startingIndex,i);
				stringPermutationRecursion( word,storeWords, startingIndex+1, lastIndex);
				swap(word,startingIndex,i);
			}
		}
	}
		
	public static void swap(char[] array,int constantIndex,int incrimentalIndex) {
		char temp=array[constantIndex];
		array[constantIndex]=array[incrimentalIndex];
		array[incrimentalIndex]=temp;
		
	}
	
	public static int factorial(int number) {
		if(number==0||number==1)
			return 1;
		else
			return number=number*factorial(number-1);
	} 

	public static void ticTacToeSimulator() {
		int[][] board=new int[3][3];
		if(Math.random()>0.5) {
			System.out.println("User won the Toss");
			userMove(board);
		}
		else {
			System.out.println("Computer won the Toss");
			pcMove(board);
		}	
	}
	
	public static void pcMove(int[][] board) {
		int row=(int)(Math.random()*3);
		int column=(int)(Math.random()*3);
		if(board[row][column]!=1) {
			System.out.println("Computer Turn");
			System.out.println(row+" , "+column);
			board[row][column]=1;
			if(isCheckmate(board))
				System.out.println("PC won");
			else
			userMove(board);
		}
		else {
			pcMove(board);
		}
	}
	
	public static void userMove(int[][] board) {
		System.out.println("Your Turn");
		System.out.println("Choose your move");
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		if(board[row][column]!=1) {
			System.out.println(row+" , "+column);
			board[row][column]=1;
			if(isCheckmate(board)) 
				System.out.println("You won");
			else
			pcMove(board);
		}
		else {
			System.out.println("You choose the non-empty field");
			userMove(board);
		}
	}
	
	public static boolean isCheckmate(int[][] board) {
		if(board[0][0]==1&&board[1][0]==1&&board[2][0]==1) //row(0-2),column(0)
			return true;
		else if(board[0][1]==1&&board[1][1]==1&&board[2][1]==1)	//row(0-2),column(1)
			return true;
		else if(board[0][2]==1&&board[1][2]==1&&board[2][2]==1)	//row(0-2),column(2)
			return true;
		else if(board[0][0]==1&&board[0][1]==1&&board[0][2]==1)	//row(0),column(0-2)
			return true;
		else if(board[1][0]==1&&board[1][1]==1&&board[1][2]==1)	//row(1),column(0-2)
			return true;
		else if(board[2][0]==1&&board[2][1]==1&&board[2][2]==1)	//row(2),column(0-2)
			return true;
		else if(board[0][0]==1&&board[1][1]==1&&board[2][2]==1)	
			return true;
		else if(board[0][2]==1&&board[1][1]==1&&board[2][0]==1)
			return true;
		else 
			return false;	
	}

}