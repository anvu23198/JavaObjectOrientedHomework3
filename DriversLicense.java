import java.time.LocalDateTime;
public class DriversLicense
{
   private String name;
   private int id;
   private int expYear;
   private int expMonth;
   private int expDay;
   
   public DriversLicense(String name, int id, int expMonth, int expDay, int expYear)
   {
      this.name = name;
      this.id = id;
      this.expYear = expYear;
      this.expMonth = expMonth;
      this.expDay = expDay;
   }
   public boolean isExpired()
   {
      LocalDateTime date = LocalDateTime.now();
      int year = date.getYear();
      int month = date.getMonthValue();
      int day = date.getDayOfMonth();
      if(year < this.expYear)
         return false;
      else if(year == this.expYear)
      {
         if(month < this.expMonth)
            return false;
         else if(month == this.expMonth)
         {
            if(day < this.expDay)
            {
               return false;
            }
            else
            {
               return true;
            }
            
         }
         else
         {
            return true;
         }
      }
      else
         return true;
   }
   
   public void displayInfo()
   {
      System.out.println("Name: " + this.name);
      System.out.println("ID: " + this.id);
      System.out.println("Expiration: " + this.expMonth + "/" + this.expDay + "/" + this.expYear);
   }
}