package com.nailsalon.booking.model;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_name")
    private String employeeName;

    public Employee(){
    }

    public Employee(String employeeName){
        this.employeeName = employeeName;
    }

    public Long getId(){
        return this.id;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
}
