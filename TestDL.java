public class TestDL
{
   public static void main(String[] args)
   {
      DriversLicense dr1 = new DriversLicense("John Smith", 192891, 6, 21, 2018);
      dr1.displayInfo();
      System.out.println("Expired? " + dr1.isExpired());
      System.out.println();

      
      DriversLicense dr2 = new DriversLicense("Jennifer Brown", 728828, 5, 31, 2017);
      dr2.displayInfo();
      System.out.println("Expired? " + dr2.isExpired());
      System.out.println();
      
      DriversLicense dr3 = new DriversLicense("Britney Wilson", 592031, 7, 15, 2019);
      dr3.displayInfo();
      System.out.println("Expired? " + dr3.isExpired());
      System.out.println();
   }
}