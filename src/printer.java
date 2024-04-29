public class printer {
    private String tonerLevel;
    private int numberOfPages;
    private boolean isDuplexPrinter;

    public printer(String tonerLevel, int numberOfPages, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void setTonerLevel(String tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void fillTonerLevel(String newTonerLevel) {

        int tonerLevelValue = Integer.parseInt(newTonerLevel);
        if (tonerLevelValue  <=  100) {
            this.tonerLevel = newTonerLevel;
            System.out.println("Toner level filled up to: " + newTonerLevel);
        } else {
            System.out.println("Invalid toner level");
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void printPages(int pagesPrinted) {
        if (pagesPrinted > 0) {
            this.numberOfPages += pagesPrinted;
            System.out.println(pagesPrinted + " pages printed. Total number of pages: " + this.numberOfPages);
        } else {
            System.out.println("Invalid number of pages to print");
        }
    }

}
