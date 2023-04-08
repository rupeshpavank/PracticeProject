package org.api.testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.text.html.parser.Entity;

import org.apache.commons.collections.map.HashedMap;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.util.pack.Utility;



public class APITesting {

	public static void main(String[] args) throws IOException {
		
		
		Properties pro=new Properties();
		
		FileInputStream fs=new FileInputStream("C:\\Users\\hi\\MVCExm\\Practice\\src\\main\\java\\text.txt");
		
	pro.load(fs);
		
	System.out.println(pro.get("url"));
	
	Map<String,String> headermap=new HashMap<String,String>();
	
	headermap.put("Content-Type", "application/json");
	

 CloseableHttpClient httpCLient=HttpClients.createDefault();
	
	HttpGet httpGet=new HttpGet("https://reqres.in//api/users");
	
	for(Map.Entry<String, String> entry:headermap.entrySet()) {
		
		httpGet.addHeader(entry.getKey(), entry.getValue());
		
	}

	
	/*
	 * ResponseHandler<String> responseHandler = new MyResponseHandler();
	 */
	
	CloseableHttpResponse response	=httpCLient.execute(httpGet);
	
int statusCode=	response.getStatusLine().getStatusCode();

System.out.println(statusCode);

String st=EntityUtils.toString(response.getEntity(), "UTF-8");

JSONObject js=new JSONObject(st);

System.out.println(js);

Header [] headr=response.getAllHeaders();

Map<String, String> responseHeaders=new HashedMap();

for(Header hs:headr) {
	
	responseHeaders.put(hs.getName(), hs.getValue());
}

System.out.println(responseHeaders);

String str=Utility.testResponse(js, "/data[5]/last_name");

String str1=Utility.testResponse(js, "/per_page");


System.out.println("****************"+str);

System.out.println("****************"+str1);

CloseableHttpClient httpPOst=HttpClients.createDefault();

HttpPost post=new HttpPost(str1);

String payLoad="";


post.setEntity(new StringEntity(payLoad));







		
	}

}
