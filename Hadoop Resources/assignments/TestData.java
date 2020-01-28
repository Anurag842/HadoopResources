package com.data.DataGenerator;

import java.io.*;

import org.fluttercode.datafactory.impl.DataFactory;

public class TestData {

	public static void main(String[] args) {
		 DataFactory df = new DataFactory();
	        for (int i = 0; i < 100; i++)
	        {          
	        	int id = i+1;
	            String line = id + "," + df.getFirstName() + " "+ df.getLastName() + "," + df.getBusinessName() + "," + df.getNumberUpTo(2000)+"\n";
	            File file = new File("E:\\Hadoop\\Hadoop Resources\\assignments\\testout.txt");    
	                FileWriter fw;
					try {
						fw = new FileWriter(file, true);
						fw.write(line);    
		                fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}    
	                
	        }

	}

}
