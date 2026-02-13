class MobileChargerExecutor {

public static void main(String[] args) {

String brand = MobileCharger.getBrand();
System.out.println("Brand: " + brand);

int wattage = MobileCharger.getWattage();
System.out.println("Wattage: " + wattage + "W");

String type = MobileCharger.getChargerType();
System.out.println("Charger Type: " + type);

double price = MobileCharger.getPrice();
System.out.println("Price: " + price);

String connector = MobileCharger.getConnectorType();
System.out.println("Connector Type: " + connector);

boolean cable = MobileCharger.hasCableIncluded();
System.out.println("Cable Included: " + cable);

String color = MobileCharger.getColor();
System.out.println("Color: " + color);

boolean fast = MobileCharger.supportsFastCharging();
System.out.println("Fast Charging: " + fast);

String voltage = MobileCharger.getInputVoltage();
System.out.println("Input Voltage: " + voltage);

String warranty = MobileCharger.getWarranty();
System.out.println("Warranty: " + warranty);

}
}
