package com.ohashi.test.sort;

/**
 * Created by ohashi on 2017/03/01.
 */
public class SortTime {
    public static void main(String[] args) {
        int[] data = RamdomNumberArray.setRamdomArray(1000);

        long start = System.nanoTime();
        int[] sortData = Bubble.bubble(data);
        long end = System.nanoTime();
        System.out.println("\nBubble Time:" + (end - start) / 1000000f + "ms");

        long start1 = System.nanoTime();
        Quick.sort(data, 0, data.length - 1);
        long end1 = System.nanoTime();
        System.out.println("\nQuick Time:" + (end1 - start1) / 1000000f + "ms");

        long start2 = System.nanoTime();
        Marge.mergeSort(data);
        long end2 = System.nanoTime();
        System.out.println("\nMarge Time:" + (end2 - start2) / 1000000f + "ms");
    }
}
