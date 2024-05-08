package homeWorkExercise1;

class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Electronics extends Product {
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, int quantity, String type,
                       double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Fridge extends Electronics {
    private int temperature;

    public Fridge(double price, String name, String description, int quantity, String type,
                  double length, double width, double height, double weight, int temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

public class Main {
    public static void main(String[] args) {
        Cosmetics lipstick = new Cosmetics(10.99, "Lipstick", "Red Lipstick", 5, "Red", 0.05);
        Electronics smartphone = new Electronics(1099.99, "Smartphone", "Android Smartphone", 10, "Smartphone", 139.7, 71.12, 7.62, 200);
        Fridge fridge = new Fridge(1499.99, "Fridge", "Smart Fridge", 3, "Fridge", 180, 90, 70, 65, -15);

        System.out.println("Product: " + lipstick.getName());
        System.out.println("Price: Lei " + lipstick.getPrice());
        System.out.println("Color: " + lipstick.getColor());
        System.out.println("Weight: " + lipstick.getWeight() + " oz");
        System.out.println();

        System.out.println("Product: " + smartphone.getName());
        System.out.println("Price: Lei " + smartphone.getPrice());
        System.out.println("Type: " + smartphone.getType());
        System.out.println("Length: " + smartphone.getLength() + " millimeters");
        System.out.println("Width: " + smartphone.getWidth() + " millimeters");
        System.out.println("Height: " + smartphone.getHeight() + " millimeters");
        System.out.println("Weight: " + smartphone.getWeight() + " grams");
        System.out.println();

        System.out.println("Product: " + fridge.getName());
        System.out.println("Price: Lei " + fridge.getPrice());
        System.out.println("Type: " + fridge.getType());
        System.out.println("Length: " + fridge.getLength() + " centimeters");
        System.out.println("Width: " + fridge.getWidth() + " centimeters");
        System.out.println("Height: " + fridge.getHeight() + " centimeters");
        System.out.println("Weight: " + fridge.getWeight() + " kg");
        System.out.println("Temperature: " + fridge.getTemperature() + "°C");
    }
}

