public class Point
{
   private int x;
   private int y;
   
   public Point()
   {
      this.x = 0;
      this.y = 0;
   }
   
   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public int getX()
   {
      return this.x;
   }
   public int getY()
   {
      return this.y;
   }
   
   public void setPoint(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public String toString()
   {
      String a = "(" +this.x+ ", " +this.y+ ")";
      return a;
   }
   
   public double distance(Point obj)
   {
      double total = Math.pow((this.x - obj.x), 2) + Math.pow((this.y - obj.y), 2);
      double afterSquareRoot = Math.sqrt(total);
      return afterSquareRoot;
   }
}