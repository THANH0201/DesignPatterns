public class Main {
    public static void main(String[] args) {

        Printer p1 = new BasicPrinter();
        p1.print("Hello World!");

        Printer p2 = new ConcreteDecoratorXMLPrinter(new BasicPrinter());
        p2.print("Hello World!");

        Printer p3 = new ConcreteDecoratorEncryptedPrinter(
                new ConcreteDecoratorXMLPrinter(
                        new BasicPrinter()
                )
        );
        p3.print("Hello World!");
    }
}

