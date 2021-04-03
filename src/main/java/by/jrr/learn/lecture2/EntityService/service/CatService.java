package by.jrr.learn.lecture2.EntityService.service;

import by.jrr.learn.lecture2.EntityService.entity.Cat;
import by.jrr.learn.lecture2.EntityService.repository.EntityRepository;

public class CatService implements EntityRepository {
    private Cat cat;

    public CatService(Cat cat) {
        this.cat = cat;
    }

    @Override
    public Object create() {
        Cat cat = new Cat();
        cat.setName("101");
        cat.setAge(10);
        return cat;
    }
}
