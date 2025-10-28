package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q02 {

	/**
	* Draw a dashed line from (x,0) to (x,1)
	* on a standard StdDraw canvas. The length of the
	* dashes and the space between the dashes should
	* both be 0.02.
	* @param x is the x coordinate for the dashed line
	*
	**/
	public static void dashedLine(double x) {
		dashedLineHelper(x, 0);;
	}

	private static void dashedLineHelper(double x, double y) {
        double dashLength = 0.02;
        double gapLength = 0.02;

		if (y >= 1.0) {
            return;
        }

		// draw one dash
        	StdDraw.line(x, y, x, y + dashLength);

        // recursive call: move up past the dash and the gap
        	dashedLineHelper(x, y + dashLength + gapLength);
    	}

    	public static void main(String[] args) {
        	dashedLine(0.5);
    	}
	}