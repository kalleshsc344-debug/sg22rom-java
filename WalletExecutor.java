class WalletExecutor {

public static void main(String[] args) {

double price = Wallet.getPrice();
System.out.println("Price: " + price);

String brand = Wallet.getBrand();
System.out.println("Brand: " + brand);

String material = Wallet.getMaterial();
System.out.println("Material: " + material);

String color = Wallet.getColor();
System.out.println("Color: " + color);

int slots = Wallet.getNumberOfCardSlots();
System.out.println("Card Slots: " + slots);

int compartments = Wallet.getNumberOfCompartments();
System.out.println("Compartments: " + compartments);

boolean coin = Wallet.hasCoinPocket();
System.out.println("Coin Pocket: " + coin);

boolean rfid = Wallet.hasRFIDProtection();
System.out.println("RFID Protection: " + rfid);

double weight = Wallet.getWeight();
System.out.println("Weight: " + weight + " grams");

String closure = Wallet.getClosureType();
System.out.println("Closure Type: " + closure);

String occasion = Wallet.getOccasion();
System.out.println("Occasion: " + occasion);

String warranty = Wallet.getWarranty();
System.out.println("Warranty: " + warranty);

String country = Wallet.getCountryOfOrigin();
System.out.println("Country: " + country);

String dimension = Wallet.getDimensions();
System.out.println("Dimensions: " + dimension);

String features = Wallet.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
