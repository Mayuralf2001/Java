package fundamentals;

import java.util.Iterator;

public class RollDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("How many times you want to roll the dice? ");
		int times = input.nextInt();
		int[] faces = new int[6];
		for(int count = 1; count<=times; ++count) {
			int face = (int) (Math.random() * 6);
			++faces[face];
		}
//		for(int index = 0; index < faces.length; ++index) {
//			System.out.println((index + 1)+ ": " + faces[index]);
//		}
		int face= 1;
		for(int value : faces) {
			System.out.printf("%2d: %5d :: ", (face++), value);
			for(int count=1; count<=1; ++count) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
