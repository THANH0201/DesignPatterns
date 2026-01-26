import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationStructure {
    private final String name;
    private final List<OrganizationStructure> children = new ArrayList<>();
    public Department(String name) {
        this.name = name;
        }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        double total = 0.0;
        for (OrganizationStructure c : children) {
            total += c.getSalary();
        }
        return total;
    }
    @Override
    public void add(OrganizationStructure component) {
        children.add(component);
    }
    @Override
    public void remove(OrganizationStructure component) {
        children.remove(component);
    }
    @Override
    public String toXML(int indent) {
        String pad = " ".repeat(indent);
        StringBuilder sb = new StringBuilder();
        sb.append(pad) .append("<department name=\"") .append(name) .append("\">\n");
        for (OrganizationStructure c : children) {
            sb.append(c.toXML(indent + 2));
        }
        sb.append(pad).append("</department>\n");
        return sb.toString(); }
}
