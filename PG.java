class PG{
public static void main(String[] stay){
String name="Sri Sai PG";
String owner="Raghavendra";
String type="Mens PG";
String address="BTM 2nd Stage, Bengaluru";
String facilities[]={"WiFi","Food","Washing Machine","Power Backup"};
String roomTypes[]={"Single Sharing","Double Sharing","Triple Sharing"};
System.out.println("The information about PG:");
System.out.println("The name of the PG is:"+name);
System.out.println("The owner is:"+owner);
System.out.println("The type is:"+type);
System.out.println("The address is:"+address);
int sizeOfFacilities=facilities.length;
int sizeOfRooms=roomTypes.length;
System.out.println("There are "+sizeOfFacilities+" facilities:");
for(String facility:facilities) System.out.println(facility);
System.out.println("There are "+sizeOfRooms+" room types:");
for(String room:roomTypes) System.out.println(room);
}
}
