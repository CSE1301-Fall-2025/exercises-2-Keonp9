package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E04WaitPoint {

	/*
	 * Exercise: Use the StdDraw API to complete the code one
	 * step at a time.
	 */
	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()){
			StdDraw.pause(100);
		}
		// here, the mouse has been pressed
		
		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		
		
		// here, a q has been typed
		
		
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

}
