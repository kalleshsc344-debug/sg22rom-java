class Restaurant{
public static void main(String[] food){
String name="Hanumanthu Pulav";
String owner="Hanumanthappa";
String type="Chicken Pulav";
String address="JP nagar , main road, near Rajkumar Circle";
String branches[]={"JP nagar","Jayanagar","Rajajinagar","BTM layout"};
String managers[]={"Sudeep","Prateek","Puneeth","Tarun","Manju"};
System.out.println("The information about restaurant:");
System.out.println("The name of the restaurant is:"+name);
System.out.println("The owner of the restaurant is:"+owner);
System.out.println("The type of food in the restaurant is:"+type);
System.out.println("The address of the restaurant is:"+address);
int sizeOfBranches=branches.length;
int sizeOfManagers=managers.length;
System.out.println("There are"+sizeOfBranches+"branches , they are listed as follows:");
for(String branch:branches) System.out.println(branch);
System.out.println("There are"+sizeOfManagers+"managers, they are listed as follows:");
for(String manager:managers) System.out.println(manager);
}
}