package com.org3.excise4.collections;

import com.org3.excise4.collection.Student;

import java.util.Comparator;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
