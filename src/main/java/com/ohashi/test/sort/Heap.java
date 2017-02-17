package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/13.
 */
public class Heap {
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
    }
}
