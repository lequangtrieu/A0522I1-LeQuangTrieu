package model;

public class Marks {
    private String id;
    private double java;
    private double c;

    public Marks() {
    }

    public Marks(String id, double java, double c) {
        this.id = id;
        this.java = java;
        this.c = c;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return
                "JAVA=" + java +
                ", C=" + c ;
    }
}
