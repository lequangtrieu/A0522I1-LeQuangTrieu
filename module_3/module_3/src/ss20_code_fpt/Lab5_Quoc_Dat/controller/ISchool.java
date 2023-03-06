package ss20_code_fpt.Lab5_Quoc_Dat.controller;

public interface ISchool {
    void display();

    void findById(String id);

    void findByName(String name);

    void add();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
