### Abstract Factory
**1. Definition**
- A creational design pattern.

- Provides an interface to create related objects.

- Hides concrete classes from the client.

- Ensures consistency among products in the same family.

**2. Structure**
- AbstractFactory: interface or abstract class declares creation methods for each product type. It does not implement the creation logic; it only defines the methods.(abstract class UIFactory include method create products with parameter: createButton(String text))

- ConcreteFactory: extends or implements the AbstractFactory,produces concrete products. It overrides all creation methods and returns ConcreteProduct objects belonging to the same family.(class AFactory,BFactory expends UIFactory override all methods create and return concrete product)

- AbstractProduct: Each product type has its own AbstractProduct interface or abstract class. These define shared attributes and behaviors for all concrete versions.(abstract class Button, TextField, Checkbox include atributes and methods)

- ConcreteProduct: extend the AbstractProduct classes. They implement the specific behavior for each product family (class ButtonA, ButtonB,TextFiledA, TextFieldB, CheckboxA, CheckboxB expends Button, TextFiled, Checkbox ke thua cac thuoc tinh va override phuong thuc nhung return theo tung loai)

- Client: The Client works only with abstractions (AbstractFactory + AbstractProduct).

It never depends on concrete classes.

The client receives a factory and uses it to create products without knowing which concrete classes are used.

**3. Key Features**
- Creates families of related objects.

-   Ensures product compatibility.

- Easy to add new families.

- Hard to add new product types.

- Often implemented using Factory Method internally.

- Promotes loose coupling (DIP).

- Violates OCP when adding new product types.
