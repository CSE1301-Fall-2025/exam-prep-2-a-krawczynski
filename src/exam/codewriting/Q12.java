package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q12 {

	public static void rDraw(double xCtr, double yCtr, double size) {
    // base case
    if (size < 0.01) return;

    // draw the square centered at (xCtr, yCtr)
    StdDraw.square(xCtr, yCtr, size);

    // draw circles only when squares are small enough (adjust threshold if needed)
    if (size < 0.08) {
        // circle centers placed near the corner along the diagonal
        // these offsets (1.5*size) are a reasonable visual choice; tweak if you'd like
        StdDraw.circle(xCtr + 1.5 * size, yCtr - 1.5 * size, size / 3.0);
        StdDraw.circle(xCtr - 1.5 * size, yCtr + 1.5 * size, size / 3.0);
    }

    // recursively draw the next squares along the diagonal in both directions
    // move by one full side length = 2*size to land at the next center
    rDraw(xCtr + 2 * size, yCtr - 2 * size, size / 1.75); // down-right
    rDraw(xCtr - 2 * size, yCtr + 2 * size, size / 1.75); // up-left
}


	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image03.png" in the images folder.

		//Your solution must use recursion

		rDraw (0.5 , 0.5 , 0.25);
	}

}