class PerfumeExecutor {

public static void main(String[] args) {

double price = Perfume.getPrice();
System.out.println("Price: " + price);

String brand = Perfume.getBrand();
System.out.println("Brand: " + brand);

String fragranceType = Perfume.getFragranceType();
System.out.println("Fragrance Type: " + fragranceType);

int volume = Perfume.getVolume();
System.out.println("Volume: " + volume + " ml");

String gender = Perfume.getGender();
System.out.println("Gender: " + gender);

String longevity = Perfume.getLongevity();
System.out.println("Longevity: " + longevity);

String occasion = Perfume.getOccasion();
System.out.println("Occasion: " + occasion);

String packaging = Perfume.getPackagingType();
System.out.println("Packaging Type: " + packaging);

String country = Perfume.getCountryOfOrigin();
System.out.println("Country: " + country);

String warranty = Perfume.getWarranty();
System.out.println("Warranty: " + warranty);

}
}
