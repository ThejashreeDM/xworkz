class Switch {
    int id;
    String type; 
    String brand;
    boolean isSmart; 
    boolean isWireless;
    String material; 
    String colour;
    char qualityGrade; 
    double price;

    Switch() 
	{
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Switch(int id) 
	{
        this("Rocker", "Philips");
        this.id = id;
    }

    Switch(String type, String brand) 
	{
        this(true, "Plastic");
        this.type = type;
        this.brand = brand;
    }

    Switch(boolean isSmart, String material) 
	{
        this("White", true);
        this.isSmart = isSmart;
        this.material = material;
    }

    Switch(String colour, boolean isWireless) 
	{
        this('A');
        this.colour = colour;
        this.isWireless = isWireless;
    }

    Switch(char qualityGrade) 
	{
        this(25.99);
        this.qualityGrade = qualityGrade;
    }

    Switch(double price) 
	{
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Is Smart: " + isSmart);
        System.out.println("Is Wireless: " + isWireless);
        System.out.println("Material: " + material);
        System.out.println("Colour: " + colour);
        System.out.println("Quality Grade: " + qualityGrade);
        System.out.println("Price: $" + price);
    }
}