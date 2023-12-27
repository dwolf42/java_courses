package dwolf.generics;

class ImmutableAndMutableGenericsArraysAreFun {
    public static void main(String[] args) {
        myImmutableStringArray();
        myImmutableCharArray();
        myMutableStringArray();
    }

    static void myImmutableStringArray() {
        var stringArrayImmutable = new ImmutableGenericArrayOfThings<>(new String[]{"Gameboy", "Playstation 5", "Cat"});

        for (int i = 0; i < stringArrayImmutable.length(); i++) {
            System.out.print(stringArrayImmutable.get(i) + '\u2007');
        }
        System.out.println("\n");
    }

    static void myImmutableCharArray() {
        var charArray = new ImmutableGenericArrayOfThings<>(new Character[]{'D', 'a', 'v', 'i', 'd'});

        for (int i = 0; i < charArray.length(); i++) {
            System.out.print(charArray.get(i));
            System.out.print('\u2007');
        }
        System.out.println("\n");
    }

    static void myMutableStringArray() {
        var stringArrayMutable = new MutableGenericArrayOfThings<>(new String[]{"Laptop", "iPhone", "Samsung Galaxy S23"});
        for (int i = 0; i < stringArrayMutable.length(); i++) {
            System.out.print(stringArrayMutable.get(i));
            System.out.print('\u2007');
        }
        System.out.println("\n");

        try {
            stringArrayMutable.add(0, "Notebook");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < stringArrayMutable.length(); i++) {
            System.out.print(stringArrayMutable.get(i));
            System.out.print('\u2007');
        }
        System.out.println("\n");
    }

}


class ImmutableGenericArrayOfThings<T> {

    private final T[] myThings;

    public ImmutableGenericArrayOfThings(T[] myThings) {
        this.myThings = myThings.clone();
    }

    public T get(int index) {
        return myThings[index];
    }

    public int length() {
        return myThings.length;
    }
}

class MutableGenericArrayOfThings<T> {

    private final T[] theThings;

    public MutableGenericArrayOfThings(T[] theThings) {
        this.theThings = theThings.clone();
    }

    public T get(int index) {
        return theThings[index];
    }

    public void add(int index, T thing) {
        theThings[index] = thing;
    }

    public int length() {
        return theThings.length;
    }
}
