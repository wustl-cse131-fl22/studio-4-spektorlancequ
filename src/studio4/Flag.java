package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 0, 0);
		
		StdDraw.filledRectangle(3, 3, 3, 3);
		
		StdDraw.setYscale(0, 12);
		StdDraw.setPenColor(207, 181, 59);
		StdDraw.filledRectangle(1.5, 3, 1.5, 3);
		
		StdDraw.setScale();
		
		Color pink = new Color(255, 100, 150);
		Color beige = new Color(255, 230, 210);
		StdDraw.setPenColor(pink);
		StdDraw.filledCircle(.5, .62, .18);
		
		StdDraw.setPenColor(beige);
		double[] x = {0.3, 0.7, 0.5};
		double[] y = {0.6, 0.6, 0.2};
		
		StdDraw.filledPolygon(x, y);
		
		
	}
}