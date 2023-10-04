package fundamentals;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(args[0]);
		for(int counter = 1; counter <= 10; ++counter) {
			System.out.printf("%5d x %3d = %10d\n", number, counter, number * counter);
		}

	}

}
