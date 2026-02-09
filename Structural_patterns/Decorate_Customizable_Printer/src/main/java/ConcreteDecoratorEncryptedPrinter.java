import java.util.Base64;

public class ConcreteDecoratorEncryptedPrinter extends DecoratorPrinter {
    public ConcreteDecoratorEncryptedPrinter(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String message) {
        String encrypted = Base64.getEncoder().encodeToString(message.getBytes());
        printer.print(encrypted);
    }
}
