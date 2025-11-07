package dwolf.records;


class Main {
	public static void main (String[] args) {
		Object obj = new User("alice", "secret");

		if (obj instanceof User(String username, String password)) {
			System.out.println("Username: " + username);
			System.out.println("Password " + password);
		}

		nesting();
	}

	public static void nesting() {
		record Name(String first, String last) {}
		record User(Name name, String password) {}

		Object obj = new User(new Name("Alice", "Smith"), "secret");

		if (obj instanceof User(Name(String first, String last), String password)) {
			System.out.println("First name: " + first);
			System.out.println("Last name: " + last);
		}
	}
}
