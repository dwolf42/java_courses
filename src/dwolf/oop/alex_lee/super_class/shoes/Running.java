package dwolf.oop.alex_lee.super_class.shoes;

public class Running extends Shoe {
    public final double weight;

    Running (String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }
}
