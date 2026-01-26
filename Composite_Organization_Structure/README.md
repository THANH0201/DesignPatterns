## Composite
### Assignment
1. The organization has two types of components:

- **Department (Composite)**
    - Fields: `name`, `List<OrganizationStructure> children`
    - A department can contain both departments and employees.

- **Employee (Leaf)**
    - Fields: `name`, `salary`
    - An employee does not contain any children.

Both must be handled uniformly through a common interface.

2. This common interface defines:(use interface: don't share state or code or constructor)
- `getName()`
- `getSalary()`
- `toXML(int indent)`
- `add()` and `remove()` (not used by Leaf → default throws exception)

This interface represents the **Component** in the Composite pattern.

3. In the `main()` method:

- Create the root department
- Create sub‑departments
- Create employees
- Use `add()` to build the Composite tree
- Call:
    - `root.getSalary()` → total salary of the organization
    - `root.toXML()` → print the entire organization in XML format

    
### True/False
1. Composite is a structural design pattern.

2. Composite represents objects organized in a tree structure.

3. Both Leaf and Composite implement the same Component interface.

4. A Leaf has no children.

5. A Composite can contain both Leaf objects and other Composite objects.

6. The client can treat Leaf and Composite objects uniformly.

7. Composite naturally supports recursive operations.

8. A Leaf can contain child components.

9. A Composite usually provides methods like add(), remove(), and getChild().

10. Composite simplifies client code by hiding structural complexity.

11. Composite is suitable for modeling part–whole hierarchies.

12. Adding new component types is easy in the Composite pattern.

13. Composite makes it easy to restrict which components can be added as children.

14. Debugging Composite structures can be harder due to recursion.

15. All components in a Composite structure must share the same interface.

16. A single operation on a Composite can trigger operations on all its children.

17. Composite violates the Liskov Substitution Principle.

18. Composite increases flexibility but may lead to overly general structures.

19. Composite is commonly used in graphical systems (e.g., drawing shapes).

20. The client must know whether an object is a Leaf or a Composite before using it.