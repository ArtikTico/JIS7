package lambdas;

import lambdas.user.model.Skill;
import lambdas.user.model.User;
import lambdas.user.service.UserService;
import lambdas.user.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
            User artsemi = new User("Artsemi", 26,
                    new Skill("Programmist", 80),
                    new Skill("TrackAndField", 70));

            User alexander = new User("Alexander", 28,
                    new Skill("Programmist", 30),
                    new Skill("TrackAndField", 0),
                    new Skill("English", 90));

            User katya = new User("Katya", 26,
                    new Skill("Programmist", 25),
                    new Skill("TrackAndField", 70),
                    new Skill("English", 40));

            User sasha = new User("Alexander Tulai", 25,
                    new Skill("Programmist", 47),
                    new Skill("TrackAndField", 50));

            User max = new User("Max", 31,
                    new Skill("Programmist", 60),
                    new Skill("TrackAndField", 30),
                    new Skill("English", 60));
            userList.add(artsemi);
            userList.add(alexander);
            userList.add(sasha);
            userList.add(katya);
            userList.add(max);
        Map<User, Skill> userToSkillMap = new HashMap<>();
        userToSkillMap.put(artsemi, new Skill("Write code", 10));
        userToSkillMap.put(alexander, new Skill("Write code", 20));
        userToSkillMap.entrySet().stream()
                .sorted(Comparator.comparing(it -> it.getValue().getNameOfSkill()));

        UserService userService = new UserServiceImpl();
//        var english = userService.findUsersWithSpecificSkill(userList, "English");
//        english.forEach(System.out::println);
//        Integer maxAgeUser = userService.findMaxAgeUser(userList);
//        System.out.println(maxAgeUser);
//
//        var allSkills = userService.findAllSkills(userList);
//
//        List<User> collect = userList.stream()
//                .sorted(Comparator.comparing(User::getName))
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);

        userList.stream()
                .peek(App::getSortedSkillsForUser)
                .forEach(System.out::println);

    }

    private static void getSortedSkillsForUser(User user) {
        var sortedSkills = user.getSkills().stream()
                .sorted(Comparator.comparing(Skill::getNameOfSkill))
                .collect(Collectors.toList());
        user.setSkills(sortedSkills);
    }

}
