import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
@SuppressWarnings("unused")
public class Tester {
	public static void main(String args[]) {
		Gson gson = new Gson();
		Token t = new Token();
		
		//api chalenge 1
		String s1 = Sender.sendData("http://challenge.code2040.org/api/reverse", t);
		RevStringJson r = new RevStringJson(RevString.api1Call(s1));
		Sender.sendData("http://challenge.code2040.org/api/reverse/validate", r);
		
		//api chalenge 2
		String s2 = Sender.sendData("http://challenge.code2040.org/api/haystack", t);
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Map<String, Object> myMap = gson.fromJson(s2, type);
		System.out.println(myMap);

		//api chalenge 3
		String s3 = Sender.sendData("http://challenge.code2040.org/api/prefix", t);
		myMap = gson.fromJson(s3, type);
		String arr = (String)myMap.get("haystack");
		System.out.println(arr);
		
		//api chalenge 4
		String s4 = Sender.sendData("http://challenge.code2040.org/api/dating", t);
		Type type2 = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> myMap2 = gson.fromJson(s4, type2);
		DateGameJson d = new DateGameJson(DateGame.api4Call(myMap2.get("datestamp"), Integer.parseInt(myMap2.get("interval"))));
		Sender.sendData("http://challenge.code2040.org/api/dating/validate", d);
	}
}