package dwolf.colorful_output;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

class ColorfulWorld {
    public static void main(String[] args) {
        ColoredPrinter printer = new ColoredPrinter
                .Builder(1, false).build();

        printer.print("Hello, colorful world!",
                Ansi.Attribute.BOLD, Ansi.FColor.BLUE, Ansi.BColor.YELLOW);
    }
}
