package com.example.todoApp.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataLoader {
	public String getData(String file) throws FileNotFoundException, IOException {
	    
	    if(!(new File(file).isFile())) {
	        // Create -- Make sure file exists -- the file before continuing
	        Files.createFile(Paths.get(file));
	    }
	    
	    String data;
	    // We will be using a try-with-resource block
	    try (BufferedReader reader = new BufferedReader(
	            new FileReader(file))) {
	        // Access the data from the file
	        // Create a new StringBuilder
	        StringBuilder string = new StringBuilder();
	        
	        // Read line-by-line
	        String line = reader.readLine();
	        // While there comes a new line, execute this
	        while(line != null) {
	            // Add these lines to the String builder
	            string.append(line);
	            string.append("<br />");
	            // Read the next line
	            line = reader.readLine();
	        }
	        data = string.toString();
	    } catch (Exception er) {
	        // Since there was an error, you probably want to notify the user
	        // For that error. So return the error.
	        data = er.getMessage();
	    }
	    // Return the string read from the file
	    return data;
	}
	
	public boolean writeData(String data, String file) throws IOException, FileNotFoundException
	{
	    // Save the data to the File
	    try (BufferedWriter writer = new BufferedWriter(
	                                    new FileWriter(file))) {
	        // Write the data to the File
	        writer.write(data);
	        // Return indicating the data was written
	        return true;
	    } catch (Exception er) {
	        return false;
	    }
	}
}
