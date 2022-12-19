package final_exam.Service;

import final_exam.Models.SaveAccount;
import ss22_case_study.Models.Person.Employee;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAccountServiceImpl implements SaveAccountService {
    private Scanner input = new Scanner(System.in);

    @Override
    public void add() {
        try {
            List<SaveAccount> saveAccountList = new ArrayList<>();
            readCSV(saveAccountList);
            SaveAccount saveAccountAdd = this.infoSaveAccount();
            saveAccountList.add(saveAccountAdd);
            writeCSV(saveAccountList);
            System.out.println("Adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove() {
        System.out.println("enter the AccountCode you wanna remove: ");
        String accountCodeRemove = input.nextLine();
        int index = 0;
        boolean flag = false;
        try {
            List<SaveAccount> saveAccountList = new ArrayList<>();
            readCSV(saveAccountList);
            for (int i = 0; i < saveAccountList.size(); i++) {
                if (accountCodeRemove == saveAccountList.get(i).getAccountCode()) {
                    flag = true;
                    index = i;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                while (true) {
                    System.out.println("Do you wanna remove it");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("enter your choice: ");
                    int choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            saveAccountList.remove(index);
                            writeCSV(saveAccountList);
                            System.out.println("remove successfully!");
                            break;
                        case 2:
                            System.out.println("remove unsuccessfully!");
                            return;
                        default:
                            System.out.println("invalid");
                    }
                }
            } else {
                System.out.println("invalid");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void viewList() {
        try {
            List<SaveAccount> saveAccountList = new ArrayList<>();
            readCSV(saveAccountList);
            for (int i = 0; i < saveAccountList.size(); i++) {
                System.out.println("SaveAccount " + (i + 1) + ": " + saveAccountList.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search() {

    }

    private SaveAccount infoSaveAccount() {
        System.out.println("enter the accountId: ");
        int accountId = Integer.parseInt(input.nextLine());
        System.out.println("enter the accountCode: ");
        String accountCode = input.nextLine();
        System.out.println("enter the name: ");
        String name = input.nextLine();
        System.out.println("enter the creatDay: ");
        String createDay = input.nextLine();
        System.out.println("enter the amountSaveMoney: ");
        int amountSaveMoney = Integer.parseInt(input.nextLine());
        System.out.println("enter the day: ");
        String day = input.nextLine();
        System.out.println("enter the percentMoney: ");
        String percentMoney = input.nextLine();
        System.out.println("enter the month: ");
        String month = input.nextLine();
        SaveAccount saveAccount = new SaveAccount(accountId, accountCode, name, createDay, amountSaveMoney, day, percentMoney, month);
        return saveAccount;
    }

    private void readCSV(List<SaveAccount> saveAccountList) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\final_exam\\Data\\bank_accounts.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        SaveAccount saveAccount;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            int accountId = Integer.parseInt(temp[0]);
            String accountCode = temp[1];
            String name = temp[2];
            String createDay = temp[3];
            int amountSaveMoney = Integer.parseInt(temp[4]);
            String day = temp[5];
            String percentMoney = temp[6];
            String month = temp[7];

            saveAccount = new SaveAccount(accountId, accountCode, name, createDay, amountSaveMoney, day, percentMoney, month);
            saveAccountList.add(saveAccount);
        }
        br.close();
    }

    private void writeCSV(List<SaveAccount> saveAccountList) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\final_exam\\Data\\bank_accounts.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < saveAccountList.size(); i++) {
            bw.write(saveAccountList.get(i).infoWriteCSV());
            bw.write("\n");
        }
        bw.close();
    }

    private List<String> readRemoveCSV() throws IOException {
        List<String> arr = new ArrayList<>();
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\final_exam\\Data\\bank_accounts.csv");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        String temp[];
        String accountCodeRemove = null;
        int index = 0;
        while ((line = br.readLine()) != null) {
            int i = 0;
            temp = line.split(",");
            accountCodeRemove = temp[1];
            arr.add(accountCodeRemove);
            index = i;
            i++;
        }
        return arr;
    } // dont need
}

