package com.org3.excise2;

/**
 * Created by yiyp on 2016/10/28 0028.
 */
public class StringDemo3 {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

        // 出现次数
        int num = 0;
        byte[] b = s.getBytes();

        // 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
        for (int i = 0; i < s.length(); i++) {

            // 获取每个字符，判断是否是字符a
            if (b[i] == 'a') {
                // 累加统计次数
                num++;
            }
        }
        System.out.println("字符a出现的次数：" + num);
    }
}
