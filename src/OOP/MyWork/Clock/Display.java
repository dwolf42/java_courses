package OOP.MyWork.Clock;

public class Display {


    public static void whatTime() {
        System.out.println("What time is it?");
    }

    String setHrs = "Set hours";
    String setTenMin = "Set ten minutes";
    String setOneMin = "Set one minutes";
    String theTime = "The time is";

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
