package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	
	
	@DataProvider
	public Object[][] validCredentialExcel( ) throws IOException
	{
		
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdatafiles/ikeaLogin.xlsx","login" );
		return main;
	}
   
	@DataProvider
	public Object[][] validPasswordExcel() throws IOException
	{
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdatafiles/IkeaLogin.xlsx","password");
		return main;
	}
	
}
