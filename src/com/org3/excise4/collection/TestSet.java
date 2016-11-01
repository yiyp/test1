package com.org3.excise4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yiyp on 2016/10/31 0031.
 */
public class TestSet {
    public List<Course> coursesToSelect;
    private Scanner input;
    public Student student;

    public TestSet() {
        coursesToSelect = new ArrayList<Course>();
        input = new Scanner(System.in);
    }

    public void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course)coursesToSelect.get(0);
        // System.out.println("添加了课程："+ temp.id + "." + temp.name + "！");

        Course cr2 = new Course("2", "Java编程");
        coursesToSelect.add(0, cr2);
        Course temp2 = (Course)coursesToSelect.get(0);
        // System.out.println("添加了课程："+ temp2.id + "." + temp2.name + "！");

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course)coursesToSelect.get(2);
        Course temp4 = (Course)coursesToSelect.get(3);
        // System.out.println("添加了两门课程："+ temp3.id + "." + temp3.name + "！" + temp4.id + "." + temp4.name + "！");

        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "编译语言")};
        coursesToSelect.addAll(2, Arrays.asList(course2));
        Course temp5 = (Course)coursesToSelect.get(2);
        Course temp6 = (Course)coursesToSelect.get(3);
        // System.out.println("添加了两门课程："+ temp5.id + "." + temp5.name + "！" + temp6.id + "." + temp6.name + "！");
    }

    /**
     * 通过for each来访问集合元素
     */
    public void testForEach() {
        System.out.println("有如下课程待选(for each)：");
        for (Object obj : coursesToSelect) {
            Course cr = (Course)obj;
            System.out.println("课程："+ cr.id + "." + cr.name );
        }
    }

    public void testForEachForSet(Student student) {
        // 打印出学生所选的课程
        System.out.println("共选择了：" + student.courses.size() + "门课程！");
        for (Course cr : student.courses) {
             System.out.println("选择了课程：" + cr.id + "，" + cr.name);
         }
    }

    /**
     * 测试list的contains方法
     */
    public void testListContains() {
        Course course = coursesToSelect.get(0);
        System.out.println("取得课程：" + course.name);
        System.out.println("备选课程中是否包含课程：" + course.name + "，" + coursesToSelect.contains(course));
        System.out.println("请输入课程名称：");
        String name = input.next();

        // 创建一个新的课程对象，ID和名称与course对象完全一样
        Course course2 = new Course();
        course2.name = name;
        System.out.println("新创建课程：" + course2.name);
        System.out.println("备选课程中是否包含课程：" + course2.name + "，" + coursesToSelect.contains(course2));

        if (coursesToSelect.contains(course2)) {
            System.out.println("课程：" + course2.name + "的索引位置为："
                    + coursesToSelect.indexOf(course2));
        }
    }

    /**
     * 创建学生对象并选课
     */
    public void createStudentAndSelectCours() {

        // 创建一个学生对象
        student = new Student("1", "小明");
        System.out.println("欢迎学生：" + student.name + "选课！");


        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String courseId = input.next();
            for (Course cr : coursesToSelect) {
                if (cr.id.equals(courseId)) {
                    student.courses.add(cr);

                    // Set中，添加某个元素对象，无论添加多少次，
                    // 最终只会保留一个该对象(的引用)
                    // 并且，保留的第一次添加的那一个
                    // 可以添加空对象，但无意义
                    // student.courses.add(null);
                    // student.courses.add(cr);
                }
            }

        }

        // 打印出学生所选的课程
        // for (Course cr : student.courses) {
        //     System.out.println("选择了课程：" + cr.id + "，" + cr.name);
        // }
    }

    /**
     * 测试Set的contains方法
     */
    public void testSetContains() {
        System.out.println("请输入学生已选的课程名称");
        String name = input.next();

        // 创建一个新的课程对象，ID和名称与course对象完全一样
        Course course2 = new Course();
        course2.name = name;
        System.out.println("新创建课程：" + course2.name);
        System.out.println("备选课程中是否包含课程：" + course2.name + "，" + student.courses.contains(course2));

    }

    public static void main(String[] args) {
        /*
        TestSet ts = new TestSet();
        st.testAdd();
        st.testForEach();

        // 创建一个学生对象
        Student student = new Student("1", "小明");
        System.out.println("欢迎学生：" + student.name + "选课！");

        // 创建一个Scanner对象，接收课程ID
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入课程ID");
            String courseId = input.next();
            for (Course cr : st.coursesToSelect) {
                if (cr.id.equals(courseId)) {
                    student.courses.add(cr);

                    // Set中，添加某个元素对象，无论添加多少次，
                    // 最终只会保留一个该对象(的引用)
                    // 并且，保留的第一次添加的那一个
                    // 可以添加空对象，但无意义
                    // student.courses.add(null);
                    // student.courses.add(cr);
                }
            }

        }

        // 打印出学生所选的课程
        // for (Course cr : student.courses) {
        //     System.out.println("选择了课程：" + cr.id + "，" + cr.name);
        // }

        st.testForEachForSet(student);*/

        TestSet ts = new TestSet();
        ts.testAdd();
        ts.testListContains();
        ts.testForEach();

        /*TestSet ts = new TestSet();
        ts.testAdd();
        ts.testForEach();
        ts.createStudentAndSelectCours();
        ts.testSetContains();*/

    }
}
