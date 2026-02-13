class CoffeeMakerExecutor {

public static void main(String[] args) {

double price = CoffeeMaker.getPrice();
System.out.println("Price: " + price);

String brand = CoffeeMaker.getBrand();
System.out.println("Brand: " + brand);

String type = CoffeeMaker.getType();
System.out.println("Type: " + type);

int capacity = CoffeeMaker.getCapacity();
System.out.println("Capacity: " + capacity + " cups");

int power = CoffeeMaker.getPower();
System.out.println("Power: " + power + " watts");

boolean autoOff = CoffeeMaker.hasAutoShutOff();
System.out.println("Auto Shut Off: " + autoOff);

String material = CoffeeMaker.getMaterial();
System.out.println("Material: " + material);

String color = CoffeeMaker.getColor();
System.out.println("Color: " + color);

String warranty = CoffeeMaker.getWarranty();
System.out.println("Warranty: " + warranty);

String features = CoffeeMaker.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
