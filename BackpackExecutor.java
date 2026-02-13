class BackpackExecutor {

public static void main(String[] args) {

double price = Backpack.getPrice();
System.out.println("Price: " + price);

String brand = Backpack.getBrand();
System.out.println("Brand: " + brand);

String model = Backpack.getModel();
System.out.println("Model: " + model);

int capacity = Backpack.getCapacity();
System.out.println("Capacity: " + capacity + " Litres");

String material = Backpack.getMaterial();
System.out.println("Material: " + material);

int compartments = Backpack.getCompartments();
System.out.println("Compartments: " + compartments);

boolean laptop = Backpack.hasLaptopCompartment();
System.out.println("Laptop Compartment: " + laptop);

String water = Backpack.getWaterResistance();
System.out.println("Water Resistance: " + water);

double weight = Backpack.getWeight();
System.out.println("Weight: " + weight + " grams");

String color = Backpack.getColor();
System.out.println("Color: " + color);

String strap = Backpack.getStrapType();
System.out.println("Strap Type: " + strap);

String usage = Backpack.getUsageType();
System.out.println("Usage Type: " + usage);

String warranty = Backpack.getWarranty();
System.out.println("Warranty: " + warranty);

String country = Backpack.getCountryOfOrigin();
System.out.println("Country of Origin: " + country);

String features = Backpack.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
