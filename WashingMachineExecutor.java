class WashingMachineExecutor {

public static void main(String[] args) {

double price = WashingMachine.getPrice();
System.out.println("Price: " + price);

String brand = WashingMachine.getBrand();
System.out.println("Brand: " + brand);

String type = WashingMachine.getType();
System.out.println("Type: " + type);

int capacity = WashingMachine.getCapacity();
System.out.println("Capacity: " + capacity + " kg");

int spin = WashingMachine.getSpinSpeed();
System.out.println("Spin Speed: " + spin + " RPM");

int star = WashingMachine.getStarRating();
System.out.println("Star Rating: " + star);

boolean inverter = WashingMachine.hasInverterMotor();
System.out.println("Inverter Motor: " + inverter);

int programs = WashingMachine.getNumberOfWashPrograms();
System.out.println("Wash Programs: " + programs);

String warranty = WashingMachine.getWarranty();
System.out.println("Warranty: " + warranty);

String features = WashingMachine.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
