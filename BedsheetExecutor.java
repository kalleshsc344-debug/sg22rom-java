class BedsheetExecutor {

public static void main(String[] args) {

String brand = Bedsheet.getBrand();
System.out.println("Brand: " + brand);

String material = Bedsheet.getMaterial();
System.out.println("Material: " + material);

String size = Bedsheet.getSize();
System.out.println("Size: " + size);

int threadCount = Bedsheet.getThreadCount();
System.out.println("Thread Count: " + threadCount);

double price = Bedsheet.getPrice();
System.out.println("Price: " + price);

boolean washable = Bedsheet.isWashable();
System.out.println("Washable: " + washable);

String color = Bedsheet.getColor();
System.out.println("Color: " + color);

boolean pillow = Bedsheet.hasPillowCovers();
System.out.println("Pillow Covers Included: " + pillow);

int pieces = Bedsheet.getNumberOfPieces();
System.out.println("Number Of Pieces: " + pieces);

String pattern = Bedsheet.getPattern();
System.out.println("Pattern: " + pattern);

}
}
