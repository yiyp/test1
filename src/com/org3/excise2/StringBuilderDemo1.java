package com.org3.excise2;

/**
 * Created by yiyp on 2016/10/28 0028.
 * 功能：将一个由英文字母组成的字符串转换成指定格式---从右边开始每三个字母用逗号分隔的形式。
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象
        StringBuilder str = new StringBuilder();

        // 追加字符串
        str.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for(int i = str.length()-3; i >= 0; i -= 3) {
            str.insert(i, ",");
        }

        // 将StringBuilder对象转换为String对象并输出
        System.out.print(str.toString());
    }
}
