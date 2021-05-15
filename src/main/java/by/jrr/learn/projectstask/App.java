package by.jrr.learn.projectstask;

import by.jrr.learn.projectstask.service.PersonService;
import by.jrr.learn.projectstask.service.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(1L, "Lokesh", new Skill("English", 10),
                new Skill("Kannada", 20), new Skill("Hindi", 10)));

        persons.add(new Person(2L, "Mahesh", new Skill("English", 10),
                new Skill("Kannada", 30), new Skill("Hindi", 50)));

        persons.add(new Person(3L, "Ganesh", new Skill("English", 10),
                new Skill("Kannada", 20), new Skill("Hindi", 40)));

        persons.add(new Person(4L, "Ramesh", new Skill("English", 10),
                new Skill("Kannada", 20), new Skill("Hindi", 40)));

        persons.add(new Person(5L, "Suresh", new Skill("English", 10),
                new Skill("Kannada", 40), new Skill("Hindi", 40)));

        persons.add(new Person(6L, "Gnanesh", new Skill("English", 100),
                new Skill("Kannada", 20), new Skill("Hindi", 40)));

        PersonService personService = new PersonServiceImpl();
        System.out.println(personService.findTheBestPersonWithTheSpecificParameters(persons, "Hindi"));

    }
}
