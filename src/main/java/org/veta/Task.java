package org.veta;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sortAndPrintArrays(n));
    }

    private static int[][] sortAndPrintArrays(int n) {
        Random random = new Random();
        int[][] result = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = random.nextInt();
            result[i] = fillAndSortArray(size, random);
        }
        return result;
    }

    private static int[] fillAndSortArray(int size, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
            if (size % 2 == 0) {
                Arrays.sort(array);
            } else {
                for (int j = 0; j < array.length; j++) {
                    int temp = array[j];
                    array[j] = array[array.length - j - 1];
                    array[array.length - j - 1] = temp;
                }
            }
        }
        return array;
    }
}


