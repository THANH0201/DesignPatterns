public class Employee implements OrganizationStructure {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public String toXML(int indent) {
        String pad = " ".repeat(indent);//indentation whitespace
        return pad + "<employee name=\"" + name + "\" salary=\"" + salary + "\" />\n";
    }

}
