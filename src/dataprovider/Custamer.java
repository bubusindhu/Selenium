package dataprovider;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.testng.annotations.DataProvider;

import Utilty.Toinsertdata;


public class Custamer 
	{
	
		@DataProvider(name="CreateCustamer")
			public Object[][] CreateCustCustamer() throws InvalidFormatException,IOException
			{
		return new  Toinsertdata ().Readdata();
			}
	}

		

	


