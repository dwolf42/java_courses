package OOP.MyWork.Clock;

public class Display {

    /*
     ***************************************************************
     *  This part's purpose is educational only
     *
     *    public static void instanceMethod() {
     *        System.out.println("Congrats, you've accessed the Instance Method :)");
     *    }
     ***************************************************************
     */

    String whatTime = "What time is it?";
    String setHrs = "Set hours";
    String setTenMin = "Set ten minutes";
    String setOneMin = "Set one minutes";
    String theTime = "The time is";

    public void whatTime() {
        System.out.println(this.whatTime);
    }

    public void setHrs() {
        System.out.print(this.setHrs);
    }

    public void setTenMin() {
        System.out.print(this.setTenMin);
    }

    public void setOneMin() {
        System.out.print(this.setTenMin);
    }

    public void currentTime() {
        System.out.print(this.setOneMin);
    }

    public void theTime() {
        System.out.println(this.theTime);
    }

}
