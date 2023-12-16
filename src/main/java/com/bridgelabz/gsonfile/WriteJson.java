package com.bridgelabz.gsonfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.pojo.model;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

/*
 * @Description - Read data from a CSV file and write to JSON file.
 * 
 * @Method - convertCsvToJson() method will convert the CSV file to JSON file.
 */
public class WriteJson {

	/*
	 * @Description - convertCsvToJson() method will convert the CSV file to JSON
	 * file.
	 * 
	 * @param:  csvFilePath - Path of the CSV file, jsonFilePath - Path of the JSON
	 * 
	 * @return: void
	 */
	public void convertCsvToJson(String csvFilePath, String jsonFilePath) {
		List<model> models = new ArrayList<>();

		try (CSVReader csvReader = new CSVReader(new FileReader(csvFilePath))) {
			String[] nextRecord;
			while ((nextRecord = csvReader.readNext()) != null) {
				model csvUser = new model();
				csvUser.setSource(nextRecord[0]);
				csvUser.setTarget(nextRecord[1]);
				csvUser.setType(nextRecord[2]);
				csvUser.setWeight(nextRecord[3]);
				csvUser.setBook(nextRecord[4]);
				models.add(csvUser);
			}
		} catch (IOException | CsvValidationException e) {
			e.printStackTrace();
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try (FileWriter fileWriter = new FileWriter(jsonFilePath)) {
			gson.toJson(models, fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
