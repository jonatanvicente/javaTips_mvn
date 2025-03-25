package org.javatips.lambdas.expr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class ExpressionsA {


    public static void main(String[] args) {

        ExpressionsA lambda = new ExpressionsA();
        lambda.first();
        lambda.second();
        lambda.third();
        lambda.fourth();
        lambda.fifth();
    }

    void first(){

        List<String> names = Arrays.asList("Ari", "Unai", "Petri", "Raphäel", "Ivan");

        System.out.println(names.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList()));
    }


    void second() {

        List<Integer> ints = Arrays.asList(3, 44, 55, 214, 8, 1250);

        System.out.println(ints.stream()
                .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
                .collect(joining(",")));

    }
    void third() {
        List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
        String s1 = words.stream()
                .filter(word -> word.contains("o"))
                .findFirst()
                .orElse(null);
        System.out.println(s1);
        String s2 = words.stream()
                .filter(word -> word.length() > 5)
                .findFirst()
                .orElse(null);
        System.out.println(s2);

    }

    void fourth() {
        List<String> months = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre");
        months.forEach( n -> System.out.println(n));
    }

    void fifth() {
        List<String> months = Arrays.asList("january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december");
        months.forEach(System.out::println);
    }

}