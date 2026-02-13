class WaterBottleExecutor {

public static void main(String[] args) {

double price = WaterBottle.getPrice();
System.out.println("Price: " + price);

String brand = WaterBottle.getBrand();
System.out.println("Brand: " + brand);

String material = WaterBottle.getMaterial();
System.out.println("Material: " + material);

int capacity = WaterBottle.getCapacity();
System.out.println("Capacity: " + capacity + " ml");

boolean insulated = WaterBottle.isInsulated();
System.out.println("Insulated: " + insulated);

String color = WaterBottle.getColor();
System.out.println("Color: " + color);

double weight = WaterBottle.getWeight();
System.out.println("Weight: " + weight + " grams");

String leak = WaterBottle.getLeakProofType();
System.out.println("Leak Proof: " + leak);

String usage = WaterBottle.getUsage();
System.out.println("Usage: " + usage);

String cap = WaterBottle.getCapType();
System.out.println("Cap Type: " + cap);

String finish = WaterBottle.getFinishType();
System.out.println("Finish Type: " + finish);

String warranty = WaterBottle.getWarranty();
System.out.println("Warranty: " + warranty);

String country = WaterBottle.getCountryOfOrigin();
System.out.println("Country: " + country);

String temp = WaterBottle.getTemperatureRetention();
System.out.println("Temperature Retention: " + temp);

String features = WaterBottle.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
