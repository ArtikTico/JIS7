package by.jrr.learn.projectstask.service;

import by.jrr.learn.projectstask.Person;

import java.util.List;

public interface PersonService {
     Person findTheBestPersonWithTheSpecificParameters(List<Person> personList, String languageName);
}
