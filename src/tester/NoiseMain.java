package tester;

import java.util.*;
import processing.core.*;

import processing.core.PApplet;


public final class NoiseMain extends PApplet{

	// noise "time" variables
//	float xtime = 0;
	float x = 1;
	float ytime = 100;
	float increment = (float)0.02;

	public void setup() {
	  size(200,200);
	  smooth();
	}

	public void draw() {
	  background(0);
//	  float x = noise(xtime)*width;
	  float y = noise(ytime)*height;
	  
	  x += 3;
	  ytime += increment;
	  
	  // draw the ellispe with size determined by Perlin noise
	  fill(200);
	  ellipse(x,y,16,16);
	  
	  if (x >= width) {
		  x = 0;
	  }
	}
	
//	// noise "time" variables
//	float xtime = 0;
//	float ytime = 100;
//	float increment = (float)0.02;
//
//	public void setup() {
//	  size(200,200);
//	  smooth();
//	}
//
//	public void draw() {
//	  background(0);
//	  float x = noise(xtime)*width;
//	  float y = noise(ytime)*height;
//	  
//	  xtime += increment;
//	  ytime += increment;
//	  
//	  // draw the ellispe with size determined by Perlin noise
//	  fill(200);
//	  ellipse(x,y,16,16);
	
	
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
