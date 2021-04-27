package by.artik.comparators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class App {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Yan", "Maxim", "Pavlik", "Artsemi");
        Collections.sort(names);
        System.out.println(names.toString());

        User user1 = new User(5L, "Alex", 20, 179.1);
        User user2 = new User(3L, "Alex", 21, 179.1);
        User user3 = new User(1L, "Yan", 25, 190.1);
        User user4 = new User(2L, "Maxim", 31, 176.2);
        User user5 = new User(4L, "Pavlik", 17, 200.0);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        userList.forEach(System.out::println);

        var sorted = userList.stream()
                .sorted(Comparator.comparing(User::getName).thenComparing(User::getAge));

        Comparator<User> sortByAge = Comparator.comparing(User::getAge);

        Map<User, Long> userLibrary = new TreeMap<>(sortByAge);

        userLibrary.put(user1, user1.getId());
        userLibrary.put(user2, user2.getId());
        userLibrary.put(user3, user3.getId());
        userLibrary.put(user4, user4.getId());
        userLibrary.put(user5, user5.getId());

        for (Map.Entry<User, Long> para: userLibrary.entrySet()) {
            System.out.println("Key " + para.getKey() + "value " + para.getValue());
        }
    }
}
