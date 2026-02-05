class Vegetables{
public static void main(String[] veg){
String vegetableNames[]={"Carrot","Tomato","Ginger","Garlic","Potato","Brinjal"};
int size=vegetableNames.length;
System.out.println("The number of vegetables are:"+size);
System.out.println("They are:");
for(String vegetable:vegetableNames)System.out.println(vegetable);
}
}