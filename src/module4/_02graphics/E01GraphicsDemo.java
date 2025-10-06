package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.5,0.5,.025);
		//Draw a larger green point someplace else
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledCircle(.1,.1,.05);
		//Draw an unfilled red triangle somewhere
		StdDraw.setPenColor(Color.RED);
		double[] x = {.5,.6,.7};
		double[] y = {.125, .25, .125};
		StdDraw.polygon(x,y);
		//Draw a filled yellow circle somewhere

		//Draw a filled blue rectangle somewhere

	}
}
