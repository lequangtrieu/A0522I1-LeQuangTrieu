package ss20_code_fpt.Lab5.Service;

public interface ISchool {
    void listAllStudent();

    void findById(String id);

    void findByName(String name);

    void addStudent();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
