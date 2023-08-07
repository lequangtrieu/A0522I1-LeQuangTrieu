package com.example.case_study.model.contact;

import com.example.case_study.model.employee.Employee;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private LocalDate start_date;
    private LocalDate end_date;
    private double deposit;

//    @ManyToOne
//    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
//    private Employee employee;
    private int employee_id;

    private int customer_id;
    private int facility_id;
}
