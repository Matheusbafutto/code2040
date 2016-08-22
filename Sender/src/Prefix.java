import java.util.ArrayList;

public class Prefix {
	public static ArrayList<String> api3Call(String prefix, String[] array) {
		int len = prefix.length();
		prefix = prefix.substring(1, len-1);
		len = prefix.length();
		ArrayList<String> ans = new ArrayList<String>();
		for (String str : array) {
			if (!str.substring(0, len).equals(prefix)) {
				ans.add(str);
			}
		}
		System.out.println(ans);
		return ans;
	}	
}
