package com.lx.array;

import java.util.Random;
import java.util.Scanner;

public class randomrank {
    public static void main(String[] args) {
        int[] data = new int[5];
        //数组存数
        Scanner sc = new Scanner(System.in);
        for (int m = 0; m < data.length; m++) {
          //录入数据
            data[m] = sc.nextInt();
        }
        //生成随机数使当前随机数与每个位置的索引交换 用交换器
        Random r = new Random();
        //遍历data中的数据
        for (int i = 0; i < data.length; i++) {
            int h = r.nextInt(data.length);
          //交换器
            int a = data [h];
            data[h] = data[i];
            data[i] = a;
        }
        //输出数据
        for (int j = 0; j < data.length; j++) {
            System.out.println(data[j]);
        }


    }
}
