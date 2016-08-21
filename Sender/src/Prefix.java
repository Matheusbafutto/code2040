import java.util.ArrayList;

public class Prefix {
	public static ArrayList<String> api2Call(String prefix, String[] array) {
		return computePrefix( prefix, array);
	}
	
	public static ArrayList<String> computePrefix(String prefix, String[] array) {
		int len = prefix.length();
		ArrayList<String> ans = new ArrayList<String>();
		for (String str : array) {
			if (!str.substring(0, len).equals(prefix)) {
				ans.add(str);
			}
		}
		return ans;
	}
	
}
