package ss20_code_fpt.Week_5.Service;

import ss20_code_fpt.Week_5.Model.Student;

import java.util.List;

public interface IService {
    void listAllStudent();

    void findById(String id);

    void findByName(String name);

    void addStudent();

    void sortByID();

    void sortByName();

    void sortByAverage();
}
