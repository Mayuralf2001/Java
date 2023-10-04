package fundamentals;

public class ArithmethicOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = Integer.parseInt(args[0]);
		int secondNumber = Integer.parseInt(args[1]);
		
		int sum = firstNumber + secondNumber;
		int diff = firstNumber - secondNumber;
		int product = firstNumber * secondNumber;
		float div = (float) firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;
		
		System.out.println("FirstNum     : " + firstNumber);
		System.out.println("SecondNum    : " + secondNumber);
		System.out.println("Addition     : " + sum);
		System.out.println("Substraction : " + diff);
		System.out.println("Product      : " + product);
		System.out.println("Division     :" + div);
		System.out.println("Remainder    : " + remainder);
	}

}
