package fundamentals;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 0;
		while(true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.print("id? ");
				id = input.nextInt();
				break;
			} catch (InputMismatchException ime) {
				// TODO: handle exception
				System.err.println("Please Enter Numbers.");
			}
		}

		String name = "";
		while(true) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.print("Name? ");
				name = input.nextLine();
				if(name.matches("[a-zA-Z]+"))
				break;
				System.err.println("Please Enter Alphabets.");
			} catch (InputMismatchException ime) {
				// TODO: handle exception
				
			}
		}
		
		String department = "";
		String [] departments = {"bca", "mca", "bbm", "bcom", "ba", "mba", "mcom", "ma"};
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Department? ");
			department = input.nextLine();
			if(Arrays.binarySearch(departments, department.toLowerCase()) != -1)
				break;
			System.err.println("Please Enter Valid Department. " + Arrays.toString(departments));
		}
		
		System.out.printf("Employee [id=%d, Name: %s, Department: %s]", id, name, department);
	}

}
