package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength ) {
		if (halfLength < 0.002) return;
		StdDraw.filledSquare(xCtr, yCtr, halfLength/1.5);
		double offset = halfLength*1.2;
		recursiveCarpet(xCtr+offset, yCtr+offset, halfLength/3);
		recursiveCarpet(xCtr-offset, yCtr-offset, halfLength/3);
		recursiveCarpet(xCtr-offset, yCtr+offset, halfLength/3);
		recursiveCarpet(xCtr+offset, yCtr-offset, halfLength/3);
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.25 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength ) ;
	}

}
