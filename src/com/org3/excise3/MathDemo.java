package com.org3.excise3;

/**
 * Created by yiyp on 2016/10/28 0028.
 * 功能：定义一个包含 10 个元素的整型数组，通过随机产生 10 以内的随机数，给数组中的每个元素赋值，并输出结果。
 */
public class MathDemo {
    public static void main(String[] args) {

        // 定义一个整型数组，长度为10
        int[] nums = new int[10];

        //通过循环给数组赋值
        for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
            int x = (int)(Math.random()*10);

            nums[i] = x;// 为元素赋值
        }

        // 使用foreach循环输出数组中的元素
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
