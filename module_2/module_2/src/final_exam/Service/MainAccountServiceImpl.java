package final_exam.Service;

import final_exam.Models.MainAccount;
import final_exam.Models.SaveAccount;
import ss21_code_fpt.prf192.Game_Xo_So.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAccountServiceImpl implements MainAccountService {
    private Scanner input = new Scanner(System.in);
    @Override
    public void add() {
        try {
            List<MainAccount> mainAccountList = new ArrayList<>();
            readCSV(mainAccountList);
            MainAccount mainAccount = this.infoMainAccount();
            mainAccountList.add(mainAccount);
            writeCSV(mainAccountList);
            System.out.println("Adding successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void remove() {

    }

    @Override
    public void viewList() {
        try {
            List<MainAccount> mainAccountList = new ArrayList<>();
            readCSV(mainAccountList);
            for (int i = 0; i < mainAccountList.size(); i++) {
                System.out.println("MainAccount " + (i+1) + ": " + mainAccountList.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void search() {

    }

    private MainAccount infoMainAccount() {
        System.out.println("enter the accountId: ");
        int accountId = Integer.parseInt(input.nextLine());
        System.out.println("enter the accountCode: ");
        String accountCode = input.nextLine();
        System.out.println("enter the name: ");
        String name = input.nextLine();
        System.out.println("enter the creatDay: ");
        String createDay = input.nextLine();
        System.out.println("enter the idCard: ");
        String idCard = input.nextLine();
        System.out.println("enter the moneyInCard: ");
        String moneyInCard = input.nextLine();

        MainAccount mainAccount = new MainAccount(accountId, accountCode, name, createDay, idCard, moneyInCard);
        return mainAccount;
    }

    private void readCSV(List<MainAccount> mainAccountList) throws IOException {
        FileReader fileReader = new FileReader("D:\\CODEGYM\\module_2\\module_2\\src\\final_exam\\Data\\bank_mainAccount.csv");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        String temp[];
        MainAccount mainAccount;

        while ((line = br.readLine()) != null) {
            temp = line.split(",");
            int accountId = Integer.parseInt(temp[0]);
            String accountCode = temp[1];
            String name = temp[2];
            String createDay = temp[3];
            String idCard = temp[4];
            String moneyInCard = temp[5];

            mainAccount = new MainAccount(accountId, accountCode, name, createDay, idCard, moneyInCard);
            mainAccountList.add(mainAccount);
        }
        br.close();
    }

    private void writeCSV(List<MainAccount> mainAccountList) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\CODEGYM\\module_2\\module_2\\src\\final_exam\\Data\\bank_mainAccount.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < mainAccountList.size(); i++) {
            bw.write(mainAccountList.get(i).infoWriteCSV());
            bw.write("\n");
        }
        bw.close();
    }
}
