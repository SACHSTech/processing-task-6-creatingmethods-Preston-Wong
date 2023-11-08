import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1300, 1300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    drawHouse(50,100,255,0,0);
    drawHouse(275,100,255,0,0);
    drawHouse(500,100,255,165,0);
    drawHouse(725,100,255,165,0);
    drawHouse(950,100,255,255,0);
    drawHouse(50,400,255,255,0);
    drawHouse(275,400,0,128,0);
    drawHouse(500,400,0,128,0);
    drawHouse(725,400,143,0,255);
    drawHouse(950,400,143,0,255);
    drawHouse(50,700,0,0,255);
    drawHouse(275,700,0,0,255);
    drawHouse(500,700,75,0,130);
    drawHouse(725,700,75,0,130);
    drawHouse(950,700,	50, 205, 50);

  }

  /*
   * draws a house with width and height and colours with as well
   * @param intHouseWidth is the width of the house, roof, and door
   * @param intHouseHeight is the height for the house, roof, and door
   * @param intColour1 is the R value of the RGB code
   * @param intColour2 is the G value of the RGB code
   * @param intColour3 is the B value of the RGB code
   * Draws the house, roof, window, and door with the correct colour 
   * 
   */

  public void drawHouse(int intHouseWidth, int intHouseHeight, int intColour1, int intColour2, int intColour3) {

	 	  // Body of the house
       fill(intColour1, intColour2, intColour3);
       rect(intHouseWidth, intHouseHeight, 200, 190);
        
       // Roof of the house
       fill(210,100,75);
       triangle(intHouseWidth, intHouseHeight, intHouseWidth + 100, intHouseHeight - 100, intHouseWidth + 200, intHouseHeight);
   
       // Window
       fill(255);
       ellipse(intHouseWidth + 100, intHouseHeight - 45,50,50);
       line(intHouseWidth + 125, intHouseHeight - 45, intHouseWidth + 75,intHouseHeight - 45);
       stroke(0);
       line(intHouseWidth + 100, intHouseHeight - 20, intHouseWidth + 100, intHouseHeight - 70);
       stroke(0);
   
       // Door and door handle
       fill(245, 245, 220);
       rect(intHouseWidth + 55, intHouseHeight + 65,90,125);
       fill(0);
       ellipse(intHouseWidth + 130, intHouseHeight + 125,10,10);
  }

}