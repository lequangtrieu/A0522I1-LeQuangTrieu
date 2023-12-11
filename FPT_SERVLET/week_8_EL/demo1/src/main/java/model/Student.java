package model;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private Marks marks;

    public Student() {
    }

    public Student(String id, String name, Marks marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }
}
