package ss20_code_fpt.Week_6.Service;

public interface IService {
    void listAllStudent();

    void findById(String id);

    void findByName(String name);

    void addStudent();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
