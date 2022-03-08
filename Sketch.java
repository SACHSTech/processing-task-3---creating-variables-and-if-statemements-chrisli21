import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 255, 255);

    // Sun
    fill(246,255,0);
    float sunX = random(0, height);
    float sunY = random(0, width);
    float SunDiameter = random(100,200);
    ellipse(sunX, sunY, sunDiamter, sunDiameter);

    // sun positions
    boolean sunLeft = sunX >= 250;
    boolean sunRight = sunX <= 249;
    boolean sunUp = sunY <= 250;
    boolean sunDown = sunY >= 249;

    boolean sunTopLeft = sunUp && sunLeft;
    boolean sunTopRight = sunUp && sunRight;
    boolean sunBottomLeft = sunDown && sunLeft;
    boolean sunBottomRight = sunDown && sunRight;

    // background colour if statements
    if {sunTopLeft} {
      background(0,255,255);
    }
    if (sunTopRight) {
      background(209,101,0);
    }
    if(sunBottomLeft) {
      background(102, 102, 102);
    }
    if(sunBottomRight) {
      background(71,64,57)
    }

    // date and time
    fill(0,0,0);
    textSize(20);
    text(day() + "/" + month() + "/" + year() + " " + (hour() + ":" + minute() + ":" + second()), 20, 30);

    // House
    fill(0,0,0);
    rect(120,240,220,220);
    