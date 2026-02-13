class MacBookExecutor {

public static void main(String[] args) {

double price = MacBook.getPrice();
System.out.println("Price: " + price);

String model = MacBook.getModel();
System.out.println("Model: " + model);

String processor = MacBook.getProcessor();
System.out.println("Processor: " + processor);

int ram = MacBook.getRAM();
System.out.println("RAM: " + ram + " GB");

int storage = MacBook.getStorage();
System.out.println("Storage: " + storage + " GB");

double screen = MacBook.getScreenSize();
System.out.println("Screen Size: " + screen + " inch");

String os = MacBook.getOperatingSystem();
System.out.println("Operating System: " + os);

String battery = MacBook.getBatteryLife();
System.out.println("Battery Life: " + battery);

boolean touchId = MacBook.hasTouchID();
System.out.println("Touch ID: " + touchId);

String warranty = MacBook.getWarranty();
System.out.println("Warranty: " + warranty);

}
}
