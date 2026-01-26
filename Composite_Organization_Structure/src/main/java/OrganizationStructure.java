public interface OrganizationStructure {

    String getName();
    double getSalary();
    String toXML(int indent); //indent: number of space

    default void add(OrganizationStructure component) {
        throw  new UnsupportedOperationException("Not supported yet.");
    };

    default void remove(OrganizationStructure component) {
        throw  new UnsupportedOperationException("Not supported yet.");
    };
}