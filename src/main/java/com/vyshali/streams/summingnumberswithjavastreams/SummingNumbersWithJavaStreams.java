package com.vyshali.streams.summingnumberswithjavastreams;

import java.util.Arrays;
import java.util.List;

public class SummingNumbersWithJavaStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        int sumFromExistingFunc = list.stream()
                .reduce(0, Integer::sum);

        int sumFromCustomFunc = list.stream()
                .reduce(0, ArithemeticUtils::sum);
    }
}
