class CigaretteExecutor {

public static void main(String[] args) {

String brand = Cigarette.getBrand();
System.out.println("Brand: " + brand);

String type = Cigarette.getType();
System.out.println("Type: " + type);

int sticks = Cigarette.getStickCount();
System.out.println("Stick Count: " + sticks);

double price = Cigarette.getPrice();
System.out.println("Price: " + price);

double nicotine = Cigarette.getNicotineLevel();
System.out.println("Nicotine Level: " + nicotine + " mg");

boolean warning = Cigarette.hasWarningLabel();
System.out.println("Warning Label: " + warning);

String company = Cigarette.getManufacturingCompany();
System.out.println("Manufacturing Company: " + company);

String country = Cigarette.getCountry();
System.out.println("Country: " + country);

boolean menthol = Cigarette.isMenthol();
System.out.println("Menthol: " + menthol);

String packing = Cigarette.getPackingType();
System.out.println("Packing Type: " + packing);

}
}
