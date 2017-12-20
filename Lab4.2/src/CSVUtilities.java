import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
		 reader = new FileReader(csv);

		 filein = new BufferedReader(reader);
		 
		
		}
		catch (FileNotFoundException fnfe)
		{
		System.out.println("ERROR: File not found!");
		}
	}
}
