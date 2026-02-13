class GamingLaptopExecutor {

public static void main(String[] args) {

double price = GamingLaptop.getPrice();
System.out.println("Price: " + price);

String brand = GamingLaptop.getBrand();
System.out.println("Brand: " + brand);

String model = GamingLaptop.getModel();
System.out.println("Model: " + model);

String processor = GamingLaptop.getProcessor();
System.out.println("Processor: " + processor);

String gpu = GamingLaptop.getGraphicsCard();
System.out.println("Graphics Card: " + gpu);

int ram = GamingLaptop.getRAM();
System.out.println("RAM: " + ram + " GB");

int storage = GamingLaptop.getStorage();
System.out.println("Storage: " + storage + " GB SSD");

double displaySize = GamingLaptop.getDisplaySize();
System.out.println("Display Size: " + displaySize + " inches");

String displayType = GamingLaptop.getDisplayType();
System.out.println("Display Type: " + displayType);

boolean rgb = GamingLaptop.hasRGBKeyboard();
System.out.println("RGB Keyboard: " + rgb);

String os = GamingLaptop.getOperatingSystem();
System.out.println("Operating System: " + os);

double weight = GamingLaptop.getWeight();
System.out.println("Weight: " + weight + " kg");

String battery = GamingLaptop.getBatteryBackup();
System.out.println("Battery Backup: " + battery);

String warranty = GamingLaptop.getWarranty();
System.out.println("Warranty: " + warranty);

String features = GamingLaptop.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
