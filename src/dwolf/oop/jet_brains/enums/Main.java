package dwolf.oop.jet_brains.enums;

public class Main {
    public static void main(String[] args) {
        // Initialize the variable
        UserStatus active = UserStatus.ACTIVE;
        // Access the value by the name() method
        System.out.println("active.name(): " + active.name());

        // Access enum instance by its name. Is another way to initialize a variable
        UserStatus blocked = UserStatus.valueOf("BLOCKED");
        System.out.println("blocked: " + blocked);

        // Look at all constants of the enum by values() method as an array
        UserStatus[] statuses = UserStatus.values(); // [PENDING, ACTIVE, BLOCKED]

        // Ordinal position of an instance of enum
        System.out.println("active.ordinal(): " + active.ordinal());
        System.out.println("UserStatus.BLOCKED.ordinal(): " + UserStatus.BLOCKED.ordinal());

        // Although an enum is a reference type, it can be compared by using .equals and ==
        System.out.println("active.equals(UserStatus.ACTIVE): " + active.equals(UserStatus.ACTIVE));
        System.out.println("active == UserStatus.ACTIVE: " + (active == UserStatus.ACTIVE));

        // Enums can be used as switch satement
        switch (active) {
            case PENDING:
                System.out.println("Your account is pending.");
                break;
            case ACTIVE:
                System.out.println("Your account has been activated.");
                break;
            case BLOCKED:
                System.out.println("Sorry, your account has been blocked from the system.");
                break;
            default:
                System.out.println("Error");
                break;
        }

        for (UserStatus status : UserStatus.values()) {
            System.out.println("status: " + status);
        }

    }
}

enum UserStatus {
    PENDING,
    ACTIVE,
    BLOCKED;

}


