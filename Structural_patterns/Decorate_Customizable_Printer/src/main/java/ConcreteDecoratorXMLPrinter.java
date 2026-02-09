public class ConcreteDecoratorXMLPrinter extends DecoratorPrinter {
    public ConcreteDecoratorXMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String xml = "<message>" + message + "</message>";
        printer.print(xml);

    }
}
