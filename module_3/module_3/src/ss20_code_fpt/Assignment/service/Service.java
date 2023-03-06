package ss20_code_fpt.Assignment.service;

import ss20_code_fpt.Assignment.Utils.Regex;
import ss20_code_fpt.Assignment.model.AdministrativeStaff;
import ss20_code_fpt.Assignment.model.DepartmentManager;
import ss20_code_fpt.Assignment.model.MarketingStaff;
import ss20_code_fpt.Assignment.model.Staff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Service implements IService {
//    private static final Scanner input = new Scanner(System.in);
    private static final List<Staff> list = new ArrayList<>();

    public static final String PATH = "D:\\CODEGYM\\module_3\\module_3\\src\\ss20_code_fpt\\Assignment\\data\\staff.txt";

    @Override
    public void readFile() {
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Staff staff = null;

            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                String staffType = temp[0];
                String id = temp[1];
                String name = temp[2];
                int age = Integer.parseInt(temp[3]);
                String address = temp[4];
                String email = temp[5];
                int salary = Integer.parseInt(temp[6]);

                switch (staffType) {
                    case "Administrative staff":
                        staff = new AdministrativeStaff(staffType, id, name, age, address, email, salary);
//                        list.add(staff);
                        break;
                    case "Marketing staff":
                        int sales = Integer.parseInt(temp[7]);
                        int commission = Integer.parseInt(temp[8]);
                        staff = new MarketingStaff(staffType, id, name, age, address, email, salary, sales, commission);
//                        list.add(staff);
                        break;
                    case "Department manager":
                        int managerSalary = Integer.parseInt(temp[7]);
                        staff = new DepartmentManager(staffType, id, name, age, address, email, salary, managerSalary);
//                        list.add(staff);
                        break;
                }
                list.add(staff);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("read file successfully!");
    }

    @Override
    public void display() {
        list.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return Integer.compare(o1.getIntegerId(o1.getId()), o2.getIntegerId(o2.getId()));
            }
        });
        for (Staff staff : list) {
            System.out.println(staff);
        }
    }

    @Override
    public void remove() {
        System.out.println("enter the idStaff you wanna remove");
        String id = Regex.inputId();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(id, list.get(i).getId())) {
                list.remove(i);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("removing successfully!");
        } else {
            System.out.println("the id is not exist");
        }
    }

    @Override
    public void update() {
        System.out.println("enter the idStaff you wanna update");
        String id = Regex.inputId();
        boolean flag = false;

        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                System.out.println("update information:");
                String name = Regex.inputName();
                int age = Regex.inputAge();
                String address = Regex.inputAddress();
                String email = Regex.inputEmail();
                System.out.println("salary");
                int salary = Regex.inputInteger();
                Staff staff = null;

                switch (list.get(i).getStaffType()) {
                    case "Administrative staff":
                        staff = new AdministrativeStaff(list.get(i).getStaffType(), id, name, age, address, email, salary);
                        break;
                    case "Marketing staff":
                        System.out.println("sales");
                        int sales = Regex.inputInteger();
                        System.out.println("commission");
                        int commission = Regex.inputInteger();
                        staff = new MarketingStaff(list.get(i).getStaffType(), id, name, age, address, email, salary, sales, commission);
                        break;
                    case "Department manager":
                        System.out.println("managerSalary");
                        int managerSalary = Regex.inputInteger();
                        staff = new DepartmentManager(list.get(i).getStaffType(), id, name, age, address, email, salary, managerSalary);
                        break;
                }
                list.set(i, staff);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("updating successfully!");
        } else {
            System.out.println("the id is not exist");
        }

    }

    @Override
    public void search() {
        System.out.println("enter the salary range you wanna find:");
        System.out.println("min");
        int minSalary = Regex.inputInteger();
        System.out.println("max");
        int maxSalary = Regex.inputInteger();

        for (Staff staff : list) {
            if (minSalary < staff.getSalary() && staff.getSalary() < maxSalary) {
                System.out.println(staff);
            }
        }
        System.out.println("finding successfully!");
    }

    @Override
    public void sort() {
        list.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
//                return o1.getName().compareTo(o2.getName());
//                int sort = o1.getName().compareTo(o2.getName());
                int sort = o1.getFirstName(o1.getName()).compareTo(o2.getFirstName(o2.getName()));
                if (sort == 0) {
                    return Integer.compare(o1.getSalary(), o2.getSalary());
                } else {
                    return sort;
                }
            }
        });
        this.display();
    }

    @Override
    public void inputStaff() {
        list.add(this.infoStaff());
        System.out.println("adding successfully!");
    }

    @Override
    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).infoWriteCSV());
                bw.write("\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("write file successfully!");
    }

    @Override
    public void displayThreeStaff() {
        list.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });

        List<Staff> staffList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (checkRetireAge(list.get(i).getAge())) {
                staffList.add(list.get(i));
            }
        }

        staffList.sort(new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return Integer.compare(o2.totalIncome(), o1.totalIncome());
            }
        });

        int count = 0;
        for (Staff staff : staffList) {
            System.out.println(staff);
            count++;
            if (count == 3) {
                break;
            }
        }
    }

    private Staff infoStaff() {
        String staffType = Regex.inputStaffType();
        String id = Regex.inputId();
        String name = Regex.inputName();
        int age = Regex.inputAge();
        String address = Regex.inputAddress();
        String email = Regex.inputEmail();
        System.out.println("enter salary:");
        int salary = Regex.inputInteger();
        Staff staff = null;

        switch (staffType) {
            case "Administrative staff":
                staff = new AdministrativeStaff(staffType, id, name, age, address, email, salary);
                break;
            case "Marketing staff":
                System.out.println("sales");
                int sales = Regex.inputInteger();
                System.out.println("commission");
                int commission = Regex.inputInteger();
                staff = new MarketingStaff(staffType, id, name, age, address, email, salary, sales, commission);
                break;
            case "Department manager":
                System.out.println("managerSalary");
                int managerSalary = Regex.inputInteger();
                staff = new DepartmentManager(staffType, id, name, age, address, email, salary, managerSalary);
                break;
        }
        return staff;
    }

    private boolean checkRetireAge(int age) {
        return age > 60;
    }
}
