package electionvote;//created package as electionvote
public class NotEligibleToVoteException extends Exception {
	int age;//initializng age

	// here we are making a constructor
	public NotEligibleToVoteException(int age) {

		this.age = age;//using this keyword
	}

	public String toString() {//public is a access modifier
		return "Your age is " + age + " You must be 18+";
	}

}