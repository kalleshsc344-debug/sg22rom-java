class ChimneyExecutor{
public static void main(String[] appliance){
double price=Chimney.getPrice();
System.out.println("The price of chimney is :"+price);
String brand=Chimney.getBrand();
System.out.println("The brand name of chimney is:"+brand);
int airFlow = Chimney.getAirFlowCapacity();
System.out.println("The air flow capacity is :" + airFlow + " CMPH");
int noise = Chimney.getNoiseLevel();
System.out.println("The noise level is :" + noise + " dB");
String mounting = Chimney.getMountingType();
System.out.println("The mounting type is :" + mounting);
String controls = Chimney.getControlsType();
System.out.println("The controls type is :" + controls);
int voltage = Chimney.getVoltage();
System.out.println("The voltage is :" + voltage + " V");
int speeds = Chimney.getNumberOfSpeeds();
System.out.println("The number of speeds is :" + speeds);
double weight = Chimney.getItemWeight();
System.out.println("The item weight is :" + weight + " grams");
String light = Chimney.getLightSourceType();
System.out.println("The light source type is :" + light);
String filter = Chimney.getFilterType();
System.out.println("The filter type is :" + filter);
String form = Chimney.getItemForm();
System.out.println("The item form is :" + form);
String ventilation = Chimney.getVentilationType();
System.out.println("The ventilation type is :" + ventilation);
String hood = Chimney.getVentHoodDesign();
System.out.println("The vent hood design is :" + hood);
double energy = Chimney.getAnnualEnergyConsumption();
System.out.println("The annual energy consumption is :" + energy + " kWh");
String features = Chimney.getSpecialFeatures();
System.out.println("The special features are :" + features);
String country = Chimney.getCountryOfOrigin();
System.out.println("The country of origin is :" + country);
String model = Chimney.getModelNumber();
System.out.println("The model number is :" + model);
String manufacturer = Chimney.getManufacturer();
System.out.println("The manufacturer is :" + manufacturer);
String components = Chimney.getIncludedComponents();
System.out.println("The included components are :" + components);
int vents = Chimney.getNumberOfVents();
System.out.println("The number of vents is :" + vents);
boolean battery = Chimney.isBatteriesRequired();
System.out.println("Are batteries required? :" + battery);
String part = Chimney.getPartNumber();
System.out.println("The part number is :" + part);
}
}

