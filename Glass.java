class Glass {
    int id;
    String type; 
    String utility; 
    boolean isTransparent;
    boolean isFragile;
    String refractiveIndex;
    String colour;
    char qualityGrade; 
    double price;

    Glass() 
	{
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Glass(int id) 
	{
        this("Tempered Glass", "Mobile Screen, Car Windows");
        this.id = id;
    }

    Glass(String type, String utility) 
	{
        this(true, "1.52");
        this.type = type;
        this.utility = utility;
    }

    Glass(boolean isTransparent, String refractiveIndex) 
	{
        this("Clear", true);
        this.isTransparent = isTransparent;
        this.refractiveIndex = refractiveIndex;
    }

    Glass(String colour, boolean isFragile) 
	{
        this('A');
        this.colour = colour;
        this.isFragile = isFragile;
    }

    Glass(char qualityGrade) 
	{
        this(150.50);
        this.qualityGrade = qualityGrade;
    }

    Glass(double price) 
	{
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Utility: " + utility);
        System.out.println("Is Transparent: " + isTransparent);
        System.out.println("Is Fragile: " + isFragile);
        System.out.println("Refractive Index: " + refractiveIndex);
        System.out.println("Colour: " + colour);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Price: $" + price + " per square meter");
    }
}