package ss24_su23_fpt.ss4_count_base_programing.view;

import ss24_su23_fpt.ss4_count_base_programing.util.Regex;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<S> {
    private final Scanner sc = new Scanner(System.in);
    private final String title;
    private ArrayList<String> option = new ArrayList<>();


    public Menu(String title, String[] option) {
        this.title = title;
        this.option = new ArrayList<>();
        for (String op : option) {
            this.option.add((String) op);
        }
    }

    public void MenuDisplay() {
        System.out.println("__________________________");
        System.out.println(title);
        System.out.println("__________________________");
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i + 1) + ". " + option.get(i));
        }
    }

    public int getChoice() {
        MenuDisplay();
        return Regex.inputNum();
    }

    public abstract void execute(int n) throws Exception;

    public void run() throws Exception {
        while (true) {
            int n = getChoice();
            execute(n);
            if (n > option.size() - 1 || n < 0) {
                break;
            }
        }
    }
}
