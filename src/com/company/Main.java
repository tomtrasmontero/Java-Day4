package com.company;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
//        not passing test in 99 problems, haven't read up on Generics but logic works
        P09 testP09 = new P09();
        List<String> testData = Arrays.asList("a", "a", "b", "b");
        testP09.pack(testData);

        P07 p07 = new P07();
        List data = asList("a", "b", asList("c"), asList("d"));
        p07.flatten(data);

        P15 p15 = new P15();
        List datap15 = asList("a", "b", "c");
        p15.duplicate(datap15, 3);
    }


}

