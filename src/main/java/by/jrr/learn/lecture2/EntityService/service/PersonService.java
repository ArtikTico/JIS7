package by.jrr.learn.lecture2.EntityService.service;

import by.jrr.learn.lecture2.EntityService.entity.Person;
import by.jrr.learn.lecture2.EntityService.repository.EntityRepository;

public class PersonService implements EntityRepository {

    private final Person person;

    public PersonService(Person person) {
        this.person = person;
    }

    @Override
    public Object create() {
        Person person = new Person();
        person.setAge(10);
        person.setName("Alex");
        return person;
    }
}
