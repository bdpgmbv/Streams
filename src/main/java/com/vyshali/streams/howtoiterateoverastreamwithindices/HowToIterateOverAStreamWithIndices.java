package com.vyshali.streams.howtoiterateoverastreamwithindices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToIterateOverAStreamWithIndices {

    public static final Logger logger = LoggerFactory.getLogger(HowToIterateOverAStreamWithIndices.class);

    public static void printEvenIndexedElement(List<String> list) {
        List<String> output = IntStream
                .range(0, list.size())
                .filter(e -> e%2!=0)
                .mapToObj(list::get)
                .toList();

        output.forEach(logger::info);
    }

    public static void main(String[] args) {
        printEvenIndexedElement(Arrays.asList("A", "B", "C", "D", "E", "F"));
    }
}
