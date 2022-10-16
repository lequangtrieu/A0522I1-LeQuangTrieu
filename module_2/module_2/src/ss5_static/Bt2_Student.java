package ss5_static;

public class Bt2_Student {
    private String name;
    private String classes;

    public Bt2_Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "This is " +this.getName()+" in the class " +this.getClasses();
    }
}
