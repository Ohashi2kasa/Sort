package com.ohashi.test.sort;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Insert {
    public static void main(String[] args) {
        int[] data = RamdomNumberArray.setRamdomArray(100);

        long start = System.nanoTime();
        int[] sortData = insert(data);
        long end = System.nanoTime();


        System.out.println(" \n挿入ソート ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");
    }
    public static int[] insert(int[] data) {
        for (int j = 1; j < data.length; j++) {
            int key = data[j];
            int i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }
}
