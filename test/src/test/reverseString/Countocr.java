package test.reverseString;

public class Countocr {

	public static void main(String[] args) {

		String input = "annabond";
		char search = 'a';
		System.out.println(" Character to search is 'a'");

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == search)
				count++;
		}

		System.out.println("The Character '" + search + "' appears " + count + " times.");
	}

}
