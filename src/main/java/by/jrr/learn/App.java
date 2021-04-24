package by.jrr.learn;

import by.jrr.learn.fix.Fix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args)  {
        Fix fix = new Fix("1","Art");
        Fix fix1 = new Fix("2","Baki");
        Fix fix2 = new Fix("3","Crowl");
        Fix fix3 = new Fix("4","Dima");
        Fix fix4 = new Fix(null,"Roma");
        Fix fix5 = new Fix(null,"Serp");
        Fix fix6 = new Fix(null,"Tima");
        Fix fix7 = new Fix(null,"Will");
        Fix fix8 = new Fix(null,"Zorg");

        List<Fix> list = new ArrayList<>();
        list.add(fix6);
        list.add(fix7);
        list.add(fix1);
        list.add(fix);
        list.add(fix4);
        list.add(fix3);
        list.add(fix6);
        list.add(fix5);
        list.add(fix2);
        list.add(fix8);

        for (Fix fi:list
             ) {
            System.out.println(fi);
        }
        System.out.println();

        List<Fix> collect = list.stream()
                .sorted(Comparator.comparing(it -> Objects.nonNull(it.getSapId())
                        ? it.getSapId() : it.getName()))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);


    }
}
