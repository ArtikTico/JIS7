package jrr.generics.building.validate;

import jrr.generics.building.Building;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class BuildingValidatorService<T, E> {

    public void validate(T clazz) {
        System.out.println(clazz.getClass().getSimpleName());
    }

    Building getValue(Building<? extends Number> element) {
        return (Building) element;
    }
}
