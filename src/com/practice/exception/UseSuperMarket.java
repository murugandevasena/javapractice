package com.practice.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UseSuperMarket {
;	public static void main(String[] args) throws BrandNotFoundException, IOException {
		
		SuperMarget s1 = new SuperMarget("", 1, "Parley");
		SuperMarget s2 = new SuperMarget("Hindhuthan", 2, "Biscuits");
		SuperMarget s3 = new SuperMarget("UTC", 3, "Paste");
		
//		List<SuperMarget> ls = new ArrayList<>();
//		ls.add(s1);
////		ls.add(s2);
////		ls.add(s3);
//		try {
//			if(s1.getBrand()!="") {
//				System.out.println(s1.getBrand());
//			}
//			else {
//				throw new BrandNotFoundException("Brand not found");
//			}
//		}
//		catch (BrandNotFoundException e)  {
//			System.out.println("brand not found.");
//		}
//		
		
		//FileNotFoundException
		File f = new File("C:\\Users\\murugan\\desktop\\test.txt");
		
		try {
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferReader = new BufferedReader(fileReader); 
			String fileData =null;
			while ((fileData = bufferReader.readLine()) != null) {
				System.out.println("file is found");
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
