package ss20_code_fpt.Week_5.Service;

import ss20_code_fpt.Week_5.Model.Student;

import java.util.*;

public class Service implements IService{
    private static final Scanner input = new Scanner(System.in);
    private static final List<Student> list = new ArrayList<>();

    static {
        list.add(new Student("S01", "John Horstman", 7.8));
        list.add(new Student("S02", "John Smith", 8.5));
        list.add(new Student("S03", "Cays Hostman", 9.6));
        list.add(new Student("S04", "David Beckham", 8.0));
        list.add(new Student("S05", "Bao Khanh", 8.7));
    }

    @Override
    public void listAllStudent() {
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
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                studentList.add(list.get(i));
            }
        }
        System.out.println(studentList);
    }

    @Override
    public void addStudent() {
        list.add(this.info());
        System.out.println("adding successfully");
    }

    @Override
    public void sortByID() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        this.listAllStudent();
    }

    @Override
    public void sortByName() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        this.listAllStudent();
    }

    @Override
    public void sortByAverage() {
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.getAverage() - o2.getAverage());
//            }
//        });
//        this.listAllStudent();

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAverage(), o2.getAverage());
            }
        });
        this.listAllStudent();
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
