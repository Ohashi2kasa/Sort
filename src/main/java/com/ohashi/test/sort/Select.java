package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Select {
    public static void main(String[] args) {
        int[] data = RamdomNumberArray.setRamdomArray(50);
        long start = System.nanoTime();
        int[] sortData = select(data);
        long end = System.nanoTime();

        System.out.println(" \n選択ソート ");
        for (int i = 0; i < sortData.length; i++) {
            System.out.print(sortData[i] + " ");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");

    }

    public static int[] select(int[] data) {

        for (int i = 0; i < data.length; i++) {
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
        return data;
    }


}
