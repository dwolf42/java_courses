package dwolf.polymorphism;

class BaseNumberGenerator {
    int base;

    public BaseNumberGenerator(int base) {
        this.base = base;
    }

    public int generate() {
        return base + 11;
    }
}

class NumberGenerator extends BaseNumberGenerator {
    public NumberGenerator(int base) {
        super(base);
    }

    @Override
    public int generate() {
        return super.generate() + getNumber();
    }

    public int getNumber() {
        return this.base -7;
    }
}

class Main {
    public static void main(String[] args) {
        BaseNumberGenerator ne = new NumberGenerator(10);
        System.out.println(ne.generate()); // 24 21+-7
    }
}