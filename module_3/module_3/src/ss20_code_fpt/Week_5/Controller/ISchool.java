package ss20_code_fpt.Week_5.Controller;

public interface ISchool {
    void listAllStudent();

    void findById(String id);

    void findByName(String name);

    void addStudent();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
