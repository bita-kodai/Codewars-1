public class Circle {
  public static double area(double radius) {
    if(radius>0) return Math.round((Math.PI * Math.pow(radius,2)) * 100.0)/100.0;
    else throw new IllegalArgumentException();
  }
}