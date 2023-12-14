package com.bridgelabz.main;

import com.bridgelabz.csvreader.ReadCSV;
import com.opencsv.exceptions.CsvException;

public class Main {

	public static void main(String[] args) throws CsvException {
		String filePath = "C:\\Users\\KIIT\\Downloads\\Anime_csv\\book1.csv";

		ReadCSV read = new ReadCSV();
		read.readCSV(filePath);

	}
}
