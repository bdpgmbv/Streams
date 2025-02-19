package com.vyshali.streams.thejavastreamapitutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;
import java.util.Collection;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
import java.util.Random;
import java.util.regex.Pattern;

public class TheJavaStreamAPITutorial {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(TheJavaStreamAPITutorial.class);

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(logger::info);


        Collection<String> col = Arrays.asList("a", "b", "c", "d");
        Stream<String> streamOfACollection = col.stream();
        streamOfACollection.forEach(e -> logger.info("streamOfACollection: {}", e));


        Stream<String> streamFromAnArray = Stream.of("aa", "bb", "cc");
        streamFromAnArray.forEach(e -> logger.info("streamFromAnArray: {}", e));

        String[] arr = new String[]{"dd", "ee", "ff", "gg"};
        Stream<String> arrStreamFull = Arrays.stream(arr);
        Stream<String> arrStreamHalf = Arrays.stream(arr, 1, 2);
        arrStreamFull.forEach(e -> logger.info("arrStreamFull: {}", e));
        arrStreamHalf.forEach(e -> logger.info("arrStreamHalf: {}", e));


        Stream<String> streamFromBuilder = Stream.<String>builder()
                .add("aaa")
                .add("bbb")
                .add("ccc")
                .build();
        streamFromBuilder.forEach(e -> logger.info("streamFromBuilder: {}", e));


        Stream<String> streamFromGenerate = Stream.generate(() -> "element")
                .limit(5);
        streamFromGenerate.forEach(e -> logger.info("streamFromGenerate: {}", e));


        Stream<Integer> streamFromIterate = Stream.iterate(0, n -> n + 2)
                .limit(10);
        streamFromIterate.forEach(e -> logger.info("streamFromIterate: {}", e));


        IntStream streamOfInts = IntStream.range(0, 5);
        IntStream streamOfIntsClosed = IntStream.rangeClosed(0, 5);
        streamOfInts.forEach(e -> logger.info("streamOfInts: {}", e));
        streamOfIntsClosed.forEach(e -> logger.info("streamOfIntsClosed: {}", e));

        LongStream streamOfLongs = LongStream.range(6, 9);
        LongStream streamOfLongsClosed = LongStream.range(6, 9);
        streamOfLongs.forEach(e -> logger.info("streamOfLongs: {}", e));
        streamOfLongsClosed.forEach(e -> logger.info("streamOfLongsClosed: {}", e));

        Random random = new Random();
        DoubleStream doubleStreamFromRandom = random.doubles(3);
        IntStream intStreamFromRandom = random.ints(3);
        LongStream longStreamFromRandom = random.longs(3);
        doubleStreamFromRandom.forEach(e -> logger.info("doubleStreamFromRandom: {}", e));
        intStreamFromRandom.forEach(e -> logger.info("intStreamFromRandom: {}", e));
        longStreamFromRandom.forEach(e -> logger.info("longStreamFromRandom: {}", e));


        IntStream streamOfChars = "xyz".chars();
        Stream<String> streamFromString = Pattern.compile(", ").splitAsStream("xx, yy, zz");
        streamOfChars.forEach(e -> logger.info("streamOfChars: {}", e));
        streamFromString.forEach(e -> logger.info("streamFromString: {}", e));
    }
}
