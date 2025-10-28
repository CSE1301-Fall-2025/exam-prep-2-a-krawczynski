package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q03 {

	public static void boxy ( double xCtr , double yCtr , double halfLength ) {
		if (halfLength < 0.005) return;
		StdDraw.square(xCtr, yCtr, halfLength);
		double offset = halfLength;
		boxy(xCtr-offset, yCtr-offset, halfLength/2);
		boxy(xCtr+offset, yCtr-offset, halfLength/2);
		//your code here
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image02.png" in the images folder.

		//Your solution must use recursion

		boxy (0.5 , 0.6 , 0.25);
	}

}
