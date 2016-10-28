package com.org1;

import java.util.Scanner;

/**
 * 加分及加分次数统计
 * Created by yyp on 2016/10/26 0026.
 */
public class Score {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner input = new Scanner(System.in);
        System.out.print("请输入考试成绩信息");

        int score = input.nextInt();
        int count = 0;
        System.out.println("加分前的成绩" + score);

        while(score < 60) {
            score++;
            count ++;
        }
        System.out.println("加分后的成绩" + score);
        System.out.println("总共加分" + count + "次！");
    }
}
