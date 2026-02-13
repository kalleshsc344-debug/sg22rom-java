class MixerGrinderExecutor {

public static void main(String[] args) {

double price = MixerGrinder.getPrice();
System.out.println("Price: " + price);

String brand = MixerGrinder.getBrand();
System.out.println("Brand: " + brand);

int power = MixerGrinder.getPower();
System.out.println("Power: " + power + " watts");

int jars = MixerGrinder.getNumberOfJars();
System.out.println("Number Of Jars: " + jars);

String jarMaterial = MixerGrinder.getJarMaterial();
System.out.println("Jar Material: " + jarMaterial);

boolean overload = MixerGrinder.hasOverloadProtection();
System.out.println("Overload Protection: " + overload);

int speed = MixerGrinder.getSpeedSettings();
System.out.println("Speed Settings: " + speed);

String body = MixerGrinder.getBodyMaterial();
System.out.println("Body Material: " + body);

String warranty = MixerGrinder.getWarranty();
System.out.println("Warranty: " + warranty);

String features = MixerGrinder.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
