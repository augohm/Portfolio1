package com.company;

public class Rectangle extends Shapes {

  	private double x1, y1, x2, y2, inX, inY;

  	public Rectangle (double x1, double y1, double x2, double y2, double inX, double inY){

    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;

    this.inX = inX;
    this.inY = inY;
  }

public double area(){
  return (x2 - x1) * (y2 - y1);
}

public double circumference(){
  return Math.abs(2 * ((x2 - x1) + (y2 - y1)));
}

public double centerX(){
  return (x2 + x1)/2;
  	}

public double centerY(){
    return (y2 + y1)/2;
  	}
    // checker om 
    public boolean isPointInsideShape() {
      if (inX <= x2 && inX >= x1 && inY <= y2 && inY >= y1 ) {
          System.out.println("The point is inside the rectangle.");
          return true; 
        } else {
          System.out.println("The point is outside the rectangle.");
          return false;
        } 
    }
}