// Inheritance

package kabraxis.oop.my_work.inheritance.company;

public class Client extends Person {
    protected String contractNumber;
    protected boolean gold;

    public String getContractNumber() {
        return this.contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isGold() {
        return this.gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

}
