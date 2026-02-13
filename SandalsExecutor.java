class SandalsExecutor {

public static void main(String[] args) {

double price = Sandals.getPrice();
System.out.println("Price: " + price);

String brand = Sandals.getBrand();
System.out.println("Brand: " + brand);

String material = Sandals.getMaterial();
System.out.println("Upper Material: " + material);

String sole = Sandals.getSoleMaterial();
System.out.println("Sole Material: " + sole);

String closure = Sandals.getClosureType();
System.out.println("Closure Type: " + closure);

String color = Sandals.getColor();
System.out.println("Color: " + color);

String occasion = Sandals.getOccasion();
System.out.println("Occasion: " + occasion);

double weight = Sandals.getWeight();
System.out.println("Weight: " + weight + " grams");

boolean water = Sandals.isWaterResistant();
System.out.println("Water Resistant: " + water);

String fit = Sandals.getFitType();
System.out.println("Fit Type: " + fit);

String warranty = Sandals.getWarranty();
System.out.println("Warranty: " + warranty);

String country = Sandals.getCountryOfOrigin();
System.out.println("Country: " + country);

String heel = Sandals.getHeelType();
System.out.println("Heel Type: " + heel);

String cushion = Sandals.getCushionType();
System.out.println("Cushion Type: " + cushion);

String features = Sandals.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
