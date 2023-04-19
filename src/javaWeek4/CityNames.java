package javaWeek4;

public class CityNames {
int i;
int flag=0;
String[] cityNames= {"Toronto","Ottawa","Brampton","Hamilton","London","Mississauga","Burlington","Kingston","Kitchener"};
void searchCityName(String nameOfCity)
{
	for(i=0;i<cityNames.length;i++)
		if(cityNames[i].equals(nameOfCity))
		{
			System.out.println("City name found");
			flag=1;
		}
		if(flag==0)
		System.out.println("City not found in the list");	
}
void endingWithTon(String charToCheck)
{
	System.out.println("Cities ending with 'ton' are: ");
	for(i=0;i<cityNames.length;i++)
		if(cityNames[i].contains(charToCheck))
		System.out.println(cityNames[i]);	
}
void replaceWithFun(String charToCheck)
{
	System.out.println("City names after replacing 'ton' with 'fun' are: ");
	for(i=0;i<cityNames.length;i++)
		if(cityNames[i].contains(charToCheck))
		System.out.println(cityNames[i].replace("ton","fun"));	
}
void extraction(String str)
{
	String streetAddress = str.substring(0,16);
	String city = str.substring(17,24);
	String zip = str.substring(25);
	System.out.println("String streetAddress= "+streetAddress);
	System.out.println("String city= "+city);
	System.out.println("String zip= "+zip);
	
}
}
