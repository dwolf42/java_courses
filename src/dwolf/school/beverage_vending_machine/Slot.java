package dwolf.school.beverage_vending_machine;

public class Slot {
    private String name;
    private double price;
    private int amount;
    private int maxAmount;

    public Slot(String name, double price, int amount, int maxAmount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.maxAmount = maxAmount;
    }

    public int getAmount() {
        return amount;
    }

    private void setAmount(int amount) {
        if(this.amount + amount > this.maxAmount) {
            throw new Error ("Füllmenge passt nicht in den Schacht");
        } else {
            this.amount += amount;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        if (this.amount != -1) {
            throw new Error("Der Schacht ist nicht leer.");
        } else {
            this.name = name;
        }
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public boolean rausnehmen() {
        if(this.amount > 0) {
            this.amount--;
            return true;
        } else {
            return false;
        }
    }

    public void refill(int anzahl) {
        this.amount -= anzahl;
    }
}
