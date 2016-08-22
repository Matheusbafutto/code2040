import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
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
		JsonElement je = new JsonParser().parse(s2);
		JsonObject jobject = je.getAsJsonObject();
		JsonArray haystk = jobject.getAsJsonArray("haystack");
		String needle = jobject.getAsJsonPrimitive("needle").toString();
		String[] haystack = new String[haystk.size()];
		for (int i = 0; i<haystack.length; i++) {
			haystack[i] = haystk.get(i).toString();
		}
		NeedleJson n = new NeedleJson(NeedleInHaystack.api2Call(needle, haystack));
		Sender.sendData("http://challenge.code2040.org/api/haystack/validate", n);

		//api chalenge 3
		String s3 = Sender.sendData("http://challenge.code2040.org/api/prefix", t);
		JsonElement jelement = new JsonParser().parse(s3);
		JsonObject jobj = jelement.getAsJsonObject();
		JsonArray arr = jobj.getAsJsonArray("array");
		String prefix = jobj.getAsJsonPrimitive("prefix").toString();
		String[] array = new String[arr.size()];
		for (int i = 0; i<array.length; i++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
			int len = arr.get(i).toString().length();
			array[i] = arr.get(i).toString().substring(1, len-1);
		}
		PrefixJson p = new PrefixJson(Prefix.api3Call(prefix, array));
		Sender.sendData("http://challenge.code2040.org/api/prefix/validate", p);
		
		//api chalenge 4
		String s4 = Sender.sendData("http://challenge.code2040.org/api/dating", t);
		Type type2 = new TypeToken<Map<String, String>>(){}.getType();
		Map<String, String> myMap2 = gson.fromJson(s4, type2);
		DateGameJson d = new DateGameJson(DateGame.api4Call(myMap2.get("datestamp"), Integer.parseInt(myMap2.get("interval"))));
		Sender.sendData("http://challenge.code2040.org/api/dating/validate", d);
	}
	
	
}