package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Select {
    public static void main(String[] args) {
        int a = 20;
        int data[] = new int[a];

        for (int j = 0; j < a; j++) {
            Random ran = new Random();
            int num = ran.nextInt(20) + 1;
            data[j] = num;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < data.length ; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }
        System.out.println(" \n選択ソート ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
