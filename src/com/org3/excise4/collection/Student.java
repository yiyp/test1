package com.org3.excise4.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 * Created by yiyp on 2016/10/28 0028.
 */
public class Student implements Comparable<Student> {
    public String id;
    public String name;
    public Set<Course> courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
