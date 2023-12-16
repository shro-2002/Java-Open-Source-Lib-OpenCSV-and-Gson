package com.bridgelabz.main;

import java.io.IOException;

import com.bridgelabz.csvreader.ReadCSV;
import com.bridgelabz.gsonfile.WriteJson;
import com.opencsv.exceptions.CsvException;

public class Main {

	public static void main(String[] args) throws CsvException, IOException {
		String filePath = "C:\\Users\\KIIT\\Downloads\\Anime_csv\\book1.csv";

		ReadCSV read = new ReadCSV();
		WriteJson write = new WriteJson();
//		UC:1
		read.readCSV(filePath);

// 		UC:2
		read.readAtOnce(filePath);

		String jsonFilePath = "output.json";
		write.convertCsvToJson(filePath, jsonFilePath);
	}
}
