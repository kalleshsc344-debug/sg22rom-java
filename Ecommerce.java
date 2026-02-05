class Ecommerce {
    public static void main(String[] shopping) {
String name = "Flipkart";
String founder = "Sachin Bansal";
String type = "Online Shopping Platform";
String headquarters = "Bengaluru";
String categories[] = {"Mobiles", "Fashion", "Electronics", "Home Appliances"};
String paymentMethods[] = {"UPI", "Credit Card", "Debit Card", "Cash on Delivery"};
System.out.println("The information about Ecommerce Platform:");
System.out.println("The name of the platform is: " + name);
System.out.println("The founder is: " + founder);
System.out.println("The type is: " + type);
System.out.println("The headquarters is: " + headquarters);
int sizeOfCategories = categories.length;
int sizeOfPayments = paymentMethods.length;
System.out.println("There are " + sizeOfCategories + " categories:");
for (String category : categories) System.out.println(category);
System.out.println("There are " + sizeOfPayments + " payment methods:");
for (String payment : paymentMethods) System.out.println(payment);
}
}
