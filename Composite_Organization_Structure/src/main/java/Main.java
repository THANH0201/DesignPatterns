public class Main {

    public static void main(String[] args) {

        // Root of the organization
        Department root = new Department("Headquarters");

        // Sub-departments
        Department it = new Department("IT");
        Department hr = new Department("HR");
        Department finance = new Department("Finance");

        // Employees
        Employee alice = new Employee("Alice", 5000);
        Employee bob = new Employee("Bob", 4500);
        Employee charlie = new Employee("Charlie", 4000);
        Employee diana = new Employee("Diana", 5500);

        // Build structure
        it.add(alice);
        it.add(bob);

        hr.add(charlie);

        finance.add(diana);

        root.add(it);
        root.add(hr);
        root.add(finance);

        // Demonstrate add/remove at any time
        Employee temp = new Employee("Temporary Worker", 2000);
        hr.add(temp);
        hr.remove(temp);

        System.out.println(root.getName());

        // 1) Print total salary with a single call
        System.out.println("Total salary of organization: " + root.getSalary());

        // 2) Print full organizational structure as XML
        System.out.println("\nOrganization structure (XML):");
        System.out.println(root.toXML(0));
    }
}

