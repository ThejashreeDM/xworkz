class JioHotStar
{
static String hindiSeries[]={"Sacred Games","Mirzapur","Scam 1992 The Harshad Mehta Story","The Family Man","Kota Factory","Panchayat","Asur","Welcome to your Dark SIde","Farzi","Aarya","Rocket Boys"};	

static String kannadaSeries[]={"Bhram","Hawala","Nisha","Post Man","Fitrat","Nashe","Police Diary 2.0","Love Bites","God","Nerd"};	

static String malayalamMovies[]={"Masterpiecs","Pani","18+","Premalu","Mura","Little Hearts","Identity","Banglore Days","Kurukkan","Mumbai Police"};	

static String englishSeries[]={"Black Mirror","The Witcher","House of Cards","Peaky Blinders","Breaking Bad","Stranger Things","Money Heist","The Crown","Monster","House"};	
	
public static void main(String args[])
{
System.out.println("start of main");
System.out.println("\tHINDI SERIES");
listOfHindiSeries();
System.out.println("\tKANNADA SERIES");
listOfKannadaSeries();
System.out.println("\tMALAYALAM MOVIES");
listOfMalayalamMovies();
System.out.println("\tENGLISH SERIES");
listOfEnglishSeries();
System.out.println("end of main");
}


public static void listOfHindiSeries()
{
System.out.println("start of listOfHindiSeries");
for(String hindi:hindiSeries)
{
	System.out.println(hindi);
	
}
//System.out.println("1."+hindiSeries[0]+"\n"+"2."+hindiSeries[1]+"\n"+"3."+hindiSeries[2]+"\n"+"4."+hindiSeries[3]+"\n"+"5."+hindiSeries[4]+"\n"+"6."+hindiSeries[5]+"\n"+"7."+hindiSeries[6]+"\n"+"8."+hindiSeries[7]+"\n"+"9."+hindiSeries[8]+"\n"+"10."+hindiSeries[9]);
System.out.println("end of listOfHindiSeries");
}


public static void listOfKannadaSeries()
{
System.out.println("start of listOfKannadaSeries");
for(String kannada:kannadaSeries)
{
	System.out.println(kannada);
}
//System.out.println("1."+kannadaSeries[0]+"\n"+"2."+kannadaSeries[1]+"\n"+"3."+kannadaSeries[2]+"\n"+"4."+kannadaSeries[3]+"\n"+"5."+kannadaSeries[4]+"\n"+"6."+kannadaSeries[5]+"\n"+"7."+kannadaSeries[6]+"\n"+"8."+kannadaSeries[7]+"\n"+"9."+kannadaSeries[8]+"\n"+"10."+kannadaSeries[9]);
System.out.println("end of listOfKannadaSeries");
}


public static void listOfMalayalamMovies()
{
System.out.println("start of listOfMalayalamMovies");	
for(String malayalam:malayalamMovies)
{
 System.out.println(malayalam);	
}
//System.out.println("1."+malayalamMovies[0]+"\n"+"2."+malayalamMovies[1]+"\n"+"3."+malayalamMovies[2]+"\n"+"4."+malayalamMovies[3]+"\n"+"5."+malayalamMovies[4]+"\n"+"6."+malayalamMovies[5]+"\n"+"7."+malayalamMovies[6]+"\n"+"8."+malayalamMovies[7]+"\n"+"9."+malayalamMovies[8]+"\n"+"10."+malayalamMovies[9]);
System.out.println("end of listOfMalayalamMovies");
}


public static void listOfEnglishSeries()
{
System.out.println("start of listOfEnglishSeries");
for(String english:englishSeries)
{
	System.out.println(english);
}
//System.out.println("1."+englishSeries[0]+"\n"+"2."+englishSeries[1]+"\n"+"3."+englishSeries[2]+"\n"+"4."+englishSeries[3]+"\n"+"5."+englishSeries[4]+"\n"+"6."+englishSeries[5]+"\n"+"7."+englishSeries[6]+"\n"+"8."+englishSeries[7]+"\n"+"9."+englishSeries[8]+"\n"+"10."+englishSeries[9]);
System.out.println("end of listOfEnglishSeries");
}

}




