class HeadphonesExecutor {

public static void main(String[] args) {

double price = Headphones.getPrice();
System.out.println("Price: " + price);

String brand = Headphones.getBrand();
System.out.println("Brand: " + brand);

String model = Headphones.getModel();
System.out.println("Model: " + model);

String connectivity = Headphones.getConnectivityType();
System.out.println("Connectivity: " + connectivity);

int battery = Headphones.getBatteryLife();
System.out.println("Battery Life: " + battery + " hours");

boolean anc = Headphones.hasNoiseCancellation();
System.out.println("Noise Cancellation: " + anc);

String color = Headphones.getColor();
System.out.println("Color: " + color);

double weight = Headphones.getWeight();
System.out.println("Weight: " + weight + " grams");

String charge = Headphones.getChargingTime();
System.out.println("Charging Time: " + charge);

String driver = Headphones.getDriverSize();
System.out.println("Driver Size: " + driver);

String control = Headphones.getControlType();
System.out.println("Control Type: " + control);

boolean mic = Headphones.hasBuiltInMic();
System.out.println("Built-in Mic: " + mic);

String warranty = Headphones.getWarranty();
System.out.println("Warranty: " + warranty);

String country = Headphones.getCountryOfOrigin();
System.out.println("Country: " + country);

String features = Headphones.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
