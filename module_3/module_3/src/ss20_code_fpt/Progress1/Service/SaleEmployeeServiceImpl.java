package ss20_code_fpt.Progress1.Service;

import ss20_code_fpt.Progress1.Model.SaleEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleEmployeeServiceImpl implements SaleEmployeeService {
    private static final Scanner input = new Scanner(System.in);

    private static List<SaleEmployee> list = new ArrayList<>();

    @Override
    public void input() {
        SaleEmployee saleEmployee = this.info();
        list.add(saleEmployee);
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
            System.out.println("this employee has same address with\n" + list.get(temp).toString());
        } else {
            System.out.println("this employee has not same the address with others");
        }
    }

    private SaleEmployee info() {
        System.out.println("name:");
        String name = input.nextLine();
        System.out.println("address:");
        String address = input.nextLine();
        System.out.println("age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("allowance:");
        double allowance = Double.parseDouble(input.nextLine());
        System.out.println("sales:");
        double sales = Double.parseDouble(input.nextLine());
        System.out.println("commission:");
        double commission = Double.parseDouble(input.nextLine());

        SaleEmployee saleEmployee = new SaleEmployee(name, address, age, allowance, sales, commission);
        return saleEmployee;
    }
}
