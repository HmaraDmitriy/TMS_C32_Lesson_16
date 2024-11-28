package com.teachmeskills.lesson_16.members;

import java.util.Objects;

public class Student {

    private String name ;
    private int id;  ;
    private String sex;
    private String status;

    public Student(String name, int id, String sex, String status) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(status, student.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, sex, status);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
