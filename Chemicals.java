class Chemicals {
    int id;
    String name;
    String utility;
    boolean isFlammable;
    boolean isToxic;
    String state; 
    String colour;
    char hazardLevel; 
    double price;

    
    Chemicals() 
	{
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    
    Chemicals(int id) 
	{
        this("Sulfuric Acid", "Industrial, Battery Acid");
        this.id = id;
    }

    
    Chemicals(String name, String utility) 
	{
        this(true, "Liquid");
        this.name = name;
        this.utility = utility;
    }

   
    Chemicals(boolean isFlammable, String state) 
	{
        this("Colorless", true);
        this.isFlammable = isFlammable;
        this.state = state;
    }

    
    Chemicals(String colour, boolean isToxic) 
	{
        this('H');
        this.colour = colour;
        this.isToxic = isToxic;
    }

    
    Chemicals(char hazardLevel) 
	{
        this(250.75);
        this.hazardLevel = hazardLevel;
    }

    
    Chemicals(double price) 
	{
        this.price = price;
    }
	
	 public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Utility: " + utility);
        System.out.println("Is Flammable: " + isFlammable);
        System.out.println("Is Toxic: " + isToxic);
        System.out.println("State: " + state);
        System.out.println("Colour: " + colour);
        System.out.println("Hazard Level: " + hazardLevel);
        System.out.println("Price: $" + price + " per liter/kg");
    }
}