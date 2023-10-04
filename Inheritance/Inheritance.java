package fundamentals;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent("Note for Parent Class Object");
		Child child = new Child("Note for child class object", "Memo for child class object");
		System.out.println("Parent Class Note: " + parent.note);
		System.out.println("Child Class Memo: " + child.memo);
		System.out.println("Child Class Note: " + child.note);
		
	}

}
