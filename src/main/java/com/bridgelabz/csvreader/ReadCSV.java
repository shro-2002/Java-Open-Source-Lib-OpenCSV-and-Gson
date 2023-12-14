package com.bridgelabz.csvreader;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvMalformedLineException;
import com.opencsv.exceptions.CsvValidationException;

/*
 * @Description - Reading CSV file using OpenCSV
 * 
 * @Methods: readCSV(String path), readAtOnce(String path) 
 * 
 */
public class ReadCSV {

	/*
	 * @Description - Reading CSV file using OpenCSV
	 * 
	 * @Params - path of the CSV file
	 * 
	 * @Return - void
	 */
	public void readCSV(String path) throws CsvValidationException {
		System.out.println("Reading CSV file");

		try (Reader reader = Files.newBufferedReader(Paths.get(path), StandardCharsets.ISO_8859_1);
				CSVReader csvReader = new CSVReader(reader);) {
			// Reading Records One by One in a String array

			String[] nextRecord;
			try {
				while ((nextRecord = csvReader.readNext()) != null) {

					System.out.println("Source : " + nextRecord[0]);
					System.out.println("Target : " + nextRecord[1]);
					System.out.println("Type : " + nextRecord[2]);
					System.out.println("Weight : " + nextRecord[3]);
					System.out.println("Book : " + nextRecord[4]);
					System.out.println("==========================");

				}

			} catch (CsvValidationException | CsvMalformedLineException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
