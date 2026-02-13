class RunningShoesExecutor {

public static void main(String[] args) {

double price = RunningShoes.getPrice();
System.out.println("Price: " + price);

String brand = RunningShoes.getBrand();
System.out.println("Brand: " + brand);

String model = RunningShoes.getModel();
System.out.println("Model: " + model);

String material = RunningShoes.getMaterial();
System.out.println("Upper Material: " + material);

String sole = RunningShoes.getSoleMaterial();
System.out.println("Sole Material: " + sole);

String closure = RunningShoes.getClosureType();
System.out.println("Closure Type: " + closure);

String fit = RunningShoes.getFitType();
System.out.println("Fit Type: " + fit);

String color = RunningShoes.getColor();
System.out.println("Color: " + color);

double weight = RunningShoes.getWeight();
System.out.println("Weight per shoe: " + weight + " grams");

boolean water = RunningShoes.isWaterResistant();
System.out.println("Water Resistant: " + water);

String occasion = RunningShoes.getOccasion();
System.out.println("Occasion: " + occasion);

String cushion = RunningShoes.getCushionType();
System.out.println("Cushion Type: " + cushion);

String warranty = RunningShoes.getWarranty();
System.out.println("Warranty: " + warranty);

String country = RunningShoes.getCountryOfOrigin();
System.out.println("Country of Origin: " + country);

String features = RunningShoes.getSpecialFeatures();
System.out.println("Special Features: " + features);

}
}
