package by.jrr.learn.projectstask.service;

import by.jrr.learn.projectstask.Person;
import by.jrr.learn.projectstask.Skill;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PersonServiceImpl implements PersonService {

    @Override
    public Person findTheBestPersonWithTheSpecificParameters(List<Person> personList, String languageName) {
        var acceptedSkill = getAcceptedSkill(personList, languageName);
        return personList.stream()
                .filter(it -> it.getSkill().contains(acceptedSkill))
                .findFirst().orElseThrow();
    }

    private Skill getAcceptedSkill(List<Person> personList, String languageName) {
        return personList.stream()
                .flatMap(it -> it.getSkill().stream())
                .filter(it -> Objects.equals(it.getName(), languageName))
                .max(Comparator.comparing(Skill::getKnownPercentage))
                .orElseThrow(IllegalArgumentException::new);
    }

}
