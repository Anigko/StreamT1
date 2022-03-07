package ru.netology.ak1;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Стрим метод");
        StreamMain printAlt = new StreamMain();

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Альтернативный метод");

        printAlt.Print();

    }
}
