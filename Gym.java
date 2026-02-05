class Gym{
public static void main(String[] fitness){
String name="Cult Fit";
String owner="Mukesh Bansal";
String type="Fitness Center";
String location="Jayanagar, Bengaluru";
String equipments[]={"Treadmill","Dumbbells","Bench Press","Cycling"};
String trainers[]={"Arjun","Rohit","Sanjana","Neha"};
System.out.println("The information about Gym:");
System.out.println("The name of the gym is:"+name);
System.out.println("The owner is:"+owner);
System.out.println("The type is:"+type);
System.out.println("The location is:"+location);
int sizeOfEquipments=equipments.length;
int sizeOfTrainers=trainers.length;
System.out.println("There are "+sizeOfEquipments+" equipments:");
for(String equipment:equipments) System.out.println(equipment);
System.out.println("There are "+sizeOfTrainers+" trainers:");
for(String trainer:trainers) System.out.println(trainer);
}
}
