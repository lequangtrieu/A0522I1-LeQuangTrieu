package ss20_code_fpt.Progress1.Service;

import ss20_code_fpt.Progress1.Model.OfficialEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficialEmployeeServiceImpl implements OfficialEmployeeService {
    private static final Scanner input = new Scanner(System.in);

    private static List<OfficialEmployee> list = new ArrayList<>();

    @Override
    public void input() {
        OfficialEmployee officialEmployee = this.info();
        list.add(officialEmployee);
        System.out.println("input successfully!");
    }

    @Override
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("display successful");
    }

    @Override
    public void checkAddress() {
        System.out.println("enter the index of employee you wanna check address with others");
        int index = Integer.parseInt(input.nextLine());
        boolean flag = false;
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(index).getAddress() == list.get(i).getAddress()) {
                flag = true;
                temp = i;
                break;
            }
        }

        if (flag) {
            System.out.println("this employee has same address with\n " + list.get(temp).toString());
        } else {
            System.out.println("this employee has not same the address with others");
        }
    }

    private OfficialEmployee info() {
        System.out.println("name:");
        String name = input.nextLine();
        System.out.println("address:");
        String address = input.nextLine();
        System.out.println("age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("basicSalary:");
        double basicSalary = Double.parseDouble(input.nextLine());
        System.out.println("levelSalary:");
        double levelSalary = Double.parseDouble(input.nextLine());

        OfficialEmployee officialEmployee = new OfficialEmployee(name, address, age, basicSalary, levelSalary);
        return officialEmployee;
    }
}
