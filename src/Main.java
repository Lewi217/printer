//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printer myPrinter = new printer("Low", 50, true);

        // Example usage: fill toner level
        myPrinter.fillTonerLevel("70");

        // Example usage: print pages
        myPrinter.printPages(10);

    }
}