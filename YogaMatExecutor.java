class YogaMatExecutor {

public static void main(String[] args) {

double price = YogaMat.getPrice();
System.out.println("Price: " + price);

String brand = YogaMat.getBrand();
System.out.println("Brand: " + brand);

double thickness = YogaMat.getThickness();
System.out.println("Thickness: " + thickness + " mm");

String material = YogaMat.getMaterial();
System.out.println("Material: " + material);

String color = YogaMat.getColor();
System.out.println("Color: " + color);

boolean antiSlip = YogaMat.isAntiSlip();
System.out.println("Anti Slip: " + antiSlip);

double length = YogaMat.getLength();
System.out.println("Length: " + length + " cm");

double width = YogaMat.getWidth();
System.out.println("Width: " + width + " cm");

String usage = YogaMat.getUsageType();
System.out.println("Usage Type: " + usage);

String warranty = YogaMat.getWarranty();
System.out.println("Warranty: " + warranty);

}
}
