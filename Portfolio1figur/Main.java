class Main {
  public static void main(String[] args) {
    
    //Circle create
    Circle circle = new Circle(5, 5, 1, 4, 4);

    //Circle data print
    System.out.println("-* Circle *-");
    System.out.println("The circles area is: " + circle.area());
    System.out.println("The circles circumference is: " + circle.circumference());
    System.out.println("The circles center-point is: " + circle.centerX() + ", " + circle.centerY());
    circle.isPointInsideShape();
    System.out.println("");

  //Triangle create
  Triangle triangle = new Triangle(4, 7, 2, 2, 3, 3, 3, 4);

  //Triangle data print
  System.out.println("-* Triangle *-");
  System.out.println("The triangles area is: " + triangle.area());
  System.out.println("The triangles circumference is: " + triangle.circumference());
  System.out.println("The triangles center-point is: " + triangle.centerX() + ", " + triangle.centerY());
  triangle.isPointInsideShape();
  System.out.println("");
  
  //Rectangle create
  Rectangle rectangle = new Rectangle(1, 1, 3, 3, 5, 5);

  //Rectangle data print
  System.out.println("-* Rectangle *-");
  System.out.println("The Rectangles area is: " + rectangle.area());
  System.out.println("The Rectangles circumference is: " + rectangle.circumference());
  System.out.println("The Rectangles center-point is: " + rectangle.centerX() + ", " + rectangle.centerY());
  rectangle.isPointInsideShape();
  System.out.println("");

  //Afstand mellem figurer
  double DistanceCircleTriangle = Math.sqrt(Math.pow(circle.centerX() - triangle.centerX(), 2) + Math.pow(circle.centerY() - triangle.centerY(), 2));

  double DistanceCircleRectangle = Math.sqrt(Math.pow(circle.centerX() - rectangle.centerX(), 2) + Math.pow(circle.centerY() - rectangle.centerY(), 2));

  double DistanceTriangleRectangle = Math.sqrt(Math.pow(rectangle.centerX() - triangle.centerX(), 2) + Math.pow(rectangle.centerY() - triangle.centerX(), 2));

  System.out.println("-* Distance between shapes *-");
  System.out.println("The distance between the circles center and the triangles center is: " + DistanceCircleTriangle);
  System.out.println("The distance between the circles center and the rectangles center is: " + DistanceCircleRectangle);
  System.out.println("The distance between the triangles center and the rectangles center is: " +  DistanceTriangleRectangle);

  }
}