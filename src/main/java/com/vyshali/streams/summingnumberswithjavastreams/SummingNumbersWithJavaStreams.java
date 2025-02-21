package com.vyshali.streams.summingnumberswithjavastreams;

import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import org.slf4j.Logger;


public class SummingNumbersWithJavaStreams {
    private static final Logger log = LoggerFactory.getLogger(SummingNumbersWithJavaStreams.class);

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(SummingNumbersWithJavaStreams.class);

        // 2. Using Stream.reduce()

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Integer sumWithLambdaExpression = list.stream()
                .reduce(0, (a, b) -> a + b);
        logger.info("sumWithLambdaExpression: {}", sumWithLambdaExpression);


        Integer sumFromExistingFunc = list.stream()
                .reduce(0, Integer::sum);
        logger.info("sumFromExistingFunc: {}", sumFromExistingFunc);


        Integer sumFromCustomFunc = list.stream()
                .reduce(0, ArithemeticUtils::sum);
        logger.info("sumFromCustomFunc: {}", sumFromCustomFunc);


        // 3. Using Stream.collect()

        Integer sumFromCollectorsSummingIntIntValue = list.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        logger.info("sumFromCollectorsSummingIntIntValue: {}", sumFromCollectorsSummingIntIntValue);

        Integer sumFromCollectorsSummingIntValueOf = list.stream()
                .collect(Collectors.summingInt(Integer::valueOf));
        logger.info("sumFromCollectorsSummingIntValueOf: {}", sumFromCollectorsSummingIntValueOf);


        // 4. Using IntStream.sum()

        Integer sumFromIntStreamIntValue = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        logger.info("sumFromIntStreamIntValue: {}", sumFromIntStreamIntValue);

        Integer sumFromIntStreamValueOf = list.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        logger.info("sumFromIntStreamValueOf: {}", sumFromIntStreamValueOf);


        // 5. Using Stream#sum With Map

        Map<String, Integer> hm = Map.of("a", 1, "b", 11, "c", 121);

        Integer sumOfMapValues = hm.values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        logger.info("sumOfMapValues: {}", sumOfMapValues);

        Integer sumOfMapValuesValueOf = hm.values()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum();
        logger.info("sumOfMapValuesValueOf: {}", sumOfMapValuesValueOf);

        // 6. Using Stream#sum With Objects

        Item item1 = new Item(1, 11);
        Item item2 = new Item(2, 22);
        Item item3 = new Item(3, 33);
        Item item4 = new Item(4, 44);

        List<Item> items = Arrays.asList(item1, item2, item3, item4);

        int sumOfPriceWithReduceLambda = items.stream()
                .map(Item::getPrice)
                .reduce(0, (a,b) -> a + b);
        logger.info("sumOfPriceWithReduceLambda: {}", sumOfPriceWithReduceLambda);


        int sumOfPriceWithReduceFunction = items.stream()
                .map(Item::getPrice)
                .reduce(0, Integer::sum);
        logger.info("sumOfPriceWithReduceFunction: {}", sumOfPriceWithReduceFunction);

        int sumOfPriceWithReduceCustomFunc = items.stream()
                .map(Item::getPrice)
                .reduce(0, ArithemeticUtils::sum);
        logger.info("sumOfPriceWithReduceCustomFunc: {}", sumOfPriceWithReduceCustomFunc);

        int sumOfPriceWithCollect = items.stream()
                .map(Item::getPrice)
                .collect(Collectors.summingInt(Integer::intValue));
        logger.info("sumOfPriceWithCollect: {}", sumOfPriceWithCollect);

        int sumOfPriceWithCollectValueOf = items.stream()
                .map(Item::getPrice)
                .collect(Collectors.summingInt(Integer::valueOf));
        logger.info("sumOfPriceWithCollectValueOf: {}", sumOfPriceWithCollectValueOf);

        int sumOfPriceWithMapToInt = items.stream()
                .mapToInt(Item::getPrice)
                .sum();
        logger.info("sumOfPriceWithMapToInt: {}", sumOfPriceWithMapToInt);

        // 7. Using Stream#sum With String

        String sampleString = "Item1 10 Item2 11 Item3 12 Item4 13";
        int sumFromString = Arrays.stream(sampleString.split(" "))
                .filter(s -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();
        logger.info("sumFromString: {}", sumFromString);
    }
}
