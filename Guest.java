
/**
 * Write a description of class Guest here.
 *
 * @author Alena Porfoeva
 * @version 001
 */
public class Guest
{
      private String Name;
      private int ArrivalDay;
      private int ArrivalMonth;
      private int ArrivalYear;
      private int HowManyDays;
      
    /**
     * Create a new guest with a given name.
     */
    public Guest (String fullName, int ArrivalDay, int ArrivalMonth, int ArrivalYear, int HowManyDays)
    {
        this.Name = fullName;
        this.ArrivalDay = ArrivalDay;
        this.ArrivalMonth = ArrivalMonth;
        this.ArrivalYear = ArrivalYear;
        this.HowManyDays = HowManyDays;
        
    }
   
    /**
    * Return the full name of this guest.
    */
    public String getName()
    {
        return Name;
    }

    /**
     * Set a new name for this guest.
     */
    public void changeName(String replacementName)
    {
        this.Name = replacementName;
    }

    
    /**
     * Print the guest's name to the output terminal.
     */
    public void print()
    {
        System.out.println(Name + " Arrival: " + ArrivalDay + "." + ArrivalMonth + "." + ArrivalYear + " How many days: " + HowManyDays);
    }
}