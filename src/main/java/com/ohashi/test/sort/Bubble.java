package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/13.
 */
public class Bubble {
    public static void main(String[] args) {

        int[] data = RamdomNumberArray.setRamdomArray(10000);

        long start = System.nanoTime();
        int[] sortData = bubble(data);
        long end = System.nanoTime();

        System.out.println(" \nBubble sort ");
        for (int k = 0; k < sortData.length; k++) {
            System.out.print(sortData[k] + " ");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");
    }

    public static int[] bubble(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < (data.length - 1) - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

}
