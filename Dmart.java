class Dmart {
    public static void main(String[] shopping) {

String riceProducts[] = {"Basmati Rice","Sona Masuri","Brown Rice","Ponni Rice","Kolam Rice",
    "Idli Rice","Jeera Rice","Steam Rice","Raw Rice","Broken Rice",
    "Organic Rice","Red Rice","White Rice","Long Grain Rice","Short Grain Rice",
    "Premium Rice","Local Rice","Imported Rice","Healthy Rice","Daily Rice",
    "Classic Rice","Gold Rice","Silver Rice","Value Rice","Special Rice"
};

String dalProducts[] = {"Toor Dal","Moong Dal","Masoor Dal","Urad Dal","Chana Dal",
    "Green Gram","Black Gram","Split Moong","Split Urad","Yellow Dal",
    "Organic Dal","Premium Dal","Local Dal","Washed Dal","Unwashed Dal",
    "Protein Dal","Healthy Dal","Special Dal","Daily Dal","Quality Dal",
    "Soft Dal","Strong Dal","Fresh Dal","Pure Dal","Best Dal"
};

String oilProducts[] = {"Sunflower Oil","Groundnut Oil","Coconut Oil","Palm Oil","Mustard Oil",
    "Olive Oil","Rice Bran Oil","Soybean Oil","Sesame Oil","Cottonseed Oil",
    "Organic Oil","Cold Pressed Oil","Refined Oil","Cooking Oil","Healthy Oil",
    "Light Oil","Heavy Oil","Premium Oil","Local Oil","Imported Oil",
    "Pure Oil","Natural Oil","Fresh Oil","Best Oil","Value Oil"
        };

String snacks[] = {"Biscuits","Chips","Namkeen","Cookies","Wafers",
    "Murukku","Mixture","Peanuts","Popcorn","Nachos",
    "Salted Snacks","Sweet Snacks","Spicy Snacks","Crunchy Snacks","Healthy Snacks",
    "Kids Snacks","Party Snacks","Tea Snacks","Evening Snacks","Light Snacks",
    "Baked Snacks","Fried Snacks","Classic Snacks","Premium Snacks","Daily Snacks"
        };

String beverages[] = {"Tea","Coffee","Green Tea","Black Tea","Milk",
    "Badam Milk","Fruit Juice","Energy Drink","Soft Drink","Lassi",
    "Buttermilk","Cold Coffee","Hot Chocolate","Herbal Tea","Iced Tea",
    "Flavored Milk","Protein Drink","Health Drink","Kids Drink","Diet Drink",
    "Fresh Drink","Instant Drink","Powder Drink","Packaged Drink","Natural Drink"
};

String fruits[] = {"Apple","Banana","Orange","Grapes","Mango",
    "Pineapple","Papaya","Watermelon","Muskmelon","Guava",
    "Pomegranate","Strawberry","Blueberry","Kiwi","Peach",
    "Plum","Pear","Chikoo","Custard Apple","Lemon",
    "Sweet Lime","Dragon Fruit","Avocado","Fig","Dates"
};

String vegetables[] = {"Potato","Tomato","Onion","Carrot","Beans",
    "Cabbage","Cauliflower","Brinjal","Lady Finger","Radish",
    "Beetroot","Spinach","Coriander","Mint","Pumpkin",
    "Bottle Gourd","Ridge Gourd","Bitter Gourd","Snake Gourd","Drumstick",
    "Green Chilli","Capsicum","Sweet Corn","Broccoli","Mushroom"
};

String dairyProducts[] = {"Milk","Curd","Butter","Ghee","Cheese",
    "Paneer","Cream","Buttermilk","Flavored Milk","Skim Milk",
    "Full Cream Milk","Low Fat Milk","Greek Yogurt","Cheddar","Mozzarella",
    "Ice Cream","Milk Powder","Condensed Milk","Fresh Cream","Sour Cream",
    "Lassi","Milk Shake","Kulfi","Frozen Yogurt","Whipped Cream"
};

String bakeryItems[] = {"Bread","Brown Bread","White Bread","Buns","Pav",
    "Toast","Rusk","Cake","Pastry","Muffins",
    "Cup Cake","Donuts","Croissants","Puff","Rolls",
    "Garlic Bread","Sandwich Bread","Burger Bun","Pizza Base","Fruit Cake",
    "Chocolate Cake","Butter Cake","Plum Cake","Sponge Cake","Tea Cake"
};

String frozenFoods[] = {"Frozen Peas","Frozen Corn","Frozen Carrot","Frozen Beans","Frozen Mixed Veg",
    "Frozen Paratha","Frozen Chapati","Frozen Fries","Frozen Nuggets","Frozen Samosa",
    "Frozen Spring Roll","Frozen Momos","Frozen Pizza","Frozen Paneer","Frozen Corn Cob",
    "Frozen Strawberry","Frozen Blueberry","Frozen Chicken","Frozen Fish","Frozen Prawns",
    "Frozen Ice Cream","Frozen Dessert","Frozen Snacks","Frozen Meals","Frozen Fruits"
};

String cleaningProducts[] = {"Detergent Powder","Detergent Liquid","Dish Wash Bar","Dish Wash Liquid","Floor Cleaner",
    "Toilet Cleaner","Glass Cleaner","Phenyl","Bleach","Fabric Softener",
    "Stain Remover","Hand Wash","Surface Cleaner","Bathroom Cleaner","Kitchen Cleaner",
    "Mop","Cleaning Cloth","Scrubber","Cleaning Brush","Dusting Cloth",
    "Disinfectant Spray","Room Freshener","Garbage Bags","Cleaning Gloves","Air Freshener"
};

String personalCare[] = {"Soap","Shampoo","Conditioner","Hair Oil","Face Wash",
    "Body Lotion","Toothpaste","Toothbrush","Mouthwash","Face Cream",
    "Sunscreen","Deodorant","Perfume","Shaving Cream","Razor",
    "Hair Gel","Hair Serum","Face Scrub","Face Pack","Hand Cream",
    "Lip Balm","Baby Soap","Baby Shampoo","Sanitary Pads","Tissues"
};

String babyProducts[] = {"Baby Diapers","Baby Wipes","Baby Powder","Baby Soap","Baby Shampoo",
    "Baby Oil","Baby Lotion","Baby Cream","Baby Feeding Bottle","Baby Pacifier",
    "Baby Food","Baby Cereal","Baby Milk Powder","Baby Blanket","Baby Towel",
    "Baby Clothes","Baby Toys","Baby Carrier","Baby Walker","Baby Bed",
    "Baby Pillow","Baby Soap Bar","Baby Bath Tub","Baby Nail Cutter","Baby Comb"
};

String stationery[] = {"Notebook","Pen","Pencil","Eraser","Sharpener",
    "Scale","Marker","Highlighter","Glue","Stapler",
    "Paper Clips","File","Folder","Sticky Notes","Sketch Pen",
    "Color Pencils","Crayons","Drawing Book","White Board Marker","Calculator",
    "Exam Pad","Diary","Envelope","Chart Paper","Sticky Tape"
};

String kitchenUtensils[] = {"Plate","Bowl","Glass","Cup","Spoon",
    "Fork","Knife","Pan","Tawa","Pressure Cooker",
    "Kadai","Ladle","Chopping Board","Peeler","Grater",
    "Mixer Jar","Storage Container","Lunch Box","Water Bottle","Tea Strainer",
    "Oil Dispenser","Spatula","Measuring Cup","Rolling Pin","Gas Lighter"
};

String homeEssentials[] = {"Bedsheet","Pillow","Pillow Cover","Curtain","Doormat",
    "Towel","Bath Towel","Hand Towel","Blanket","Mattress",
    "Sofa Cover","Table Cloth","Laundry Basket","Cloth Hanger","Iron Stand",
    "Mosquito Net","Dustbin","Bucket","Mug","Water Can",
    "Flower Vase","Wall Clock","Mirror","Room Divider","Shoe Rack"
};

String spices[] = {"Salt","Sugar","Turmeric","Chilli Powder","Coriander Powder",
    "Cumin","Mustard Seeds","Fenugreek","Cloves","Cardamom",
    "Cinnamon","Bay Leaf","Black Pepper","White Pepper","Star Anise",
    "Nutmeg","Mace","Dry Ginger","Asafoetida","Fennel Seeds",
    "Poppy Seeds","Saffron","Kasuri Methi","Garam Masala","Chat Masala"
};

String sweets[] = {"Ladoo","Jalebi","Mysore Pak","Kaju Katli","Rasgulla",
    "Gulab Jamun","Halwa","Peda","Barfi","Soan Papdi",
    "Rasmalai","Milk Cake","Cham Cham","Sandesh","Malpua",
    "Imarti","Basundi","Payasam","Kheer","Shrikhand",
    "Modak","Boondi","Kalakand","Khoya","Badusha"
};

String poojaItems[] = {"Incense Sticks","Camphor","Agarbatti","Pooja Oil","Cotton Wicks",
    "Flowers","Garland","Kumkum","Turmeric","Chandan",
    "Panchamrit","Bell","Pooja Plate","Pooja Diya","Match Box",
    "Cow Ghee","Havan Samagri","Sambrani","Photo Frame","Kalash",
    "Coconut","Betel Leaves","Betel Nuts","Pooja Book","Holy Thread"
};

String electronics[] = {"LED Bulb","Tube Light","Extension Box","Switch","Socket",
    "Fan","Mixer Grinder","Electric Kettle","Induction Stove","Rice Cooker",
    "Iron Box","Water Heater","Torch","Emergency Light","Power Bank",
    "Charger","USB Cable","Headphones","Bluetooth Speaker","Remote",
    "Battery","Adapter","Inverter","Stabilizer","Smart Plug"
};
System.out.println("Rice Products");
for (String rice : riceProducts) System.out.println(rice);
System.out.println("Dal Products");
for (String dal : dalProducts) System.out.println(dal);
System.out.println("Fruits");
for (String fruit : fruits) System.out.println(fruit);
System.out.println("Vegetables");
for (String vegetable : vegetables) System.out.println(vegetable);
System.out.println("Dairy Products");
for (String dairy : dairyProducts) System.out.println(dairy);
System.out.println("Bakery Items");
for (String bakery : bakeryItems) System.out.println(bakery);
System.out.println("Frozen Foods");
for (String frozen : frozenFoods) System.out.println(frozen);
System.out.println("Cleaning Products");
for (String clean : cleaningProducts) System.out.println(clean);
System.out.println("Personal Care Products");
for (String care : personalCare) System.out.println(care);
System.out.println("Baby Products");
for (String baby : babyProducts) System.out.println(baby);
System.out.println("Stationery");
for (String item : stationery) System.out.println(item);
System.out.println("Kitchen Utensils");
for (String utensil : kitchenUtensils) System.out.println(utensil);
System.out.println("Home Essentials");
for (String home : homeEssentials) System.out.println(home);
System.out.println("Spices");
for (String spice : spices) System.out.println(spice);
System.out.println("Sweets");
for (String sweet : sweets) System.out.println(sweet);
System.out.println("Pooja Items");
for (String pooja : poojaItems) System.out.println(pooja);
System.out.println("Electronics");
for (String electronic : electronics)System.out.println(electronic);
    }
}
