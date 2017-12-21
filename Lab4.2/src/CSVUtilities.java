import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**Created by Kaitlyn Cao on 12/19/2017
 * Lab 4.2 CSV Utilities*/

public class CSVUtilities {
	
	ArrayList<String> CSVData;
	int numColumns;
	
	public CSVUtilities(File csv)
	{
		FileReader reader = null;
		BufferedReader filein = null;
		
		try
		{
		 reader = new FileReader("Preventive_New_Cases_CY2016_Table.csv");
		 filein = new BufferedReader(reader);
		 
		 String line = filein.readLine();
		 while(line != null)
		 {
			 String[] cases = line.split(",");
			 
			 //System.out.println("Case [Location= ")
		 }
		
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("ERROR: File not found!");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public List<String> getColumnHeaders()
	{
		return CSVData;
	}
	
	//Return
	public List<String> getDataString(int column)
	{
		return CSVData;
		
	}
	
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getDataInt(int column)
	{
		return null;
		
	}
	
	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDouble(int column)
	{
		return null;
	}
}
