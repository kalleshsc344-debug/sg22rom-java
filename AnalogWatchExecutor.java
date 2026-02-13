class AnalogWatchExecutor {

public static void main(String[] args) {

double price = AnalogWatch.getPrice();
System.out.println("Price: " + price);

String brand = AnalogWatch.getBrand();
System.out.println("Brand: " + brand);

String model = AnalogWatch.getModel();
System.out.println("Model: " + model);

String dial = AnalogWatch.getDialShape();
System.out.println("Dial Shape: " + dial);

String strap = AnalogWatch.getStrapMaterial();
System.out.println("Strap Material: " + strap);

String caseMat = AnalogWatch.getCaseMaterial();
System.out.println("Case Material: " + caseMat);

String display = AnalogWatch.getDisplayType();
System.out.println("Display Type: " + display);

boolean water = AnalogWatch.isWaterResistant();
System.out.println("Water Resistant: " + water);

int depth = AnalogWatch.getWaterResistanceDepth();
System.out.println("Water Resistance Depth: " + depth + " meters");

String movement = AnalogWatch.getMovementType();
System.out.println("Movement Type: " + movement);

String glass = AnalogWatch.getGlassMaterial();
System.out.println("Glass Material: " + glass);

String color = AnalogWatch.getColor();
System.out.println("Color: " + color);

double weight = AnalogWatch.getWeight();
System.out.println("Weight: " + weight + " grams");

String warranty = AnalogWatch.getWarranty();
System.out.println("Warranty: " + warranty);

String features = AnalogWatch.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
