class PrinterExecutor {

public static void main(String[] args) {

double price = Printer.getPrice();
System.out.println("Price: " + price);

String brand = Printer.getBrand();
System.out.println("Brand: " + brand);

String type = Printer.getType();
System.out.println("Type: " + type);

boolean wireless = Printer.isWireless();
System.out.println("Wireless: " + wireless);

String tech = Printer.getPrintTechnology();
System.out.println("Print Technology: " + tech);

int speed = Printer.getPrintSpeed();
System.out.println("Print Speed: " + speed + " ppm");

boolean scanner = Printer.hasScanner();
System.out.println("Scanner: " + scanner);

boolean duplex = Printer.hasDuplexPrinting();
System.out.println("Duplex Printing: " + duplex);

String warranty = Printer.getWarranty();
System.out.println("Warranty: " + warranty);

String features = Printer.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
