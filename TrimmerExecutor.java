class TrimmerExecutor {

public static void main(String[] args) {

double price = Trimmer.getPrice();
System.out.println("Price: " + price);

String brand = Trimmer.getBrand();
System.out.println("Brand: " + brand);

String model = Trimmer.getModel();
System.out.println("Model: " + model);

int runtime = Trimmer.getBatteryRuntime();
System.out.println("Battery Runtime: " + runtime + " minutes");

int charge = Trimmer.getChargingTime();
System.out.println("Charging Time: " + charge + " hours");

String blade = Trimmer.getBladeMaterial();
System.out.println("Blade Material: " + blade);

int settings = Trimmer.getNumberOfLengthSettings();
System.out.println("Length Settings: " + settings);

boolean waterproof = Trimmer.isWaterproof();
System.out.println("Waterproof: " + waterproof);

String power = Trimmer.getPowerSource();
System.out.println("Power Source: " + power);

double weight = Trimmer.getItemWeight();
System.out.println("Weight: " + weight + " grams");

String color = Trimmer.getColor();
System.out.println("Color: " + color);

String warranty = Trimmer.getWarranty();
System.out.println("Warranty: " + warranty);

String country = Trimmer.getCountryOfOrigin();
System.out.println("Country of Origin: " + country);

String components = Trimmer.getIncludedComponents();
System.out.println("Included Components: " + components);

String features = Trimmer.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
