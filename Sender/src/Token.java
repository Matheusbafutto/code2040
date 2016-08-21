import java.util.ArrayList;

public class Token {
	String token = "f01ae53960b459952cf97d8d101278c6";
}

class RevStringJson extends Token {
	String string;
	public RevStringJson(String ans) {
		string = ans;
	}
}

class NeedleJson extends Token {
	String needle;
	public NeedleJson(String ans) {
		needle = ans;
	}
}

class PrefixJson extends Token {
	ArrayList<String> array;
	public PrefixJson(ArrayList<String> ans) {
		array = ans;
	}
}

class DateGameJson extends Token {
	String datestamp;
	public DateGameJson(String ans) {
		datestamp = ans;
	}
}