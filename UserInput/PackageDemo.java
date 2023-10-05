package fundamentals;

import java.util.Scanner;

//import java.util.*;
//As we are learning Java we should write the program as java.util.Scanner the whole package as shown
public class PackageDemo {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("How many numbers" );
		int count = input.nextInt();
		int[] numbers = new int[count];
		for(int index = 0; index < numbers.length; ++index) {
			System.out.println("Number " + (index + 1) + "? ");
			numbers[index] = input.nextInt();
		}
		System.out.println("Numbers Entered : " + java.util.Arrays.toString(numbers));
		java.util.Arrays.sort(numbers);
		System.out.println("Numbers Sorted : " + java.util.Arrays.toString(numbers));
		input.close();
	}
}
