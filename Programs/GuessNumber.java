package fundamentals;


public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(1 + Math.random());
		boolean guessed = false;
		for(int chances = 1; chances <=3; ++chances) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Guess the number between 1-10: ");
			int guessNumber = input.nextInt();
			if(randomNumber == guessNumber) {
				System.out.println("You guessed the right number!");
				guessed = true;
				break;
			}
			System.out.println(randomNumber > guessNumber ? "Hot" : "Cold");
		}
		if(!guessed) {
			System.out.println("Sorry all tries done! The number is " + randomNumber);
		}
	}

}
