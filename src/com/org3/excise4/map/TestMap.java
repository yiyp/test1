package com.org3.excise4.map;

import com.org3.excise4.collection.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by yiyp on 2016/10/31 0031.
 */
public class TestMap {

    /**
     * 用来承装学生类型对象
     */
    public Map<String, Student> students;

    /**
     * 在构造器中初始化students
     */
    public TestMap() {
        this.students = new HashMap<String, Student>();
    }

    /**
     * 测试添加
     */
    public void testPut() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID：");
            String ID = input.next();

            // 判断该ID是否被占用
            Student st = students.get(ID);
            if (st == null) {
                // 提示学生姓名
                System.out.println("请输入学生姓名：");
                String name = input.next();
                Student newStudent = new Student(ID, name);

                //通过调用students的方法，添加ID-学生映射
                students.put(ID, newStudent);
                System.out.println("成功添加学生：" + students.get(ID).name);
                i++;
            } else {
                System.out.println("该学生的ID已被占用");
                continue;
            }
        }
    }

    /**
     * 测试Map的keySet方法
     */
    public void testKeySet() {
        Set<String> keySet = students.keySet();
        System.out.println("总共有：" + students.size() + "个学生！");
        for (String stuId : keySet) {
            Student st = students.get(stuId);
            if (st != null) {
                System.out.println("学生：" + st.name);
            }
        }

    }

    /**
     * 测试Map中的映射
     */
    public void testRemove() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除的学生ID");
            String ID = input.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("该ID不存在！");
                continue;
            }
            students.remove(ID);
            System.out.println("成功删除学生：" + st.name);
            break;
        }
    }

    /**
     * 通过entrySet方法来遍历Map
     */
    public void testEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            System.out.println("取得键：" + entry.getKey());
            System.out.println("取得对应的值为：" + entry.getValue());
        }
    }


    /**
     * 修改
     */
    public void testModify() {
        System.out.println("请输入要修改的学生ID!");
        Scanner input = new Scanner(System.in);
        while (true) {
            String stuId = input.next();
            Student student = students.get(stuId);
            if (student == null) {
                System.out.println("该ID不存在！请重新输入！");
                continue;
            }

            System.out.println("当前该学生ID对应的学生为：" + student.name);
            System.out.println("请输入新的学生姓名：" );
            String name = input.next();
            Student newStudent = new Student(stuId, name);
            students.put(stuId, newStudent);
            System.out.println("修改成功！");
            break;
        }
    }

    public static void main(String[] args) {
        TestMap tm = new TestMap();
        tm.testPut();
        tm.testKeySet();
        // tm.testRemove();
        // tm.testEntrySet();
        tm.testModify();
        tm.testEntrySet();
    }
}
