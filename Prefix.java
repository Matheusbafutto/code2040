import java.util.ArrayList;

public class Prefix {
	public static void main(String args[]) {
		String prefix = "qagt";
		String[] array = new String[] { "qagtsrac","agqkusym","qagtpkhv","qagtzkpa",
										"vqwyjhep","sygreonf","nqtyzfwo","qagtyhcb",
										"qagtjupg","qagtmgjf","qagtnubk","qagtodqn",
										"sazqtcxj","xipshcoj","qydvripk","ipuljynd",
										"mzafglyp","zkhpxyao","hxgbzowd","qagtfzgh" };
		System.out.println(computePrefix( prefix, array));
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