class SmartTVExecutor {

public static void main(String[] args) {

double price = SmartTV.getPrice();
System.out.println("Price: " + price);

String brand = SmartTV.getBrand();
System.out.println("Brand: " + brand);

double size = SmartTV.getScreenSize();
System.out.println("Screen Size: " + size + " inches");

String resolution = SmartTV.getResolution();
System.out.println("Resolution: " + resolution);

String display = SmartTV.getDisplayType();
System.out.println("Display Type: " + display);

boolean smart = SmartTV.isSmartTV();
System.out.println("Smart TV: " + smart);

String os = SmartTV.getOperatingSystem();
System.out.println("Operating System: " + os);

int hdmi = SmartTV.getHDMIPorts();
System.out.println("HDMI Ports: " + hdmi);

boolean voice = SmartTV.hasVoiceControl();
System.out.println("Voice Control: " + voice);

String warranty = SmartTV.getWarranty();
System.out.println("Warranty: " + warranty);

String features = SmartTV.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
