package dwolf.records;

import java.util.Locale;

record User(String username, String password) {

	// custom constructor (if needed)
     User {
		if (username == null || password == null) {
			throw new IllegalArgumentException("Username and password must not be null");
		}
	}

	// custom getter
	public String username() {
		return username.toUpperCase(Locale.ENGLISH);
	}
}
