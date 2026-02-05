class Institution{
public static void main(String[] education){
String name="Xworkz Institute";
String founder="Omkar Sir";
String coursesType="Software Training";
String location="Rajajinagar, Bengaluru";
String courses[]={"Java","Python","Web Development","Testing"};
String trainers[]={"Omkar","Suresh","Ramesh","Anitha"};
System.out.println("The information about Institution:");
System.out.println("The name of the institution is:"+name);
System.out.println("The founder is:"+founder);
System.out.println("The courses type is:"+coursesType);
System.out.println("The location is:"+location);
int sizeOfCourses=courses.length;
int sizeOfTrainers=trainers.length;
System.out.println("There are "+sizeOfCourses+" courses:");
for(String course:courses) System.out.println(course);
System.out.println("There are "+sizeOfTrainers+" trainers:");
for(String trainer:trainers) System.out.println(trainer);
}
}
