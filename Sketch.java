import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
    
    drawGround(400,400,255);
    drawHouse(400,400,255);
    drawRoof(400,400,255);
    drawWindow(400,400,255);
    drawDoor(400,400,255);

  }
  
  /*
   * draws the ground of the picture
   * @param width is how wide the ground will be
   * @param will determine how high the ground will be
   * @param colour will decide what colour will be used for which part
   */

  public void drawGround(int width, int height, int colour) {
    // Ground
    fill(colour * 0, (int) (colour * 0.5),colour * 0);
    rect((float) (width*0),(float) (height/1.025), (float) (width), (float) (height));
  }

    /*
   * draws the ground of the picture
   * @param width is how wide the house will be
   * @param will determine how high the house will be
   * @param colour will decide what colour will be used for which part
   */

  public void drawHouse(int width, int height, int colour) {
    // Body of the house
    fill( (int) (colour * 0.94),(int) (colour * 0.98),(int) (colour * 0.74));
    rect((float) (width/8), (float) (height/2),(float) (width/2), (float) (height/2.1));
  }

    /*
   * draws the ground of the picture
   * @param width is how wide the roof will be
   * @param will determine how high the roof will be
   * @param colour will decide what colour will be used for which part
   */

  public void drawRoof(int width, int height, int colour) {
    // Roof of the house
    fill((int) (colour * 0.82),(int) (colour * 0.39),(int) (colour * 0.29));
    triangle((float) (width/8), (float) (height/2), (float) (width/2.66), (float) (height/4), (float) (width/1.6), (float) (height/2));
  }

    /*
   * draws the ground of the picture
   * @param width is how wide the window will be
   * @param will determine how high the window will be
   * @param colour will decide what colour will be used for which part
   */

  public void drawWindow(int width, int height, int colour) {
    // Window
    fill(colour);
    ellipse((float) (width/2.667),(float) (height/2.58), (float) (width/8), (float) (height/8));
    line((float) (width/2.285), (float) (height/2.58), (float) (width/3.2),(float) (height/2.58));
    stroke(colour * 0);
    line ((float) (width/2.667), (float) (height/2.22), (float) (width/2.667), (float) (height/3.076));
    stroke(colour * 0);
  }

    /*
   * draws the ground of the picture
   * @param width is how wide the door and handle will be
   * @param will determine how high the door and handle will be
   * @param colour will decide what colour will be used for which part
   */

  public void drawDoor(int width, int height, int colour) {
    fill((int) (colour * 0.78), (int) (colour * 0.29),colour * 0);
    rect((float) (width/3.8), (float) (height/1.509), (float) (width/4.44), (float) (height/3.2));
    fill(colour * 0);
    ellipse((float) (width/2.19), (float) (height/1.2), (float) (width/40), (float) (height/40));
  }

}