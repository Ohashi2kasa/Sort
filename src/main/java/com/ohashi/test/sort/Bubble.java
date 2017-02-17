package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/13.
 */
public class Bubble {
    public static void main(String[] args) {
        int a = 20;
        int data[] = new int[a];

        for (int j = 0; j < a; j++) {
            Random ran = new Random();
            int num = ran.nextInt(30) + 1;
            data[j] = num;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < (data.length - 1) - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println(" \nBubble sort ");
        for (int k = 0; k < data.length; k++) {
            System.out.print(data[k] + " ");
        }
    }
}
