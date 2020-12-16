package com.katylaandrei.spring.springboot.simple_app.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "department_id")
    private String department_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String date_of_birth;

    public Employee() {
    }


}
