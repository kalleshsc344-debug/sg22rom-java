class CeilingFanExecutor {

public static void main(String[] args) {

double price = CeilingFan.getPrice();
System.out.println("Price: " + price);

String brand = CeilingFan.getBrand();
System.out.println("Brand: " + brand);

int blades = CeilingFan.getBladeCount();
System.out.println("Blade Count: " + blades);

int sweep = CeilingFan.getSweepSize();
System.out.println("Sweep Size: " + sweep + " mm");

int speed = CeilingFan.getSpeed();
System.out.println("Speed: " + speed + " RPM");

boolean remote = CeilingFan.hasRemoteControl();
System.out.println("Remote Control: " + remote);

String motor = CeilingFan.getMotorType();
System.out.println("Motor Type: " + motor);

int power = CeilingFan.getPowerConsumption();
System.out.println("Power Consumption: " + power + " watts");

String warranty = CeilingFan.getWarranty();
System.out.println("Warranty: " + warranty);

String features = CeilingFan.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
