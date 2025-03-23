class Stove
{
  int id;
  String companyName;
  double rate;
  int noOfBurners;
  
  Stove()
  {
    System.out.println("New stove came into the market");
  }
  
  Stove(int id , String companyName , double rate , int noOfBurners )
  {
    System.out.println("New stove came into the market");
	this.id=id;
	this.companyName=companyName;
	this.rate=rate;
	this.noOfBurners=noOfBurners;
  }




}