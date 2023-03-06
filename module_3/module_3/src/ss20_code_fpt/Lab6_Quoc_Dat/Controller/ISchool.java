package ss20_code_fpt.Lab6_Quoc_Dat.Controller;

public interface ISchool {
    void display();

    void findById(String id);

    void findByName(String name);

    void add();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
