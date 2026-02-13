class TabletExecutor {

public static void main(String[] args) {

double price = Tablet.getPrice();
System.out.println("Price: " + price);

String brand = Tablet.getBrand();
System.out.println("Brand: " + brand);

String model = Tablet.getModel();
System.out.println("Model: " + model);

double size = Tablet.getDisplaySize();
System.out.println("Display Size: " + size + " inches");

int storage = Tablet.getStorage();
System.out.println("Storage: " + storage + " GB");

String processor = Tablet.getProcessor();
System.out.println("Processor: " + processor);

int ram = Tablet.getRAM();
System.out.println("RAM: " + ram + " GB");

boolean cellular = Tablet.hasCellularSupport();
System.out.println("Cellular Support: " + cellular);

String os = Tablet.getOperatingSystem();
System.out.println("Operating System: " + os);

String warranty = Tablet.getWarranty();
System.out.println("Warranty: " + warranty);

String features = Tablet.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
