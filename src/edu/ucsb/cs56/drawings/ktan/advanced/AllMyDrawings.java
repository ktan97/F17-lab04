package edu.ucsb.cs56.drawings.ktan.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with bear faces 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	// Make my bear goddamit 
	BearFace b1 = new BearFace(100, 100, 100); 
	g2.setColor(Color.BLACK); g2.draw(b1); 

	Bear b2 = new BearFace(300, 300, 50);
	g2.setColor(Color.RED); g2.draw(b2); 

	Bear b3 = new BearFace(200, 200, 100); 
	g2.setColor(new Color(0x002FA7)); g2.draw(b3);
	/*
	House h1 = new House(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
*/	
//	g2.setStroke(orig);
//	g2.setColor(Color.BLACK); 
	g2.drawString("My bear head by Kindy Tan", 20,20);
    }
    
    
    /** Draw a picture with a couple of bear faces 
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	/*	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	CoffeeCup tallSkinny = new CoffeeCup(20,150,20,40);
	CoffeeCup shortFat = new CoffeeCup(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	House h1 = new House(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	*/
	//g2.setStroke(orig);
	//g2.setColor(Color.BLACK);
	BearFace b1 = new BearFace(300, 300, 100);
        g2.setColor(Color.RED); g2.draw(b1);

	BearFace b2 = new BearFace(100, 100, 300); 
	g2.setColor(Color.BLACK); g2.draw(b2); 
 
	Shape b3 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/4.0);
	g2.draw(b3); 
 
	g2.drawString("Another bear face, but red", 20,20);
    }
    
    /** Draw a different picture with some more Bear Faces
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A small bear face", 20,20);
	
	
	// Draw some Bears
	
	BearFace b1 = new BearFace(100, 100, 50);
        g2.setColor(Color.GREEN); g2.draw(b1);

	BearFace b2 = new BearFace(75, 100, 100); 
	g2.setColor(Color.BLACK); g2.draw(b2); 

	BearFace b3 = new BearFace(100, 200, 50); 
	g2.setColor(Color.RED); g2.draw(b3); 
	
	Shape b4 = ShapeTransforms.scaledCopyOf(b2, 0.5, 0.5);
	g2.draw(b4); 
	
	Shape b5 = ShapeTransforms.translatedCopyOf(b3, 20, 20);
	g2.draw(b5);

    }       
}
