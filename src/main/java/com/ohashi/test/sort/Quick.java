package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/13.
 */
public class Quick {
    public static void main(String[] args) {

        int a = 20;
        int data[] = new int[a];

        for (int j = 0; j < a; j++) {
            Random ran = new Random();
            int num = ran.nextInt(20) + 1;
            data[j] = num;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");

        }

        sort(data, 0, data.length - 1);

        System.out.println(" \nsort ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }

    public static void sort(int[] data, int left, int right) {
        if (left <= right) {
            // ピボットは中間
            int pivot = data[(left + right) / 2];
            int leftPointer = left;
            int rightPointer = right;

            while (leftPointer <= rightPointer) {//交差するまで

                while (data[leftPointer] < pivot) {//左から
                    leftPointer++;
                }

                while (data[rightPointer] > pivot) {//右から
                    rightPointer--;
                }

                if (leftPointer <= rightPointer) {
                    int tmp = data[leftPointer];
                    data[leftPointer] = data[rightPointer];
                    data[rightPointer] = tmp;
                    leftPointer++;
                    rightPointer--;
                }
            }
            // 再帰的
            sort(data, left, rightPointer);
            sort(data, leftPointer, right);

        }

    }


}

