class ProteinPowderExecutor {

public static void main(String[] args) {

double price = ProteinPowder.getPrice();
System.out.println("Price: " + price);

String brand = ProteinPowder.getBrand();
System.out.println("Brand: " + brand);

String flavor = ProteinPowder.getFlavor();
System.out.println("Flavor: " + flavor);

int weight = ProteinPowder.getWeightInGrams();
System.out.println("Weight: " + weight + " grams");

int protein = ProteinPowder.getProteinPerServing();
System.out.println("Protein Per Serving: " + protein + " grams");

String form = ProteinPowder.getForm();
System.out.println("Form: " + form);

int servings = ProteinPowder.getServingsPerContainer();
System.out.println("Servings Per Container: " + servings);

boolean veg = ProteinPowder.isVegetarian();
System.out.println("Vegetarian: " + veg);

String usage = ProteinPowder.getUsageTime();
System.out.println("Usage Time: " + usage);

String country = ProteinPowder.getCountryOfOrigin();
System.out.println("Country: " + country);

String shelf = ProteinPowder.getShelfLife();
System.out.println("Shelf Life: " + shelf);

String diet = ProteinPowder.getDietType();
System.out.println("Diet Type: " + diet);

String pack = ProteinPowder.getPackageType();
System.out.println("Package Type: " + pack);

String features = ProteinPowder.getSpecialFeatures();
System.out.println("Special Features: " + features);

boolean gluten = ProteinPowder.isGlutenFree();
System.out.println("Gluten Free: " + gluten);

}
}
