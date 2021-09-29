package com.company;

public class Triangle extends Shapes {

private double x1, y1, x2, y2, x3, y3, inX, inY;

public Triangle (double x1, double y1, double x2, double y2, double x3, double y3, double inX, double inY) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.x3 = x3;
    this.y3 = y3;

    this.inX = inX;
    this.inY = inY;
}
    public double area() {
        return Math.abs((x1*y2 + x2*y3 + x3*y1 - y1*x2 - y2*x3 - y3*x1)/2);
    }

      public double circumference() {
        return
        Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) +
        Math.sqrt(Math.pow((x2-x3),2) + Math.pow((y2-y3),2)) +
        Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
  }

  public boolean isPointInsideShape() {    
// Vi undersøger om punktet er inden for trekantens areal.
// For at gøre dette ser vi på om trekantens areal er lig med arealet af 3 nye trekanters areal skabt ud fra 2 af de 3 punkter og punkter p. Disse nye trekanters areal kalder vi A1, A2 & A3.
        // Areal af PAB
        double A1 = Math.abs((inX*(y2-y3) + x2*(y3-inY) + x3*(inY-y2))/2.0); 
       // Areal af PAC  
        double A2 = Math.abs((x1*(inY-y3) + inX*(y3-y1) + x3*(y1-inY))/2.0); 
       // Areal af PAB   
        double A3 = Math.abs((x1*(y2-inY) + x2*(inY-y1) + inX*(y1-y2))/2.0); 
      
        if(area() == A1 + A2 + A3){
          System.out.println("The point is inside the triangle.");
          return true;
        } else {
          System.out.print("The point is outside the triangle.");
          return false;
        }
    }

    public double centerX () { 
      double centerX = (x3 + x2 + x1) / 3;
      return centerX; 
    }

    public double centerY () { 
      double centerY = (y3 + y2 + y1) / 3;
      return centerY; 
    }
}
