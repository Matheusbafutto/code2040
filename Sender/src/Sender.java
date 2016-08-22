import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

@SuppressWarnings("unused")
public class Sender {
	public static <E extends Token> String sendData(String adress, E obj) {
		try {
			Gson gson = new Gson();
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(adress);
			StringEntity postingString = new StringEntity(gson.toJson(obj));
			post.setEntity(postingString);
			post.setHeader("Content-type", "application/json");
			HttpResponse response = httpClient.execute(post);
			HttpEntity entity = response.getEntity();
			String responseString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(responseString);//gson.toJson(obj));
			return responseString;
		} catch (Exception e) {
			System.out.println("Something went wrong...");
			return "0";
		}
	}
}

