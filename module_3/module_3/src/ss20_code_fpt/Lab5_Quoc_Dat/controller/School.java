package ss20_code_fpt.Lab5_Quoc_Dat.controller;

import ss20_code_fpt.Lab5_Quoc_Dat.model.Student;

import java.util.*;

public class School implements ISchool {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Student> list = new ArrayList<>();

    static {
        list.add(new Student("S01", "John Horstman", 7.8));
        list.add(new Student("S02", "John Smith", 8.5));
        list.add(new Student("S03", "Cays Hostman", 9.6));
        list.add(new Student("S04", "David Beckham", 8.0));
    }

    @Override
    public void display() {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Override
    public void findById(String id) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println(list.get(index));
        } else {
            System.out.println("no student");
        }
    }

    @Override
    public void findByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : list) {
            if (name.equals(student.getName())) {
                studentList.add(student);
            }
        }
        System.out.println(studentList);
    }

    @Override
    public void add() {
        list.add(this.info());
        System.out.println("adding successfully");
    }

    @Override
    public void sortByID() {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        this.display();
    }

    @Override
    public void sortByName() {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.display();
    }

    @Override
    public void sortByAverage() {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverage(), o2.getAverage());
            }
        });
        this.display();
    }

    private Student info() {
        System.out.println("id:");
        String id = input.nextLine();
        System.out.println("name:");
        String name = input.nextLine();
        System.out.println("average:");
        double average = Double.parseDouble(input.nextLine());

        return new Student(id, name, average);
    }
}
