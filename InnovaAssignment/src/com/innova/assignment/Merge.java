package com.innova.assignment;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge {
    public static Integer[] getMergedArray(Integer[] firstArray, Integer[] secondArray) {
        Integer firstArrayLength = firstArray.length;
        Integer secondArrayLength = secondArray.length;
        for (int i = secondArrayLength - 1; i >= 0; i--) {
            int j;
            int lastElement = firstArray[firstArrayLength - 1];
            for (j = firstArrayLength - 2; j >= 0 && firstArray[j] > secondArray[i]; j--)
                firstArray[j + 1] = firstArray[j];
            if (j != firstArrayLength - 2 || lastElement > secondArray[i]) {
                firstArray[j + 1] = secondArray[i];
                secondArray[i] = lastElement;
            }
        }
        return Stream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
                .toArray(Integer[]::new);
    }
}
