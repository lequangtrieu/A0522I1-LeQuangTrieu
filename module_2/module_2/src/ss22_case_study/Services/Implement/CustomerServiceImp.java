package ss22_case_study.Services.Implement;

import ss22_case_study.Models.Person.Customer;
import ss22_case_study.Models.Person.Employee;
import ss22_case_study.Services.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService {
    private static Scanner input = new Scanner(System.in);
    @Override
    public void add() {
        try {
            List<Customer> customerList = new ArrayList<>();
            readCSV(customerList);
            Customer customerAdd = this.infoCustomer();
            customerList.add(customerAdd);
            writeCSV(customerList);
            System.out.println("Adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void display() {
        try {
            List<Customer> customerList = new ArrayList<>();
            readCSV(customerList);
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println("Customer " + (i+1) + ": " + customerList.get(i).displayCustomer());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editInfo() {
        try {
            List<Customer> customerList = new ArrayList<>();
            readCSV(customerList);
            System.out.println("enter the index you wanna edit the info of employee: ");
            int index_edit = Integer.parseInt(input.nextLine());
            System.out.println("please edit the info: ");
            customerList.set(index_edit, this.infoCustomer());
            writeCSV(customerList);
            System.out.println("Editing successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Customer infoCustomer() {
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
        System.out.println("enter the CustomerId: ");
        int customerId = Integer.parseInt(input.nextLine());
        System.out.println("enter the CustomerType: ");
        String customerType = input.nextLine();
        System.out.println("enter the address: ");
        String address = input.nextLine();
        Customer customer = new Customer(name, birthday, gender, identifyId, phoneNumber, email, customerId, customerType, address);
        return customer;
    }

    private void readCSV(List<Customer> customerList) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\customer.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        Customer customer;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            String name = temp[0];
            String birthday = temp[1];
            String gender = temp[2];
            String identifyId = temp[3];
            String phoneNumber = temp[4];
            String email = temp[5];
            int customerId = Integer.parseInt(temp[6]);
            String customerType = temp[7];
            String address = temp[8];
            customer = new Customer(name, birthday, gender, identifyId, phoneNumber, email, customerId, customerType, address);
            customerList.add(customer);
        }
        br.close();
    }

    private void writeCSV(List<Customer> customerList) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\ss22_case_study\\Data\\customer.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < customerList.size(); i++) {
            bw.write(customerList.get(i).toString());
            bw.write("\n");
        }
        bw.close();
    }

}
