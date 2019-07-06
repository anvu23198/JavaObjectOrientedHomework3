public class TestCircle
{
   public static void main(String[] args)
   {
      Circle c = new Circle();
      double r1 = 8.5949958;
      System.out.println("Area of circle with radius " + r1 + " is: ");
      System.out.println(c.findCircleArea(r1));
      System.out.println();
      
      double r2 = 34403939.594039382;
      System.out.println("Area of circle with radius " + r2 + " is: ");
      System.out.println(c.findCircleArea(r2));
   
   }
}