package FunctionalInterfaces.MarkerInterfaces.DataSerializationBackup.CloningPrototypeObjects;

public class Employee implements Cloneable {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // default shallow copy
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
