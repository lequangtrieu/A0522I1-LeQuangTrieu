package ss16_File.Example2;

import java.io.File;
import java.util.Scanner;

public class ExampleFile {
    File file;

    public ExampleFile(String fileName) {
        this.file = new File(fileName);
    }

    public boolean checkExecute() {
        return this.file.canExecute();
    }

    public boolean checkRead() {
        return this.file.canRead();
    }

    public boolean checkWrite() {
        return this.file.canWrite();
    }
    
    public void printLink() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void printName() {
        System.out.println(this.file.getName());
    }

    public void checkFolderOrFile() {
        if (this.file.isDirectory()) {
            System.out.println("this is a folder");
        } else if (this.file.isFile()) {
            System.out.println("this is a file");
        } else {
            System.out.println("not folder also not file");
        }
    }

    public void printSubFile() {
        if (this.file.isDirectory()) {
            System.out.println("all folder/ file is: ");
            File[] arr = this.file.listFiles();
            for (File file :
                    arr) {
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("this is a file, no data in it.");
        }
    }

    public void printFolderTree() {
        this.printDetail(this.file, 1);
    }

    public void printDetail(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.println("\t");
        }
        System.out.println("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] arr = f.listFiles();
            for (File file :
                    arr) {
                printDetail(file, level + 1);
            }
        }
    }


    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = -1;
        System.out.println("enter the name of file: ");
        String fileName = input.nextLine();
        ExampleFile exampleFile = new ExampleFile(fileName);

        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Check file execute: ");
            System.out.println("2. Check file read: ");
            System.out.println("3. Check file write: ");
            System.out.println("4. print the link: ");
            System.out.println("5. print the name of file: ");
            System.out.println("6. Check folder or file: ");
            System.out.println("7. print list sub file: ");
            System.out.println("8. print folder tree: ");
            System.out.println("0. Check file execute: ");
            System.out.println("enter choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    exampleFile.checkExecute(); break;
                case 2:
                    exampleFile.checkRead(); break;
                case 3:
                    exampleFile.checkWrite(); break;
                case 4:
                    exampleFile.printLink(); break;
                case 5:
                    exampleFile.printName(); break;
                case 6:
                    exampleFile.checkFolderOrFile(); break;
                case 7:
                    exampleFile.printSubFile(); break;
                case 8:
                    exampleFile.printFolderTree(); break;
                case 0:
                    System.exit(0);

            }
        }
    }
}
