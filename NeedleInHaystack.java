public class NeedleInHaystack {
	public static void main(String args[]) {
		String needle = "phksedyc";
		String[] haystack = new String[] { "vzkmundq","gqfztcpo","mjipdhxg","mdfiogaw",
											"lizrjtov","phksedyc","qtxdcawo","jcvzxgmd",
											"hqbudark","oyirlnuq","nlsmfuhy","mvuaidhq",
											"brvxaztj","havwrmto","ibcuvyha","yjghebvo",
											"ydvalsue","kbpyotwv","ovxsdlkh","wibqudtn" };
		for (int i=0; i<haystack.length; i++) {
			if (needle.equals(haystack[i])) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("Could not find needle.");
	}
}