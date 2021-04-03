package by.jrr.learn.lecture2.EntityService;

import by.jrr.learn.lecture2.EntityService.entity.Cat;
import by.jrr.learn.lecture2.EntityService.entity.Dog;
import by.jrr.learn.lecture2.EntityService.entity.Entity;
import by.jrr.learn.lecture2.EntityService.entity.Person;
import by.jrr.learn.lecture2.EntityService.service.CatService;
import by.jrr.learn.lecture2.EntityService.service.DogService;
import by.jrr.learn.lecture2.EntityService.service.PersonService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        String name = "DOG";
        Dog superDog = new Dog();
        Cat superCat = new Cat();
        Person superPerson = new Person();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER NAME : ");

        int count = 0;
        while (count++ != 3) {
            String naming = bufferedReader.readLine();
            switch (naming) {
                case Entity.DOG -> {
                    DogService dogService = new DogService(superDog);
                    Object dog = dogService.create();
                    System.out.println(dog);
                }
                case Entity.CAT -> {
                    CatService catService = new CatService(superCat);
                    Object cat = catService.create();
                    System.out.println();
                    System.out.println(cat);
                }
                case Entity.PERSON -> {
                    PersonService personService = new PersonService(superPerson);
                    Object person = personService.create();
                    System.out.println(person);
                }
                default -> System.out.println("SORRY");
            }
        }
    }
}
