package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Marge {
    public static void main(String[] args) {
        int a = 4;
        int data[] = new int[a];

        for (int j = 0; j < a; j++) {
            Random ran = new Random();
            int num = ran.nextInt(20) + 1;
            data[j] = num;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }

        int b = data.length / 2 - 1;
        while (b == 1) {
            if (data[0] > data[b]) {
                int tmp = data[b];
                data[b] = data[0];
                data[0] = tmp;
            }
            if (data[b + 1] > data[3]) {
                int tmp = data[3];
                data[3] = data[2];
                data[2] = tmp;
            }
            int margeData[] = new int[a];
            if (data[0] > data[2]) {

                margeData[0] = data[2];
            } else {
                margeData[0] = data[0];
            }
            if (data[0] > data[3]) {
                margeData[1] = data[3];
            }


        }
    }}
