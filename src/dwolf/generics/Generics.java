package dwolf.generics;

class Generics {
    public static void main(String[] args) {
        GenericType<Integer> obj1 = new GenericType<Integer>(10);
        GenericType<String> obj2 = new GenericType<String>("abc");

        GenericType<Integer> obj11 = new GenericType<>(10);
        GenericType<String> obj22 = new GenericType<>("abc");

        Integer number1 = obj1.get();
        String string2 = obj2.get();
        Integer number11 = obj11.get();
        String string22 = obj22.get();

        System.out.println("obj1: " + obj1.get());
        System.out.println("obj2: " + obj2.get());
        System.out.println("obj11: " + obj11.get());
        System.out.println("obj22: " + obj22.get());

        // Works because of the return statement in the set method.
        System.out.println("ob1.set(20): " + obj1.set(20));
        System.out.println("ob2.set(\"def\"): " + obj2.set("def"));

        // Immutable array
        // var variant
        var stringArray = new ImmutableArray<>(new String[]{"item1", "item2", "item3"});
        // explicit type specification
        ImmutableArray<String> stringArrayExplicit = new ImmutableArray<>(new String[]{"item1", "item2", "item3"});

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.print(stringArray.get(i) + " ");
        }

        System.out.println();
        System.out.println();

        var multiGeneric = new MultipleGenericTypes<>("hi", 5, 2.1);
        System.out.println("T: " + multiGeneric.getT());
        System.out.println("S: " + multiGeneric.getS());
        System.out.println("U: " + multiGeneric.getU());

        multiGeneric.setT("you!");
        multiGeneric.setS(22);
        multiGeneric.setU(99.9);

        System.out.println();

        System.out.println("T: " + multiGeneric.getT());
        System.out.println("S: " + multiGeneric.getS());
        System.out.println("U: " + multiGeneric.getU());

        NumericFunctions<Integer> numericFunctions = new NumericFunctions<>(4);
        System.out.println(numericFunctions.square());

        NumericFunctionsWildcard<Integer> iOb = new NumericFunctionsWildcard<Integer>(6);
        NumericFunctionsWildcard<Double> dOb = new NumericFunctionsWildcard<Double>(-6.0);
        iOb.absEqual(dOb);
        shout("hi", 33);

    }

    // Generic method
    public static <T, S> T shout (T thingToShout, S otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");

        return thingToShout;
    }


}

class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public T set(T t) {
        this.t = t;
        return this.t;
    }
}

class ImmutableArray<T> {

    private final T[] items;

    public ImmutableArray(T[] items) {
        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}

class MultipleGenericTypes<T, S, U> {

    private T t;
    private S s;
    private U u;

    public MultipleGenericTypes(T t, S s, U u) {
        this.t = t;
        this.s = s;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public S getS() {
        return s;
    }

    public U getU() {
        return u;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setS(S s) {
        this.s = s;
    }

    public void setU(U u) {
        this.u = u;
    }
}

class NumericFunctions<T extends Number> {
    private T t;

    NumericFunctions(T t) {
        this.t = t;
    }

    int square() {
        return t.intValue() * t.intValue();
    }
}

class NumericFunctionsWildcard<T extends Number> {
    T num;

    NumericFunctionsWildcard(T ob) {
        this.num = ob;
    }

    boolean absEqual(NumericFunctionsWildcard<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}