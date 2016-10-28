package com.org1;

import java.util.Scanner;

/**
 * 功能： 计算班级学员平均分
 * Created by yyp on 2016/10/26 0026.
 */
public class ClassScore {
    public static void main(String[] args) {
        // 班级数量
        int classNum = 3;
        // 学生数量
        int stuNum = 4;
        // 成绩总和
        double sum = 0;
        // 成绩平均分
        double avg = 0;

        Scanner input = new Scanner(System.in);
        // 外层循环控制班级的数量
        for (int i = 1;i <= classNum; i++) {
            sum= 0;
            System.out.println("***请输入第" + i + "个班级的成绩***");
            // 内层循环控制每个班级的学生数量
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请输入第" + j + "个学员的成绩：");
                int score = input.nextInt();
                sum +=score;
            }
            avg = sum / stuNum;
            System.out.println("第" + i + "个班级学生的平均分为：" + avg);
        }

    }
}
