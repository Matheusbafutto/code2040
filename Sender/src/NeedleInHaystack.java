public class NeedleInHaystack {
	public static String api2Call(String needle, String[] haystack) {
		for (int i=0; i<haystack.length; i++) {
			if (needle.equals(haystack[i])) {
				return String.valueOf(i);
			}
		}
		return "Could not find needle.";
	}
}