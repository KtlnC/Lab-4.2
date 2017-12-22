/**Created by Kaitlyn Cao on 12/20/2017
 * Lab 4.2 ACS*/
public class ACS {

	private String location;
	private int casesOpened;
	private int percentOfBoroughTotal;
	private int percentOfCitywideTotal;
	
	public ACS(String location, int casesOpened, int percentOfBoroughTotal, int percentOfCitywideTotal)
	{
		this.location = location;
		this.casesOpened = casesOpened;
		this.percentOfBoroughTotal = percentOfBoroughTotal;
		this.percentOfCitywideTotal = percentOfCitywideTotal;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public int getCasesOpened()
	{
		return casesOpened;
	}
	
	public void setCasesOpened(int casesOpened)
	{
		this.casesOpened = casesOpened;
	}
	
	public int getPercentOfBoroughTotal()
	{
		return percentOfBoroughTotal;
	}
	
	public void setPercentOfBoroughTotal(int percentOfBoroughTotal)
	{
		this.percentOfBoroughTotal = percentOfBoroughTotal;
	}
	
	public int getPercentOfCitywideTotal()
	{
		return percentOfCitywideTotal;
	}
	
	public void setPercentOfCitywideTotal(int percentOfCitywideTotal)
	{
		this.percentOfCitywideTotal = percentOfCitywideTotal;
	}
	
/*	public String toString()
	{
		return "Cases [Location=" + location + ", # of Cases Opened=" + casesOpened + ", Percent of Borough Total=" + percentOfBoroughTotal + ", Percent of Citywide Total=" + percentOfCitywideTotal + "]";
	}
*/
}
