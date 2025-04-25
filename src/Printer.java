public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
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
            int pagesToPrint = (pages / 2) + (pages % 2);
            pagesPrinted += pagesToPrint;
            return pagesPrinted;
        } else {
            pagesPrinted += pages;
            return pagesPrinted;
        }
   }

   public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

}
