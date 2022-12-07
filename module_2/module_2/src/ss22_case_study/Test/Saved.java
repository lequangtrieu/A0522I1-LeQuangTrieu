package ss22_case_study.Test;

import ss22_case_study.Models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Saved {
//    private void add() {
//        try {
//            List<Employee> employeeList = new ArrayList<>();
//            File file = new File(FILEPATH);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader br = new BufferedReader(fileReader);
//            String line;
//            String temp[];
//            Employee employee;
//
//            while ((line = br.readLine()) != null) {
//                temp = line.split(",");
//                String name = temp[0];
//                String birthday = temp[1];
//                String gender = temp[2];
//                String identifyId = temp[3];
//                String phoneNumber = temp[4];
//                String email = temp[5];
//                int employeeId = Integer.parseInt(temp[6]);
//                String level = temp[7];
//                String position = temp[8];
//                int salary = Integer.parseInt(temp[9]);
//                employee = new Employee(name, birthday, gender, identifyId, phoneNumber, email, employeeId, level, position, salary);
//                employeeList.add(employee);
//            }
//            br.close();
//
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fileWriter);
//            Employee employeeAdd = this.infoEmployee();
//            employeeList.add(employeeAdd);
//            for (int i = 0; i < employeeList.size(); i++) {
////                bw.write(employeeList.get(i).getName() + ", " + employeeList.get(i).getBirthday() + ", " + employeeList.get(i).getGender() + ", " + employeeList.get(i).getIdentifyId() + ", " + employeeList.get(i).getPhoneNumber() + ", " + employeeList.get(i).getEmail() + ", " + employeeList.get(i).getEmployeeId() + ", " + employeeList.get(i).getLevel() + ", " + employeeList.get(i).getPosition() + ", " + employeeList.get(i).getSalary());
//                bw.write(employeeList.get(i).toString());
//                bw.write("\n");
//            }
//            bw.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
