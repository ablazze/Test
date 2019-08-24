import java.util.ArrayList;
/**
 * Write a description of class Room here.
 *
 * @author Alena Porfoeva
 * @version 001
 */
public class Room
/**
     * Atribute av klasser
     */
{
    private String RoomName;
    private ArrayList<Guest> plasser;
    private int maxNumberOfGuests;
    private boolean Full;
   
   /**
   * Create a HostelRoom with limited number of enrolments
   */
   public Room (String Roomname, int maxNumberOfGuests)
   {
       this.RoomName = RoomName;
       plasser = new ArrayList<Guest>();
       this.maxNumberOfGuests = maxNumberOfGuests;
       Full = true;
   }
   
    
    /**
     * Return the number of guests currently enrolled.
     */
    public int getNumberOfGuests()
    {
        return plasser.size();
    }
   
    /**
     * Add a guest to this HostelRooms.
     */
    public void enrollGuest(Guest newGuest)
    {
        if(getNumberOfGuests() == maxNumberOfGuests) 
        
        {Full = false;
            System.out.println("The room is full, you cannot enroll.");
        }
        else {
            plasser.add(newGuest);
        }
    }
    
     public boolean IsFree()
    {
        return Full;
    }
   
    /**
     * Print a list of guests
     */
    public void printList()
    {
        System.out.println("A list of guests:");
        System.out.println("-----------------------");
        System.out.println ();
        for(Guest guest : plasser) {
            guest.print();
            System.out.println("-----------------------");
        }
        System.out.println("Number of guests: " + getNumberOfGuests());
    }
    
    public void FullTheWholeRoom (Guest newGuest)
    
    {while (plasser.size() < maxNumberOfGuests)
        {enrollGuest(newGuest);}}
}


