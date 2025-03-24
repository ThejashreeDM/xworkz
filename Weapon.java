class Weapon {
    int id;
    String name;
    String type; 
    boolean isAutomatic; 
    double range; 
    double weight; 
    String material; 
    char damageLevel; 
    double price; 

    Weapon() {
        this(1);
        System.out.println("Finally, no-arg constructor is executed");
    }

    Weapon(int id) {
        this("AK-47", "Firearm");
        this.id = id;
    }

    Weapon(String name, String type) {
        this(true, 350.0);
        this.name = name;
        this.type = type;
    }

    Weapon(boolean isAutomatic, double range) {
        this(4.3, "Steel");
        this.isAutomatic = isAutomatic;
        this.range = range;
    }

    Weapon(double weight, String material) {
        this('H');
        this.weight = weight;
        this.material = material;
    }

    Weapon(char damageLevel) {
        this(1500.0);
        this.damageLevel = damageLevel;
    }

    Weapon(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Weapon ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Range: " + range + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Material: " + material);
        System.out.println("Damage Level: " + damageLevel);
        System.out.println("Price: $" + price);
    }
}