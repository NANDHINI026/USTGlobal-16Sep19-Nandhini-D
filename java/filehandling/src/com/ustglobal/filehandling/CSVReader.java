package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
public static void main(String[] args) {
	try(FileReader in = new FileReader("csv.txt");//we have to close the object so try with resource.FileReader extends the reader class
	BufferedReader reader = new BufferedReader(in);) {
		while(reader.ready()) {//reader.ready() methods checks whether next line is present or not
		String line =reader.readLine();//reads line by line return type is string
		String[] words = line.split(",");//split method return type is string array
		System.out.println("ID: "+words[0]);
		System.out.println("Name: "+words[1]);//instead of println statements inthis place we can wrote jdbc code to insert data.
		System.out.println("Salary: "+words[2]);
		System.out.println("Gender: "+words[3]);
		}
	}catch(Exception e) {
		
	}
}
}
