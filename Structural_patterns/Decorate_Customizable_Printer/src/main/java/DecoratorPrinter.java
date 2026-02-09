public abstract class DecoratorPrinter implements Printer {
    protected Printer printer;
    public DecoratorPrinter(Printer printer) {
        this.printer = printer;
    }
}
