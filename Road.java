class Road 
{
    int id;
    String name;
    String type; 
    double length; 
    double width; 
    boolean isTollRequired; 
    String material; 
    char condition; 
    double speedLimit; 

    Road() {
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Road(int id) {
        this("Golden Quadrilateral", "Highway");
        this.id = id;
     }


    Road(String name, String type) {
        this(1500.0, 30.0);
        this.name = name;
        this.type = type;
     }

    Road(double length, double width) {
        this(true, "Asphalt");
        this.length = length;
        this.width = width;
      }

    Road(boolean isTollRequired, String material) {
        this('G');
        this.isTollRequired = isTollRequired;
        this.material = material;
       }

    Road(char condition) {
        this(120.0);
        this.condition = condition;
    }

    Road(double speedLimit) {
        this.speedLimit = speedLimit;
     }

    public void displayInfo() {
        System.out.println("Road ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length + " km");
        System.out.println("Width: " + width + " meters");
        System.out.println("Toll Required: " + isTollRequired);
        System.out.println("Material: " + material);
        System.out.println("Condition: " + condition);
        System.out.println("Speed Limit: " + speedLimit + " km/h");
    }
}