import java.math.*;
public class Fibonacci
{
   public void fibonacci(int n)
   {
      BigInteger a = new BigInteger("0");
      BigInteger b = new BigInteger("1");
      BigInteger temp = new BigInteger("0");
      int index = 1;
      while(index < n)
      {
         temp = a.add(b);
         a = b;
         b = temp;
         index++;
      }
      
      
      System.out.print(temp + "\n");
   }
}