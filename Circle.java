import java.math.*;
public class Circle
{
   public BigDecimal findCircleArea(double r)
   {
      BigDecimal pi = new BigDecimal("3.14159");
      BigDecimal A = new BigDecimal("0");
      BigDecimal d = new BigDecimal(r);
      BigDecimal t = d.pow(2);
      A = pi.multiply(t);
      return A;
   } 
}