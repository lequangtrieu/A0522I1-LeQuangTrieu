package Services.Implement;

import Data.Repository.EmployeeRepository;
import Data.Repository.EmployeeRepositoryImp;
import Models.Person.Employee;
import Services.EmployeeService;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService{
    private static final Scanner input = new Scanner(System.in);
    private static final EmployeeRepository employeeRepository = new EmployeeRepositoryImp();

    @Override
    public void add() {
        String file ="D:\\CODEGYM\\module_2\\module_2\\FuramaResort\\src\\Data\\SaveData\\employee.csv";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


//            Employee employee = this.infoEmployee();
//            employeeRepository.addEmployee(employee);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void display() {
        String file ="D:\\CODEGYM\\module_2\\module_2\\FuramaResort\\src\\Data\\SaveData\\employee.csv";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editInfo() {

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
}
