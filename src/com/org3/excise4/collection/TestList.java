package com.org3.excise4.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yiyp on 2016/10/28 0028.
 */
public class TestList {

    /**
     * 用于存放备选课程的List
     */
    public List coursesToSelect;

    public TestList() {
        this.coursesToSelect = new ArrayList();
    }

    public void testAdd() {
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course)coursesToSelect.get(0);
        System.out.println("添加了课程："+ temp.id + "." + temp.name + "！");

        Course cr2 = new Course("2", "Java编程");
        coursesToSelect.add(0, cr2);
        Course temp2 = (Course)coursesToSelect.get(0);
        System.out.println("添加了课程："+ temp2.id + "." + temp2.name + "！");

        /*// 一下方法会抛出数组下标越界异常
        Course cr3 = new Course("3", "test");
        coursesToSelect.add(4, cr3);
        Course temp3 = (Course)coursesToSelect.get(0);
        System.out.println("添加了课程："+ temp3.id + "." + temp3.name + "！");*/

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course)coursesToSelect.get(2);
        Course temp4 = (Course)coursesToSelect.get(3);
        System.out.println("添加了两门课程："+ temp3.id + "." + temp3.name + "！" + temp4.id + "." + temp4.name + "！");

        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "编译语言")};
        coursesToSelect.addAll(2, Arrays.asList(course2));
        Course temp5 = (Course)coursesToSelect.get(2);
        Course temp6 = (Course)coursesToSelect.get(3);
        System.out.println("添加了两门课程："+ temp5.id + "." + temp5.name + "！" + temp6.id + "." + temp6.name + "！");
    }

    /**
     * 取的List中的元素方法
     */
    public void testGet() {
        int size = coursesToSelect.size();
        for (int i = 0; i < size; i++) {
            Course cr = (Course)coursesToSelect.get(i);
            System.out.println("课程：" + cr.id + cr.name);
        }
    }

    /**
     * 通过迭代器来遍历List
     */
    public void testIterator() {
        Iterator it = coursesToSelect.iterator();
        System.out.println("有如下课程待选(迭代器)：");
        while (it.hasNext()) {
            Course cr = (Course)it.next();
            System.out.println("课程："+ cr.id + "." + cr.name );
        }
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

    /**
     * 修改List中的元素
     */
    public void testModify() {
        coursesToSelect.set(4, new Course("7", "毛概"));
    }

    /**
     * 删除List中的元素
     */
    public void testRemove() {
        /*// Course cr = (Course)coursesToSelect.get(4);
        // System.out.println("我是课程：" + cr.id + "." + cr.name + "我即将被删除！");
        // coursesToSelect.remove(cr);

        System.out.println("即将删除四位置上的课程！");
        coursesToSelect.remove(4);
        System.out.println("成功删除课程！");
        testForEach();*/

        System.out.println("即将删除四位置和五位置上的课程！");
        Course [] courses = {(Course)coursesToSelect.get(4), (Course)coursesToSelect.get(5)};
        coursesToSelect.removeAll(Arrays.asList(courses));
        System.out.println("成功删除课程！");
        testForEach();
    }

    /**
     * 往List中添加一些奇怪的东西
     */
    public void testType() {
        System.out.println("能否往List中添加一些奇怪的东西呢？");
        coursesToSelect.add("我不是课程，我只是一个字符串！");
    }

    public static void main(String[] args) {
        TestList lt = new TestList();
        lt.testAdd();
        lt.testType();
        lt.testForEach();
        // lt.testGet();
        // lt.testIterator();
        // lt.testForEach();
        // lt.testModify();
        // lt.testForEach();
        // lt.testRemove();
    }
}
