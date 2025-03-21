class Language
{
static String languages[]={"Kannada","English","Hindi","Sanskrit","Tamil","Telgu","Malayalam",
"Konkani","Java","Spanish","Bengali","Marati","Turkish","Japnese","Gujarathi","Urdu",
"Punjabi","Sunda","Farsi","Dutch","Yoruba","Sindhi","Arabic","Nepali","Lombard",
"Zulu","Somali","Zhuang","Assamese","Hungarian","Igbo","Shona","Kurmaji",
"Akan","Marwari","Portuguese","Russian","Korean","Thai","Malay"};
public static void main(String args[])
{
System.out.println("start of main");
System.out.println("\tLANGUAGES");
System.out.println(languages.length);
printLanguages();
System.out.println("end of main");
}
public static void printLanguages()
{
System.out.println("start of printLanguages");
for(String language:languages)
{
	System.out.println(language);
}
System.out.println("end of printLanguages");
//System.out.println("1."+languages[0]+"\n"+"2."+languages[1]+"\n"+"3."+languages[2]+"\n"+"4."+languages[3]+"\n"+"5."+languages[4]+"\n"+"6."+languages[5]+"\n"+"7."+languages[6]+"\n"+"8."+languages[7]+"\n"+"9."+languages[8]+"\n"+"10."+languages[9]+"\n"+"11."+languages[10]+"\n"+"12."+languages[11]+"\n"+"13."+languages[12]+"\n"+"14."+languages[13]+"\n"+"15."+languages[14]+"\n"+"16."+languages[15]+"\n"+"17."+languages[16]+"\n"+"18."+languages[17]+"\n"+"19."+languages[18]+"\n"+"20."+languages[19]+"\n"+"21."+languages[20]+"\n"+"22."+languages[21]+"\n"+"23."+languages[22]+"\n"+"24."+languages[23]+"\n"+"25."+languages[24]+"\n"+"26."+languages[25]+"\n"+"27."+languages[26]+"\n"+"28."+languages[27]+"\n"+"29."+languages[28]+"\n"+"30."+languages[29]+"\n"+"31."+languages[30]+"\n"+"32."+languages[31]+"\n"+"33."+languages[32]+"\n"+"34."+languages[33]+"\n"+"35."+languages[34]+"\n"+"36."+languages[35]+"\n"+"37."+languages[36]+"\n"+"38."+languages[37]+"\n"+"39."+languages[38]+"\n"+"40."+languages[39]);
}
}