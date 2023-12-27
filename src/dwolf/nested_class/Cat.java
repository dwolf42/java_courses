package dwolf.nested_class;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private void sayMeow() {
        System.out.println(this.name + " says: \"Meow\".");
    }


    public class Bow {
        private String color;

        public Bow(String color) {
            this.color = color;

        }

        public void putOnABow() {
            Cat.this.sayMeow();
            System.out.println("Bow is on!");
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.");
        }


        public class Arrow {
            private String element;

            public Arrow(String element) {
                this.element = element;
            }

            public void shootArrow() {
                System.out.println("Cat " + Cat.this.name + " has shot an " + this.element + " arrow!");

            }
        }

    }
}
