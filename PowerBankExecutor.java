class PowerBankExecutor {

public static void main(String[] args) {

double price = PowerBank.getPrice();
System.out.println("Price: " + price);

String brand = PowerBank.getBrand();
System.out.println("Brand: " + brand);

int capacity = PowerBank.getCapacity();
System.out.println("Capacity: " + capacity + " mAh");

int outputPorts = PowerBank.getNumberOfPorts();
System.out.println("Number Of Ports: " + outputPorts);

boolean fastCharging = PowerBank.isFastChargingSupported();
System.out.println("Fast Charging: " + fastCharging);

String batteryType = PowerBank.getBatteryType();
System.out.println("Battery Type: " + batteryType);

double weight = PowerBank.getWeight();
System.out.println("Weight: " + weight + " grams");

String color = PowerBank.getColor();
System.out.println("Color: " + color);

String warranty = PowerBank.getWarranty();
System.out.println("Warranty: " + warranty);

String country = PowerBank.getCountryOfOrigin();
System.out.println("Country: " + country);

}
}
