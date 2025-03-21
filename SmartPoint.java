class SmartPoint
{
static String groceries[]={"Chickpea","Beans","Sugar","Salt","Spices","Atta","Corn Flour","Ghee","Oil","Coffee Powder"};

static String perfumes[]={"Azzaro","BVLgari","Daviddoff","Dunhill","Giorgio Armani","Hermes","Issey Miyake","Paco Rabanne","Chanel No 5","Calvin Klein"};

static String biscuits[]={"Britannia","Sunfeast","Parle","Oreo","Unibic","Haldiram","Bourbon","Bisk Farm","McVitie's","Priyagold"};

static String utensils[]={"Knife","Cutting Board","Measuring spoon","Peeler","Colander","Mixing Bowl","Whisk","Mortar and pestal","Frying Pan","Fork"};

static String vegetables[]={"Radish","Carrot","Brinjal","Potato","Tomato","Onion","Pumkin","Bitter guard","Capsicum","Cabbage"};

public static void main(String args[])
{
System.out.println("start of main");
System.out.println("\tGroceries");
availableGroceries();
System.out.println("\tPerfumes");
listOfPerfumes();
System.out.println("\tBiscuits");
availableBiscuits();
System.out.println("\tUtensils");
stockOfUtensils();
System.out.println("\tVegetables");
availableVegetables();
System.out.println("end of main");
}


public static void availableGroceries()
{
System.out.println("start of available groceries");
for(String grocery:groceries)
{
	System.out.println(grocery); 
}
System.out.println("end of available groceries");
//System.out.println("1."+groceries[0]+"\n"+"2."+groceries[1]+"\n"+"3."+groceries[2]+"\n"+"4."+groceries[3]+"\n"+"5."+groceries[4]+"\n"+"6."+groceries[5]+"\n"+"7."+groceries[6]+"\n"+"8."+groceries[7]+"\n"+"9."+groceries[8]+"\n"+"10."+groceries[9]);
}


public static void listOfPerfumes()
{
System.out.println("start of listOfPerfumes");	
for(String perfume:perfumes)
{
	System.out.println(perfume);
}
//System.out.println("1."+perfumes[0]+"\n"+"2."+perfumes[1]+"\n"+"3."+perfumes[2]+"\n"+"4."+perfumes[3]+"\n"+"5."+perfumes[4]+"\n"+"6."+perfumes[5]+"\n"+"7."+perfumes[6]+"\n"+"8."+perfumes[7]+"\n"+"9."+perfumes[8]+"\n"+"10."+perfumes[9]);
System.out.println("end of listOfPerfumes");
}


public static void availableBiscuits()
{
System.out.println("start of availableBiscuits");
for(String biscuit:biscuits)
{
	System.out.println(biscuit);
}
//System.out.println("1."+biscuits[0]+"\n"+"2."+biscuits[1]+"\n"+"3."+biscuits[2]+"\n"+"4."+biscuits[3]+"\n"+"5."+biscuits[4]+"\n"+"6."+biscuits[5]+"\n"+"7."+biscuits[6]+"\n"+"8."+biscuits[7]+"\n"+"9."+biscuits[8]+"\n"+"10."+biscuits[9]);
System.out.println("end of availableBiscuits");
}


public static void   stockOfUtensils()
{
System.out.println("start of stockOfUtensils");
for(String utensil:utensils)
{
	System.out.println(utensil);
}
//System.out.println("1."+utensils[0]+"\n"+"2."+utensils[1]+"\n"+"3."+utensils[2]+"\n"+"4."+utensils[3]+"\n"+"5."+utensils[4]+"\n"+"6."+utensils[5]+"\n"+"7."+utensils[6]+"\n"+"8."+utensils[7]+"\n"+"9."+utensils[8]+"\n"+"10."+utensils[9]);
System.out.println("end of stockOfUtensils");
}


public static void availableVegetables()
{
System.out.println("start of availableVegetables");
for(String vegetable:vegetables)
{
	System.out.println(vegetable);
}
//System.out.println("1."+vegetables[0]+"\n"+"2."+vegetables[1]+"\n"+"3."+vegetables[2]+"\n"+"4."+vegetables[3]+"\n"+"5."+vegetables[4]+"\n"+"6."+vegetables[5]+"\n"+"7."+vegetables[6]+"\n"+"8."+vegetables[7]+"\n"+"9."+vegetables[8]+"\n"+"10."+vegetables[9]);
System.out.println("end of availableVegetables");
}

}