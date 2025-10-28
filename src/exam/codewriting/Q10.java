package exam.codewriting;
public class Q10 {

	/*
	We wish to create a method to print a string n times all on 
	the same line, where n is a positive integer. For example:

		repeat("hi", 5) would print hihihihihi
		repeat("bye", 3) would print byebyebye

	Complete the method. You may use either iteration or recursion.
	 */
	public static int repeat (String text, int n) {
		System.out.print(text);
		if (n>0) {
			return repeat(text,n-1);
		}
		else {
			return 0;
		}
	}

	public static void main ( String[] args ) {
		repeat("hi", 5);
		repeat("bye", 3);
	}

}
