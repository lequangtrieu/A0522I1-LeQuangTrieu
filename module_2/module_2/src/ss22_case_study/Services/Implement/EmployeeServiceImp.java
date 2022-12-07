package ss22_case_study.Services.Implement;

import ss22_case_study.Models.Person.Employee;
import ss22_case_study.Services.EmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {

    public static final String FILEPATH = "D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\employee.csv";
    private static Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        try {
            List<Employee> employeeList = new ArrayList<>();
            readCSV(employeeList);
            Employee employeeAdd = this.infoEmployee();
            employeeList.add(employeeAdd);
            writeCSV(employeeList);
            System.out.println("Adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        try {
            List<Employee> employeeList = new ArrayList<>();
            readCSV(employeeList);
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println("Employee " + (i+1) + ": " + employeeList.get(i).displayEmployee());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editInfo() {
        try {
            List<Employee> employeeList = new ArrayList<>();
            readCSV(employeeList);
            System.out.println("enter the index you wanna edit the info of employee: ");
            int index_edit = Integer.parseInt(input.nextLine());
            System.out.println("please edit the info: ");
            employeeList.set(index_edit, this.infoEmployee());
            writeCSV(employeeList);
            System.out.println("Editing successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Employee infoEmployee() {
        System.out.println("enter the name: ");
        String name = input.nextLine();
        System.out.println("enter the birthday: ");
        String birthday = input.nextLine();
        System.out.println("enter the gender: ");
        String gender = input.nextLine();
        System.out.println("enter the identifyId: ");
        String identifyId = input.nextLine();
        System.out.println("enter the phoneNumber: ");
        String phoneNumber = input.nextLine();
        System.out.println("enter the email: ");
        String email = input.nextLine();
        System.out.println("enter the EmployeeId: ");
        int employeeId = Integer.parseInt(input.nextLine());
        System.out.println("enter the level: ");
        String level = input.nextLine();
        System.out.println("enter the position: ");
        String position = input.nextLine();
        System.out.println("enter the salary: ");
        int salary = Integer.parseInt(input.nextLine());
        Employee employee = new Employee(name, birthday, gender, identifyId, phoneNumber, email, employeeId, level, position, salary);
        return employee;
    }

    private void readCSV(List<Employee> employeeList) throws IOException {
        FileReader fileReader = new FileReader(FILEPATH);
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        Employee employee;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String name = temp[0];
            String birthday = temp[1];
            String gender = temp[2];
            String identifyId = temp[3];
            String phoneNumber = temp[4];
            String email = temp[5];
            int employeeId = Integer.parseInt(temp[6]);
            String level = temp[7];
            String position = temp[8];
            int salary = Integer.parseInt(temp[9]);
            employee = new Employee(name, birthday, gender, identifyId, phoneNumber, email, employeeId, level, position, salary);
            employeeList.add(employee);
        }
        br.close();
    }

    private void writeCSV(List<Employee> employeeList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILEPATH);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < employeeList.size(); i++) {
            bw.write(employeeList.get(i).toString());
            bw.write("\n");
        }
        bw.close();
    }
}
