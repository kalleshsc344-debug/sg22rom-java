class WaterHeaterExecutor {

public static void main(String[] args) {

double price = WaterHeater.getPrice();
System.out.println("Price: " + price);

String brand = WaterHeater.getBrand();
System.out.println("Brand: " + brand);

int capacity = WaterHeater.getCapacity();
System.out.println("Capacity: " + capacity + " litres");

int power = WaterHeater.getPower();
System.out.println("Power: " + power + " watts");

boolean thermostat = WaterHeater.hasThermostat();
System.out.println("Thermostat: " + thermostat);

String tank = WaterHeater.getTankMaterial();
System.out.println("Tank Material: " + tank);

int star = WaterHeater.getStarRating();
System.out.println("Star Rating: " + star);

boolean safety = WaterHeater.hasSafetyValve();
System.out.println("Safety Valve: " + safety);

String warranty = WaterHeater.getWarranty();
System.out.println("Warranty: " + warranty);

String features = WaterHeater.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
