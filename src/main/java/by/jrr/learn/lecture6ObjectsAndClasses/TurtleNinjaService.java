package by.jrr.learn.lecture6ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;

public class TurtleNinjaService {
    public static final List<Turtle> turtleList = new ArrayList<>();

    ValidateTurtleService validateTurtleService = new ValidateTurtleService();

    public Turtle createTurtle(String name, String lastName, Integer age, String panzerType) {
        Turtle turtle = new Turtle();
        turtle.setName(name);
        turtle.setLastName(lastName);
        validateTurtleService.validateAge(age);
        turtle.setAge(age);
        turtle.setPanzerType(panzerType);

        saveTurtle(turtle);
        return turtle;
    }

    public void saveTurtle(Turtle turtle) {
        turtleList.add(turtle);
    }
}
