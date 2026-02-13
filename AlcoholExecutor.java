class AlcoholExecutor {

public static void main(String[] args) {

String brand = Alcohol.getBrand();
System.out.println("Brand: " + brand);

String type = Alcohol.getType();
System.out.println("Type: " + type);

double alcoholPercent = Alcohol.getAlcoholPercentage();
System.out.println("Alcohol Percentage: " + alcoholPercent);

int volume = Alcohol.getVolume();
System.out.println("Volume: " + volume + " ml");

double price = Alcohol.getPrice();
System.out.println("Price: " + price);

String origin = Alcohol.getOriginCountry();
System.out.println("Origin Country: " + origin);

boolean premium = Alcohol.isPremium();
System.out.println("Premium: " + premium);

String bottle = Alcohol.getBottleMaterial();
System.out.println("Bottle Material: " + bottle);

boolean sealed = Alcohol.hasSealedCap();
System.out.println("Sealed Cap: " + sealed);

String company = Alcohol.getManufacturingCompany();
System.out.println("Manufacturing Company: " + company);

}
}
