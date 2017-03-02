package com.ohashi.test.sort;

import java.util.Random;

/**
 * Created by ohashi on 2017/03/01.
 */
public class RamdomNumberArray {
    public static int[] setRamdomArray(int elementCount) {

        int[] data = new int[elementCount];

        for (int j = 0; j < data.length; j++) {
            Random ran = new Random();
            int num = ran.nextInt(elementCount) + 1;
            data[j] = num;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        return data;
    }


}
