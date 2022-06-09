package com.testclass;

import java.io.IOException;

import com.Development_Class.FileReader_Mamager;

public class Test_Runner {

	public static void main(String[] args) throws IOException {
	
		System.out.println(FileReader_Mamager.getInstanceFR().getInstanceCR().CardNo());
	}
	
}
