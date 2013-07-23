package tester;

import java.util.*;
import processing.core.*;

import processing.core.PApplet;

/** 
 * Based on code Copyright 2001 Ken Perlin
 * Computes Perlin Noise for one, two, and three dimensions.<p>
 * The result is a continuous function that interpolates a smooth path
 * along a series random points. The function is consitent, so given
 * the same parameters, it will always return the same value.
 * @see ImprovedNoise
*/

public class NoiseMain extends PApplet{
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "NoiseMain" };
		if (passedArgs != null) {
			PApplet.main(concat(appletArgs, passedArgs));
		} else {
			PApplet.main(appletArgs);
		}
	}

}
