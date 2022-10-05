package HotelBooking;

import java.util.Scanner;

/**
 * @author MEENAG
 *
 */

public class HotelBooking 
{
	public static void main(String[] args) 
	{
		String occupancy = null, ac = null, floor = null;
		Boolean roomFound, start = true;
		
		Room[] Rooms = new Room[7]; 
        Rooms[0] = new Room(101,"Single Occupancy","AC","First Floor",3000,true);
		Rooms[1] = new Room(102,"Double Occupancy","AC","First Floor",4000,true);
		Rooms[2] = new Room(103,"Double Occupancy","Non-AC","First Floor",3000,true);
		Rooms[3] = new Room(201,"Single Occupancy","AC","Second Floor",3000,true);
		Rooms[4] = new Room(202,"Single Occupancy","Non-AC","Second Floor",2000,true);
		Rooms[5] = new Room(203,"Double Occupancy","AC","Second Floor",4000,true);
		Rooms[6] = new Room(204,"Triple Occupancy","AC","Second Floor",5000,true);
		
		Scanner s=new Scanner(System.in);		
		System.out.println("Welcome to the Hotel!\n");
		while (start == true)
		{	
		roomFound = false;
		System.out.println("Which type of occupancy you need? \n(1)Single (2)Double (3)Triple");
        int occ =s.nextInt();
	    switch(occ)
		{
			case 1: 
				occupancy = "Single Occupancy";
				break;
			case 2: 
				occupancy = "Double Occupancy";
				break;
			case 3: 
				occupancy = "Triple Occupancy";
				break;
			default: 
				System.out.println("Invalid.. Please select the correct option!");
		}
	    
	    System.out.println("Do you need AC? \n(1) Yes or (2) No (3)No preference");
        int ac1 =s.nextInt();
	    switch(ac1)
		{
			case 1: 
				ac = "AC";
				break;
			case 2: 
				ac = "Non-AC";
				break;
			case 3: 
				ac = null;
				break;
			default: 
				System.out.println("Invalid.. Please select the correct option!");
		}    
	    
	    System.out.println("Would you like to choose any Floor specifically? \n(1)First (2)Second (3)No preference");
        int flr =s.nextInt();
	    switch(flr)
		{
			case 1: 
				floor = "First Floor";
				break;
			case 2: 
				floor = "Second Floor";
				break;
			case 3: 
				floor = null;
				break;
			default: 
				System.out.println("Invalid.. Please select the correct option!");
		}
	    
	    System.out.println("\n"+occupancy+", "+ac+", "+floor);
	    
	    Booking booking = new Booking(occupancy,ac,floor);  
	    
	    for(Room room: Rooms) 
	    {
	    	if(room.getVacancy()==true) 
	    	{
	    		if(booking.getOccupancy()==(room.getOccupancy()))
	    			{
	    				if(booking.getAc()!=null && booking.getAc()==(room.getAc()))
	    				{
	    					if(booking.getFloor()!=null && booking.getFloor()==(room.getFloor())) 
	    					{
	    						roomFound = true;
	    						room.setVacancy();
	    						System.out.println("Hurray! Your Preferred Room is Available.\nRoom Number: "+room.getRoomNo()+", "+room.getFloor()+", "+room.getAc()+", "
	    								+ ""+room.getOccupancy()+", estimated: Rs."+room.getPrice()+"/day");
	    						break;
	    					}
	    					else if(booking.getFloor()==null)
	    					{
	    						roomFound = true;
	    						room.setVacancy();
	    						System.out.println("Hurray! Your Preferred Room is Available.\nRoom Number: "+room.getRoomNo()+", "+room.getFloor()+", "+room.getAc()+", "
	    								+ ""+room.getOccupancy()+", estimated: Rs."+room.getPrice()+"/day");
	    						break;
	    					}
	    				}
	    				else if(booking.getAc()==null)
	    				{
	    					roomFound = true;
	    					room.setVacancy();
    						System.out.println("Hurray! Your Preferred Room is Available.\nRoom Number: "+room.getRoomNo()+", "+room.getFloor()+", "+room.getAc()+", "
    								+ ""+room.getOccupancy()+", estimated: Rs."+room.getPrice()+"/day");
    						break;
	    				} 
	    			}    		
	    	} 		
	    }
	    
	    if(roomFound == true)
	    {
	    	System.out.println("Have A Happy Stay!!!");
	    }
	    else
	    {
	    	System.out.println("Oops, Rooms are already filled!\n"+occupancy+", "+ac+", "+floor+" not available");
	    }
	    
	    System.out.println("Do you want to continue booking?? \n(1)Yes (2)No");
	    int st =s.nextInt();
	    switch(st)
		{
			case 1: 
				start = true;
				break;
			case 2: 
				start = false;
				break;
			default: 
				start = false;
				System.out.println("Invalid.. Please select the correct option!");
		}    
	}
	}
}

class Room 
{
	String occupancy, ac, floor;
	boolean vacancy;
	int roomNo, price;
	
	public Room(int roomNo, String occupancy, String ac, String floor, int price, boolean vacancy)
	{
		this.occupancy=occupancy;
		this.roomNo=roomNo;
		this.ac=ac;
		this.floor=floor;
		this.price=price;
		this.vacancy=vacancy;
	}
	
	public int getRoomNo() 
	{
        return roomNo;
    }
	
	public String getOccupancy() 
	{
        return occupancy;
    }
	
	public String getAc() 
	{
        return ac;
    }
	
	public String getFloor() 
	{
        return floor;
    }
	
	public int getPrice() 
	{
        return price;
    }
	
	public boolean getVacancy() 
	{
        return vacancy;
    }
	
	public void setVacancy() 
	{
        vacancy = false;
    }
}

class Booking
{
	String occupancy, ac, floor;
	
	public Booking(String occupancy, String ac, String floor)
	{
		this.occupancy=occupancy; 
		this.ac=ac;
		this.floor=floor;
	}
	
	public String getOccupancy() 
	{
		return occupancy;
	}
		
	public String getAc() 
	{
		return ac;
	}
		
	public String getFloor() 
	{
		return floor;
	}
}	
