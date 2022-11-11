package ss12_Collection.Th1_TestStudent;

import java.util.ArrayList;

public class ListStudent {
    private ArrayList<Student> arr;
    public ListStudent() {
        this.arr = new ArrayList<Student>();
    }
    public ListStudent(ArrayList<Student> arr) {
        this.arr = arr;
    }
    public void addStudent(Student student) {
        this.arr.add(student);
    }
    public void printStudent() {
        for (Student student:
             arr) {
            System.out.println(student);
        }
    }

}
