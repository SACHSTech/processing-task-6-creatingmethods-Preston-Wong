import processing.core.PApplet;

/**
 * prints out a grid of houses and people standing next to them with differnt colours, and changes all the colours to white when the mouse is pressed down 
 * @author: Preton Wong
 *
 */

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
    background(0,0,0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // sees if a mouse button has been pressed
    if (TurnWhite(true)) {
      
      // determines the y value for the house and person
      for (int intY = 100; intY < 750; intY += 300) {

        // determines the x value for the houes and person
        for (int intX = 50; intX < 1000; intX += 300) { 

          // uses the TurnWhite method do determine the colour of the houses and people 
          drawHouse(intX, intY, 255,255,255);
          drawPerson(intX, intY,10, 255,255,255);    
        } 
      }

    }else {

      // determines the y value for the house and person
      for (int intY = 100; intY < 750; intY += 300) {

        // determines the x value for the houes and person
        for (int intX = 50; intX < 1000; intX += 300) { 

          // uses the x and y values from the 2 for loops above to determine the colour of the houses and people 
          drawHouse(intX, intY, (intX / 6) + (intY / 8), (intX / 2) + (intY / 4), (intX / 4) + (intY / 2));
          drawPerson(intX, intY,10, (intX / 6) + (intY/ 8) , (intX / 2) + (intY / 4) , (intX / 4) + (intY / 2) );    
        } 
      }
    }
  }

  /*
   * draws a house with width and height and colours with as well
   * @param intHouseX is the width of the house, roof, and door
   * @param intHouseY is the height for the house, roof, and door
   * @param intRed is the R value of the RGB code
   * @param intGreen is the G value of the RGB code
   * @param intBlue is the B value of the RGB code
   * Draws the house, roof, window, and door with the correct colour 
   * 
   */

  public void drawHouse(int intHouseX, int intHouseY, int intRed, int intGreen, int intBlue) {

	 	// Body of the house
    stroke(0);
    fill(intRed, intGreen, intBlue);
    rect(intHouseX, intHouseY, 200, 190);
       
    // Roof of the house
    stroke(0);
    fill(210,100,75);
    triangle(intHouseX, intHouseY, intHouseX + 100, intHouseY - 100, intHouseX + 200, intHouseY);
   
    // Window
    fill(255);
    ellipse(intHouseX + 100, intHouseY - 45,50,50);
    line(intHouseX + 125, intHouseY - 45, intHouseX + 75,intHouseY - 45);
    stroke(0);
    line(intHouseX + 100, intHouseY - 20, intHouseX + 100, intHouseY - 70);
    stroke(0);
   
    // Door and door handle
    fill(245, 245, 220);
    rect(intHouseX + 55, intHouseY + 65,90,125);
    fill(0);
    ellipse(intHouseX + 130, intHouseY + 125,10,10);
  }

  /*
   * draws a person next to the house
   * @param intPresonX determines the x point of the person
   * @param intPersonY determines the y poitn of the person
   * @param intHead determines the location of the head and head size
   * intRed determiens the R in the RGB value
   * intGreen determines the G in the RGB value
   * intBlue determines the B in the RGB value
   * 
   */
  
  public void drawPerson(int intPersonX, int intPersonY, int intHead, int intRed, int intGreen, int intBlue) {

    // head of the person
    noFill();
    stroke(intRed,intGreen,intBlue);
    ellipse(intPersonX + 225, intPersonY + 80, 20,20);

    // draws the person's body, legs, and arms 
    stroke(intRed,intGreen,intBlue);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 225, intPersonY + 90);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 240, intPersonY + 175);
    line(intPersonX + 225, intPersonY + 140, intPersonX + 210, intPersonY + 175);
    line(intPersonX + 225, intPersonY + 120, intPersonX + 240, intPersonY + 110);
    line(intPersonX + 225, intPersonY + 120, intPersonX + 210, intPersonY + 110);
  }

  /*
   * checks to see if a mouse input has been used
   * @param mousePressed sees if a mouse input has been used
   * @return true or false depending if the mouse was pressed down or not 
   */
  public boolean TurnWhite(boolean MousePressed) {

    // determines true or false
    if (mousePressed == true) {
      return true;
    }else {
      return false;
    }
  }
}