package com.org1;
import java.util.Arrays;

/**
 * Created by yyp on 2016/10/26 0026.
 */

public class HelloWorld {

    //��� main ����
    public static void main(String[] args) {

        int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
        HelloWorld hello = new HelloWorld();
        hello.getScores(scores);

    }

    //���巽����ɳɼ��������ǰ�����Ĺ���

    public void getScores(int[] scorese) {
        int[] scores = scorese;
        int num = 0;
        Arrays.sort(scorese);
        for (int i = scores.length - 1; i >= 0; i--) {
            if(scores[i] < 0 || scores[i] > 100) {
                continue;
            }
            num++;
            if(num > 3) {
                break;
            }

            System.out.println(scores[i]);
        }


    }








}