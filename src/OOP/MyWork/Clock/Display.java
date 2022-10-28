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

    public static void setHrs() {
        System.out.print("Set hours: ");
    }

    public static void setTenMin() {
        System.out.print("Set ten minutes");
    }

    public static void setOneMin() {
        System.out.print("Set one minutes");
    }

    public static void currentTime() {
        System.out.print("The time is: ");
    }

}
