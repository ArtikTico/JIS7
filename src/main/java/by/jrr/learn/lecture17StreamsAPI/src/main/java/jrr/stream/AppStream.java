package jrr.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppStream {
    static List<Lecturer> lecturerList = new ArrayList<>();

    public static void main(String[] args) {
        initData();

        long count = lecturerList.stream()
                .flatMap(it -> it.getRooms().stream())
                .count();

        Integer reduce = lecturerList.stream()
                .flatMap(it -> it.getRooms().stream())
                .map(Room::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println(count);
        System.out.println(reduce);

        Map<Lecturer, Integer> collect = lecturerList.stream()
                .collect(Collectors.toMap(Function.identity(), it -> it.getRooms().stream()
                        .map(Room::getCapacity)
                        .reduce(0, Integer::sum)));


        for (Map.Entry<Lecturer,Integer> value :collect.entrySet()
             ) {
            System.out.println(value.getKey().getName() + " " + value.getValue());
        }

        lecturerList.forEach(it -> {
            it.setId((long) (Math.random() * 10));
            System.out.println(it);
        });
        lecturerList.stream()
                .flatMap(it -> it.getRooms().stream())
                .limit(10)
                .forEach(System.out::println);
    }






    private static void initData() {
        Lecturer lecturer1 = new Lecturer("Artsemi", 26,
                List.of(new Room(1, 30), new Room(2, 50), new Room(8, 35)));
        Lecturer lecturer2 = new Lecturer("Alexander", 28,
                List.of(new Room(10, 100), new Room(15, 40), new Room(70, 120)));
        Lecturer lecturer3 = new Lecturer("Roma", 25,
                List.of(new Room(101, 100), new Room(113, 15), new Room(4, 10)));
        Lecturer lecturer4 = new Lecturer("Katya", 27,
                List.of(new Room(73, 60), new Room(15, 24), new Room(80, 95)));
        Lecturer lecturer5 = new Lecturer("Denis", 30,
                List.of(new Room(14, 75), new Room(50, 50), new Room(60, 60)));
        Lecturer lecturer6 = new Lecturer("Maxim", 31,
                List.of(new Room(1001, 500), new Room(200, 50), new Room(113, 30)));

        lecturerList.add(lecturer1);
        lecturerList.add(lecturer2);
        lecturerList.add(lecturer3);
        lecturerList.add(lecturer4);
        lecturerList.add(lecturer5);
        lecturerList.add(lecturer6);
    }
}
