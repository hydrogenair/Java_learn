package com.lx.array;

public class compare {
    public static void main(String[] args) {
        int[] score = {15, 9000, 10000 ,20000 , 9500, -5};
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            max = Math.max(max,score[i]);
        }
        System.out.println(max);
    }
}
