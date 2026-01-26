import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter A or B to choose Style:");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().trim().toUpperCase();
        UIFactory factory;

        if (choice.equals("A")) {
            factory = new AFactory();
        } else if (choice.equals("B")) {
            factory = new BFactory();
        } else {
            System.out.println("Invalid choice! Defaulting to Style A.");
            factory = new AFactory();
        }
        System.out.println("Enter text for button");

        Scanner input1 = new Scanner(System.in);

        String buttonText = input1.nextLine();

        Button btn = factory.createButton(buttonText);

        System.out.println("Enter text for text field");
        Scanner input2 = new Scanner(System.in);

        String textField = input2.nextLine();

        TextField tf = factory.createTextField(textField);

        System.out.println("Enter text for check box");
        Scanner input3 = new Scanner(System.in);

        String checkBox = input3.nextLine();

        Checkbox cb = factory.createCheckbox(checkBox);

        System.out.println("Result");
        btn.display();
        tf.display();
        cb.display();

        System.out.println("After entering new text to change content");
        btn.setText("NEW TEXT");
        tf.setText("Enter text 2 here");
        cb.setText("I agree");
        btn.display();
        tf.display();
        cb.display();
    }
}

