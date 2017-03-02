package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Shell {
    public static void main(String[] args) {
        int[] data = RamdomNumberArray.setRamdomArray(50);

        long start = System.nanoTime();
        int[] sortData = shell(data);
        long end = System.nanoTime();

        System.out.println(" \nShell sort ");
        for (int i = 0; i < sortData.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");
    }

    public static int[] shell(int[] data) {

        for (int range = data.length / 2; range > 0; range /= 2) {
            // 間隔内での移動
            for (int h = 0; h < range; h++) {
                // ここから挿入法
                // ソート対象データは間隔ごとの要素になるのでループの増分値はi += range
                for (int i = h + range; i < data.length; i += range) {
                    int insertionData = data[i];
                    int j = i;
                    for (; j >= range && data[j - range] > insertionData; j -= range) {
                        data[j] = data[j - range];
                    }
                    data[j] = insertionData;
                }
            }
        }
        return data;
    }


}
