package com.ohashi.test.sort;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Insert {
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

        for (int j = 1; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        System.out.println(" \n挿入ソート ");
        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i] + " ");
        }
    }
}
