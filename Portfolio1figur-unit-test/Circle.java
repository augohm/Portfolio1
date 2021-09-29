package com.company;

public class Circle extends Shapes {

private double x, y, radius, inX, inY;

public Circle (double x, double y, double radius, double inX, double inY) {
    this.x = x;
    this.y = y;
    this.radius = radius;

    this.inX = inX;
    this.inY = inY;
}

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double centerX() {
      return x;
    }

    public double centerY() {
      return y;
    }

 public boolean isPointInsideShape() {
      if (Math.pow((x - inX), 2) + Math.pow((y  - inY), 2) <= radius) {
        System.out.println("The point is inside the circle.");
        return true; 
        
    } else {
        System.out.println("The point is outside the circle.");
        return false;
    } 
}
}