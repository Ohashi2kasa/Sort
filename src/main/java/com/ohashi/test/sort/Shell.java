package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Shell {
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
        System.out.println(" \nShell sort ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
