package test.reverseString;

public class Palindrome {

	public static void main(String[] args) {

		String show = "BIGBOOS";
		StringBuffer buffer = new StringBuffer(show);
		buffer.reverse();
		String data = buffer.toString();
		if (show.equals(data)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}

	}

}
