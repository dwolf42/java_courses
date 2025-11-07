package dwolf.regexes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,20}$";
		Map<String, String> pwlist = new HashMap<>();

		pwlist.put("p21LowChars-False", "abcdefghijklmnopqrstu");
		pwlist.put("p20LowChars-False", "abcdefghijklmnopqrst");
		pwlist.put("p20Low1UpChars-False", "abcdefghijklmnopqrsT");
		pwlist.put("p3LowUpDig-False", "U9");
		pwlist.put("p21LowChars1Sp-False","abcdefghijklmnopqrstu");
		pwlist.put("p20LowChars1Sp-False","abcdefghijklmnopqrst");
		pwlist.put("p20Low1UpChars1Sp-False","abcdefghijklmnopqrsT");
		pwlist.put("p3LowUpDig1Sp-False","pU9");
		pwlist.put("p20low1Up1Dig1Sp-False", "abcdefghijklmnopq+S1");
		pwlist.put("p8low1Up1Dig1Sp-False", "abcdeS1");
		pwlist.put("p20low1Up1Dig-True", "abcdefghjklmnopqrS1");
		pwlist.put("p8low1Up1Dig-True", "abcdeBS1");

		for (var entry : pwlist.entrySet()) {
			System.out.println(entry.getKey() + " - is: " + entry.getValue().matches(PASSWORD_PATTERN));
		}

/*
* Ich möchte verschiedene Versionen des Passworts prüfen und sehen, für welches Passwort
* der Pattern passt und für welches nicht
*
* */
	}
}
