package com.TestProject.Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.*;
import org.json.simple.parser.*;

public class ReadJson {

	public static void main(String[] args) throws Exception {
		
        Object o = new JSONParser().parse(new FileReader("C:\\Users\\hi\\Documents\\Notepaddocs\\ReadJson.json"));

        JSONObject j = (JSONObject) o;

		/*
		 * JSONParser parser = new JSONParser(); Object obj = parser.parse(new
		 * FileReader("C:\\Users\\hi\\Documents\\Notepaddocs\\ReadJson.json"));
		 */
       
		/*
		 * JSONObject jsonObject = (JSONObject)obj;
		 */    
        
        String name = (String)j.get("name");
        
        System.out.println("Name: " + name);

	}

}
