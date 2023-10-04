package fundamentals;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear = (year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 !=0);
		isLeapYear = isLeapYear || (year % 400 !=0);
		System.out.println(year + "is " + (isLeapYear ? "a" :"mot a")+ "leap year");

	}

}
