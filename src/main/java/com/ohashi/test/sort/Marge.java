package com.ohashi.test.sort;

/**
 * Created by ohashi on 2017/02/16.
 */
public class Marge {
    public static void main(String[] args) {

        int[] data = RamdomNumberArray.setRamdomArray(50);

        long start = System.nanoTime();
        int[] sortData = mergeSort(data);
        long end = System.nanoTime();

        System.out.println(" \nMarge sort ");
        for (int k = 0; k < sortData.length; k++) {
            System.out.print(sortData[k] + " ");
        }
        System.out.println("\nTime:" + (end - start) / 1000000f + "ms");

    }

    public static int[] merge(int[] a1,int[] a2,int[] a){
        int i=0,j=0;
        while(i<a1.length || j<a2.length){
            if(j>=a2.length || (i<a1.length && a1[i]<a2[j])){
                a[i+j]=a1[i];
                i++;
            }
            else{
                a[i+j]=a2[j];
                j++;
            }
        }
        return a;
    }
    public static int[] mergeSort(int[] a){
        if(a.length>1){
            int m=a.length/2;
            int n=a.length-m;
            int[] a1=new int[m];
            int[] a2=new int[n];
            for(int i=0;i<m;i++) a1[i]=a[i];
            for(int i=0;i<n;i++) a2[i]=a[m+i];
            mergeSort(a1);
            mergeSort(a2);
            merge(a1,a2,a);
        }

        return a;
    }
}
