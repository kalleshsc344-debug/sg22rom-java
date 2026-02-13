class AirConditionerExecutor {

public static void main(String[] args) {

double price = AirConditioner.getPrice();
System.out.println("Price: " + price);

String brand = AirConditioner.getBrand();
System.out.println("Brand: " + brand);

double capacity = AirConditioner.getCapacity();
System.out.println("Capacity: " + capacity + " Tons");

int star = AirConditioner.getStarRating();
System.out.println("Star Rating: " + star);

boolean inverter = AirConditioner.hasInverterTechnology();
System.out.println("Inverter Technology: " + inverter);

String type = AirConditioner.getType();
System.out.println("Type: " + type);

String refrigerant = AirConditioner.getRefrigerantType();
System.out.println("Refrigerant Type: " + refrigerant);

int power = AirConditioner.getPowerConsumption();
System.out.println("Power Consumption: " + power + " watts");

String warranty = AirConditioner.getWarranty();
System.out.println("Warranty: " + warranty);

String features = AirConditioner.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
