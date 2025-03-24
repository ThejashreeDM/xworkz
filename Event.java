class Event {
     
	 
	 
	int id;
    String type; 
    String location;
    String date; 
    int attendees; 
    boolean isVirtual;
    char importanceLevel; 
    double ticketPrice; 

    Event() 
	{
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Event(int id) 
	{
        this("Conference");
        this.id = id;
    }

    Event(String type)
	{
        this("New York", "2025-07-15");
        this.type = type;
     }

    Event(String location, String date)
 	{
        this(5000, true);
        this.location = location;
        this.date = date;
     }

    Event(int attendees, boolean isVirtual)
	{
        this('H');
        this.attendees = attendees;
        this.isVirtual = isVirtual;
     }

    Event(char importanceLevel) 
	{
        this(99.99);
        this.importanceLevel = importanceLevel;
     }

    Event(double ticketPrice) 
	{
        this.ticketPrice = ticketPrice;
     }

    public void displayInfo() {
        System.out.println("Event ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Virtual Event: " + isVirtual);
        System.out.println("Importance Level: " + importanceLevel);
        System.out.println("Ticket Price: $" + ticketPrice);
    }
}