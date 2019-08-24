import java.util.ArrayList;

/**
*
* @author Alena Porfoeva
* @version 001
*/
public class Hostel
    
{
    private String HostelName;
    private ArrayList<Room> rooms;
    private int maxNumberOfRooms;
        
   public Hostel (String HostelName)
    {
        this.HostelName = HostelName;
        this.rooms = new ArrayList<Room>();
        this.maxNumberOfRooms = 15;
                
    }
        
   public void addRoom(Room newRoom)
    {
        if(rooms.size() == maxNumberOfRooms) {
                
        System.out.println("The hostel is full.");
        }
        else {
        rooms.add(newRoom);
    }
    }
        
}
