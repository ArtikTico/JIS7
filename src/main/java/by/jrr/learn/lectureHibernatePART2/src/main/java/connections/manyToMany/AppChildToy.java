package connections.manyToMany;

import connections.manyToMany.service.ChildWithToyRepository;

import java.util.List;

public class AppChildToy {
    public static void main(String[] args) {
        ChildWithToyRepository childWithToyRepository = new ChildWithToyRepository();
        Toy robot = childWithToyRepository.createToy("Robot");
        Toy barby = childWithToyRepository.createToy("Barby");
        Toy bazzLaiter = childWithToyRepository.createToy("Bazz Laiter");

        Child artik = childWithToyRepository.createChild("Artik", List.of(robot, barby, bazzLaiter));
        System.out.println(artik);

        childWithToyRepository.findAllToys().forEach(System.out::println);
    }
}
