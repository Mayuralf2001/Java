package fundamentals;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("What's your name?");
		String name;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("\nGlad to meet you " + name);
		
	}
}
