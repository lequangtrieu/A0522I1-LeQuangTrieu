package ss20_code_fpt.Week_6.Service;

import ss20_code_fpt.Week_6.Model.Student;

import java.io.*;
import java.util.*;

public class Service implements IService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Student> list = new ArrayList<>();
    public static final String PATH = "D:\\CODEGYM\\module_3\\module_3\\src\\ss20_code_fpt\\Week_6\\Data\\sch.csv";


    @Override
    public void listAllStudent() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);
            for (int i = 0; i < studentList.size(); i++) {
//                System.out.println("Student " + (i + 1) + ": " + studentList.get(i));
                System.out.println(studentList.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findById(String id) {
        try {
        List<Student> studentList = new ArrayList<>();
        readCSV(studentList);

            for (int i = 0; i < studentList.size(); i++) {
                if (id.equals(studentList.get(i).getId())) {
                    System.out.println(studentList.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findByName(String name) {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);

            for (int i = 0; i < studentList.size(); i++) {
                if (name.equals(studentList.get(i).getName())) {
                    System.out.println(studentList.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addStudent() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);
//            Student studentAdd = this.info();
            studentList.add(this.info());
            writeCSV(studentList);
            System.out.println("adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private void readCSV(List<Student> studentList) throws IOException {
        FileReader fileReader = new FileReader(PATH);
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Student student;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            double average = Double.parseDouble(temp[2]);

            student = new Student(id, name, average);
            studentList.add(student);
        }
        br.close();
    }

    private void writeCSV(List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter(PATH);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (Student student : studentList) {
            bw.write(student.infoWriteCSV());
            bw.write("\n");
        }
        bw.close();
    }
}
