package com.Development_Class;

import java.io.IOException;

public class FileReader_Mamager {

	private FileReader_Mamager() {
		
	}
	
	public static FileReader_Mamager getInstanceFR() {
		
		FileReader_Mamager fr = new FileReader_Mamager();
		return fr;
	}
	
	public static Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
}
