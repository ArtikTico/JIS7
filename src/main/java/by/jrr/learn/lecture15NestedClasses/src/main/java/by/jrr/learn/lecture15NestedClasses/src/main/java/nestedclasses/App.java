package nestedclasses;

import nestedclasses.bestpractisebuilding.Building;

import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Building building = new Building();
        building.setYearOfBuild(1000);

    }

    Predicate<Building> predicate = Building::isColorPresent;

};


//TODO:        1.  () -> System.out.println();
//TODO:        2.  (it) -> System.out.println();

