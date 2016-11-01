package com.org3.excise4.collections;

import com.org3.excise4.collection.Student;

import java.util.*;

/**
 * Created by yiyp on 2016/11/1 0001.
 */
public class TestCollections {

    /**
     * Collections.sort()方法
     * 1. 对Integer泛型的List进行排序
     * 不能使用基本类型作为泛型，要使用相对应的包装类
     */
    public void testSort1() {
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);

            } while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加整数" + k);
        }

        System.out.println("----------------排序前--------------");
        for (Integer integer : integerList) {
            System.out.println("元素：" + integer);
        }
        Collections.sort(integerList);
        System.out.println("----------------排序后--------------");
        for (Integer integer : integerList) {
            System.out.println("元素：" + integer);
        }
    }

    /**
     * Collections.sort()方法
     * 2. 对String泛型的List进行排序
     */
    public void testSort2() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("lenovo");

        System.out.println("----------------排序前--------------");
        for (String string : stringList) {
            System.out.println("元素：" + string);
        }
        Collections.sort(stringList);
        System.out.println("----------------排序后--------------");
        for (String string : stringList) {
            System.out.println("元素：" + string);
        }
    }

    /**
     * 创建List<Sgring>之后，往其中添加十条随机字符串
     * 每条字符串的长度为10以内的随机数
     * 每条字符串的每个字符都为随机生成的字符，字符可以重复
     */
    public void exciseSort() {
        List<String> stringList = new ArrayList<String>();
        Random random = new Random();
        String allStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String str;
        for (int i = 0; i < 10; i++) {
            // 生成字符串的长度；1-10的随机整数
            int sbLen = random.nextInt(10) + 1;
            do{
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < sbLen; j++) {
                    sb.append(allStr.charAt(random.nextInt(allStr.length())));
                }
                // 转换成字符串并存储在str中
                str = sb.toString();
            } while (stringList.contains(str));
            stringList.add(str);
            System.out.println("将要添加字符串" + str);
        }

        System.out.println("----------------排序前--------------");
        for (String string : stringList) {
            System.out.println("字符串：" + string);
        }
        Collections.sort(stringList);
        System.out.println("----------------排序后--------------");
        for (String string : stringList) {
            System.out.println("字符串：" + string);
        }
    }

    /**
     * Collections.sort()方法
     * 3. 对其他类型的List进行排序，以student为例
     */
    public void testSort3() {
        List<Student> studentList = new ArrayList<Student>();
        Random random = new Random();
        studentList.add(new Student(random.nextInt(1000) + "", "Mike"));
        studentList.add(new Student(random.nextInt(1000) + "", "Angela"));
        studentList.add(new Student(random.nextInt(1000) + "", "Lucy"));
        studentList.add(new Student(10000 + "", "Beyonce"));

        System.out.println("----------------排序前--------------");
        for (Student student : studentList) {
            System.out.println("学生：" + student.id + ":" + student.name);
        }
        Collections.sort(studentList);
        System.out.println("----------------排序后--------------");
        for (Student student : studentList) {
            System.out.println("学生：" + student.id + ":" + student.name);
        }
        System.out.println("--------------按照姓名排序后--------------");
        Collections.sort(studentList, new StudentComparator());
        for (Student student : studentList) {
            System.out.println("学生：" + student.id + ":" + student.name);
        }
    }

    public static void main(String[] args) {
        TestCollections tc = new TestCollections();
        // tc.testSort1();
        // tc.testSort2();
        // tc.exciseSort();
        tc.testSort3();
    }

}
