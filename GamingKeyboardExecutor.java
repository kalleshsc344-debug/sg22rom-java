class GamingKeyboardExecutor {

public static void main(String[] args) {

double price = GamingKeyboard.getPrice();
System.out.println("Price: " + price);

String brand = GamingKeyboard.getBrand();
System.out.println("Brand: " + brand);

String switchType = GamingKeyboard.getSwitchType();
System.out.println("Switch Type: " + switchType);

boolean rgb = GamingKeyboard.hasRGBLighting();
System.out.println("RGB Lighting: " + rgb);

String connectivity = GamingKeyboard.getConnectivity();
System.out.println("Connectivity: " + connectivity);

int keys = GamingKeyboard.getNumberOfKeys();
System.out.println("Number Of Keys: " + keys);

boolean mechanical = GamingKeyboard.isMechanical();
System.out.println("Mechanical: " + mechanical);

String layout = GamingKeyboard.getKeyboardLayout();
System.out.println("Keyboard Layout: " + layout);

String warranty = GamingKeyboard.getWarranty();
System.out.println("Warranty: " + warranty);

String compatibility = GamingKeyboard.getCompatibility();
System.out.println("Compatibility: " + compatibility);

}
}
