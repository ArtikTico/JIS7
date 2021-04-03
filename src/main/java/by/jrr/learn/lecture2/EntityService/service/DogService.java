package by.jrr.learn.lecture2.EntityService.service;

import by.jrr.learn.lecture2.EntityService.entity.Dog;
import by.jrr.learn.lecture2.EntityService.repository.EntityRepository;

public class DogService implements EntityRepository {
    private Dog dog;

    public DogService (Dog dog) {
        this.dog = dog;
    }

    @Override
    public Object create() {
        Dog dog = new Dog();
        dog.setName("Petya");
        dog.setAge(10);
        return dog;
    }
}
