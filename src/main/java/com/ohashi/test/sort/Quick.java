package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/13.
 */
public class Quick {
    public static void main(String[] args) {

        int[] data = RamdomNumberArray.setRamdomArray(100);
        long start = System.nanoTime();
        int[] sortData = sort(data, 0, data.length - 1);
        long end = System.nanoTime();

        System.out.println(" \nQuick sort ");
        for (int i = 0; i < sortData.length; i++) {
            System.out.print(sortData[i] + ",");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");
    }

    public static int[] sort(int[] data, int left, int right) {
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
        return data;

    }


}

