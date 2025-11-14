package dwolf.regexes.pattern_matcher;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexPatternMatcher {
	public static void main(String[] args) {
		String text = "We use JAVA to write modern applications";
		// only matches the whole string, also substrings due to '.*' at the start and end of the string
		Pattern pattern = Pattern.compile(".*[Jj]ava.*", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		boolean matches = matcher.matches();
		System.out.println("Java: " + matches);

		// .machtes and .find
		text = "Regex is a powerful tool for programmers";

		pattern = Pattern.compile("tool");
		matcher = pattern.matcher(text);

		System.out.println("tool: " + matcher.matches()); // false, the whole string does not match the pattern
		System.out.println("tool: " + matcher.find()); // true, there is a substring that matches the pattern

		pattern = Pattern.compile("^tool$");
		matcher = pattern.matcher(text);

		System.out.println("^tool$: " + matcher.matches()); // false
		System.out.println("^tool$: " + matcher.find()); // false, as we made find() behave like matches

		text = "Regex is a powerful tool for programmerstool";
		pattern = Pattern.compile("tool$");
		matcher = pattern.matcher(text);
		System.out.println("tool$: " + matcher.matches()); // false
		System.out.println("tool$: " + matcher.find()); // false, as we made find() behave like matches

		matcher = Pattern.compile("tool").matcher(text);
		matcher.region(10, 20); // start index = 10, end index = 20 (exclusive)
		System.out.println("region(10, 20): " + matcher.find()); // false
		matcher.region(10, 30); // start index = 10, end index = 30 (exclusive)
		System.out.println("region(10, 30): " + matcher.find()); // true
	}
}
