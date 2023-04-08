package com.TestProject.Practice;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;  
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class ReadXmlFile {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\hi\\Documents\\Notepaddocs\\xmlFile.xml");  

		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		
		DocumentBuilder db=dbf.newDocumentBuilder();
		
		
		Document doc = db.parse(file);  

		System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  

		NodeList nodeList = doc.getElementsByTagName("student");  
		
		for (int itr = 0; itr < nodeList.getLength(); itr++)   
		{  
		Node node = nodeList.item(itr);  
		
		System.out.println("\nNode Name :" + node.getNodeName()); 
		
		if (node.getNodeType() == Node.ELEMENT_NODE)   
		{  
		Element eElement = (Element) node;  
		
		System.out.println("Student id: "+ eElement.getElementsByTagName("id").item(0).getTextContent());  
		
		System.out.println("Student id: "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());  

		}
		}

	}

}
