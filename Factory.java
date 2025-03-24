class Factory {
    int id;
    String name;
    String location;
    boolean isAutomated; 
    int numberOfWorkers;
    String industryType; 
    double productionCapacity; 
    char safetyRating; 
    double revenue; 

    Factory() 
	{
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Factory(int id) 
	{
        this("Tesla Gigafactory", "Nevada, USA");
        this.id = id;
    }

    Factory(String name, String location) 
	{
        this(true, 10000);
        this.name = name;
        this.location = location;
    }

    Factory(boolean isAutomated, int numberOfWorkers) 
	{
        this("Automobile", 500.0);
        this.isAutomated = isAutomated;
        this.numberOfWorkers = numberOfWorkers;
    }

    Factory(String industryType, double productionCapacity) 
	{
        this('A');
        this.industryType = industryType;
        this.productionCapacity = productionCapacity;
    }

    Factory(char safetyRating) 
	{
        this(50.0);
        this.safetyRating = safetyRating;
    }

    Factory(double revenue) 
	{
        this.revenue = revenue;
    }

    public void displayInfo() {
        System.out.println("Factory ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Is Automated: " + isAutomated);
        System.out.println("Number of Workers: " + numberOfWorkers);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Production Capacity: " + productionCapacity + " units/tons per day");
        System.out.println("Safety Rating: " + safetyRating);
        System.out.println("Annual Revenue: $" + revenue + " million");
    }
}
