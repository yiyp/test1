package com.org3.excise1;

/**
 * Created by yiyp on 2016/10/28 0028.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        /*TryCatchTest tct = new TryCatchTest();
        int result = tct.test();
        System.out.println("test()方法，执行完毕，返回值为：" + result);
        int result2 = tct.test2();
        System.out.println("test2()方法，执行完毕!");*/

        TryCatchTest tct = new TryCatchTest();
        int result3 = tct.test3();
        System.out.println("test3()方法，执行完毕!返回值为：" + result3);
    }

    /**
     * 除数为零的异常
     * @return
     */
    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result += 100/divider;
            }
            return result;
        }catch (Exception e) {
            // 在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();
            System.out.println("循环抛出异常了！");
            return -1;
        }
    }

    public int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result += 100/divider;
            }
            return result;
        } catch (Exception e) {
            // 在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();
            System.out.println("循环抛出异常了！");
            return result = 999;
        } finally {
            System.out.println("这是finally!！");
            System.out.println("result的值是！" + result);
        }
    }

    public int test3() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result += 100/divider;
            }
        } catch (Exception e) {
            // 在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();
            System.out.println("循环抛出异常了！");
        } finally {
            System.out.println("这是finally！");
            System.out.println("result的值是！" + result);
        }

        System.out.println("这是test3！运行完成！");
        return 1111;
    }
}
