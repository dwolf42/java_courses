package dwolf.referencing_subclass_objects;

class Person {

    protected String name;
    protected int yearOfBirth;
    protected String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Client extends Person {

    protected String contractNumber;
    protected boolean gold;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
}

class Employee extends Person {

    protected int startDate;
    protected long salary;

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

class Run {
    public static void main(String[] args) {
        Person person = new Employee();
        person.setName("Ginger R. Lee");

        Client client = new Client();
        client.setName("Pauline E. Morgan");

        Employee employee = new Employee();
        employee.setName("Lawrence V. Jones");

        //printNames (a piece of code that, for the example's sake was defined independently
        // (= not a method of any of the objects)) will work the same way for each object, regardless its exact type,
        // despite its parameter doesn't declare Employee or Client. To facilitate this, the method parameter was
        // declared with the superclass reference.
        Person[] persons = {person, client, employee};
        printNames(persons);

    }

    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    private static void referencing() {
        // Subclass reference, because the types of the reference and the created object are the same.
        Person person = new Person();
        Client client = new Client();
        Employee employee = new Employee();

        // Superclass reference, because the references have the type of the superclass and the actual types of the
        // created objects are subclasses.
        //v--type of Superclass/ v--subclass
        Person client2 = new Client(); // the reference is Person, the object is Client
        Person employee2 = new Employee(); // the reference is Person, the object is Employee

        // Client client = new Client();
        client.getName(); // Superclass Person
        client.getAddress(); // Superclass Person
        client.getYearOfBirth(); // Superclass Person
        client.getContractNumber(); // Subclass Client
        client.isGold();  // Subclass Client

        // Person client2 = new Client();
        client2.getName(); // Superclass Person
        client2.getAddress(); // Superclass Person
        client2.getYearOfBirth(); // Superclass Person

        employee2.getName(); // Superclass Person
        employee2.getAddress(); // Superclass Person
        employee2.getYearOfBirth(); // Superclass Person


        employee.setName("Ginger R. Lee"); // Ok
        employee.setYearOfBirth(1980); // Ok
//        employee.setSalary(30000); // Compile-time error, the base class "doesn't know" about the method

//        Client clientAgain = (Client) person;
//        Employee employeeAgain = (Employee) person;

        Person p = new Client();

//        ((Client) p).isGold();

        employee2.setName("Ginger R. Lee");
        client.setName("Pauline E. Morgan");
        employee.setName("Lawrence V. Jones");

        Person[] persons = {employee2, client, employee};
        printNames(persons);

    }
}