package com.org3.excise4.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 课程类
 * Created by yiyp on 2016/10/28 0028.
 */
public class Course {

    public String id;
    public String name;
    public Set<Course> courses;

    public Course() {}

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Course)) {
            return false;
        }
        Course course = (Course) obj;
        if (this.name == null) {
            if (course.name == null) {
                return true;
            } else {
                return false;
            }
        } else{
            if(this.name.equals(course.name)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
