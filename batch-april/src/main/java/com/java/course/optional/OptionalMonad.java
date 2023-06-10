package com.java.course.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OptionalMonad {


    public static void main(String[] args) {
        Optional<Integer> maybeInt = Optional.ofNullable(null);
       // Optional<Integer> maybeInt = Optional.empty();

        maybeInt.map(value -> {
            System.out.println("value present is :" + value);
            return value; }).
                orElseGet(() ->
                { System.out.println("Null value is present"); return null; });
    }





}
