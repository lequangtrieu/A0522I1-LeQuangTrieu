package ss20_code_fpt.Lab6_Quoc_Dat.Controller;

import ss20_code_fpt.Lab6_Quoc_Dat.Model.Student;

import java.io.*;
import java.util.*;

public class School implements ISchool {
    private static final Scanner input = new Scanner(System.in);
    public static final String PATH = "D:\\CODEGYM\\module_3\\module_3\\src\\ss20_code_fpt\\Lab6_Quoc_Dat\\Data\\sch.txt";


    @Override
    public void display() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);
            for (Student student : studentList) {
                System.out.println(student);
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

            for (Student student : studentList) {
                if (id.equals(student.getId())) {
                    System.out.println(student);
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

            for (Student student : studentList) {
                if (name.equals(student.getName())) {
                    System.out.println(student);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void add() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);
            studentList.add(this.info());
            writeCSV(studentList);
            System.out.println("adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sortByID() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);

            studentList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getId().compareTo(o2.getId());
                }
            });
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sortByName() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);

            studentList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sortByAverage() {
        try {
            List<Student> studentList = new ArrayList<>();
            readCSV(studentList);

            studentList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return Double.compare(o1.getAverage(), o2.getAverage());
                }
            });
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
