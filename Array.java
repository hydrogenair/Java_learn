package com.lx.s3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a;
        a= new int[] {100,120,123};
        //for each
        for(int element :a){
            System.out.println(element);
        }

        //数组随机排序
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k=sc.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n=sc.nextInt();
        //先构造一个数组存入1-n的数字

        int[] numbers=new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]=i+1;
        }

        int[] result =new int[k];
        for (int i = 0; i < result.length; i++) {
            int r=(int)(Math.random()*n);//(0,1)随机生成
            result[i]=numbers[r];

            //为了避免不重复生成数据
            //用最后一个元素覆盖(用不同的数覆盖） ---生成随机数据 /打乱排序
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        for (int element:result) {
            System.out.println(element);
        }
    }
}
