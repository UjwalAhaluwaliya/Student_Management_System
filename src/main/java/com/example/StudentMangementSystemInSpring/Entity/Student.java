package com.example.StudentMangementSystemInSpring.Entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    @Column
    private String name;
    @Column
    private String collegename;
    public Student(Long sid,String name,String collegename){
        super();
        this.sid=sid;
        this.name=name;
        this.collegename=collegename;
    }
    public Student(){
        super();
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}
