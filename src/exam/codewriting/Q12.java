package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static double rDraw ( double xCtr , double yCtr , double size ) {
		StdDraw.square(xCtr,yCtr,size);
		StdDraw.square(xCtr/2, yCtr*1.5, size/2);
		StdDraw.square(xCtr*1.5, yCtr/2, size/2);
		StdDraw.circle(xCtr/2, yCtr*1.5, size/2);
		StdDraw.circle(xCtr*1.5, yCtr/2, size/2);

		//your code here
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		rDraw (0.5 , 0.5 , 0.25);
	}

}
