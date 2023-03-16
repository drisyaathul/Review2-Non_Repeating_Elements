package com.bridgelabz;

import java.util.Arrays;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 30, 50, 20, 10, 20};
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(array[i]);
            }
        }
    }
}

