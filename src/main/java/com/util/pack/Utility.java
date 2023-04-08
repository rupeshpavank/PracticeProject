package com.util.pack;

import org.json.JSONArray;
import org.json.JSONObject;

public class Utility {
	
	
	public static String testResponse(JSONObject responseJson,String jpath) {

		Object obj = responseJson;
		
		
	String[] arr=	jpath.split("/");
		
		for(String s:arr) {
	
			if (!s.isEmpty())
			{
				if (!(s.contains("[") || s.contains("]")))
				{
					obj = ((JSONObject) obj).get(s);  	
					
				}
				   
					else if (s.contains("[") || s.contains("]"))  
						
					{
						
						obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));
					}

				
			}
		
			}
		
		
		
		return obj.toString();
	
		
		
	}

}
