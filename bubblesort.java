package com.lx.array;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
     int[] origin = new int[4];
     //用户输入数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < origin.length; i++) {
            int n = sc.nextInt();
            origin[i] = n;
        }
     // 比较 长度-1轮 每轮进行长度-1递减（i控制）次比较交换
        // 两个循环 外循环控制轮 内循环控制次数
        for (int j = 1; j < origin.length; j++) {
            for (int m = 0; m < origin.length-j; m++) {
                //内循环：从第一个数开始于之后的数相比 MAX函数
//                int a = Math.max(origin[m],origin[m+1] );
//                int b = Math.min(origin[m],origin[m+1] );
//                origin[m] = b;
//                origin[m+1] = a;
                if(origin[m] > origin[m+1]) {
                    int temp = origin[m];
                    origin[m] = origin[m+1];
                    origin[m+1] = temp;
                }
            }
        }
        // 输出数据
        for (int h = 0; h < origin.length; h++) {
            System.out.println(origin[h]);
        }

    }
}
