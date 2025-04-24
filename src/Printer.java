public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerLevel + tonerAmount <= 100) {
            tonerLevel += tonerAmount;
            return tonerLevel;
        } else {
            return -1; // Invalid toner amount
        }
    }

    public int printPages(int pages) {
        if (pages < 0) {
            return -1; // Invalid number of pages
        } else if (isDuplex) {
            int pagesToPrint = (pages / 2);
            System.out.println("Printing in duplex mode");
            pagesPrinted += pagesToPrint;
            System.out.println("Pages printed:" + pagesPrinted);
            return pagesPrinted;
        } else {
            System.out.println("Printing in simplex mode");
            pagesPrinted += pages;
            System.out.println("Pages printed:" + pagesPrinted);
            return pagesPrinted;
        }
   }

}
