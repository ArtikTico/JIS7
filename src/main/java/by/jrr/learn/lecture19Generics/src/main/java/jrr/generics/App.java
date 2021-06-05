package jrr.generics;

import jrr.generics.building.House;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println();
        House<Integer> house = new House<>();
        List<Integer> valuesLists = Arrays.asList(1,2,3);
        house.addAll(valuesLists, 4);


    }
}
