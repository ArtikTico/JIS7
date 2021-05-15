package lambdas.user.service;

import lambdas.user.model.Skill;
import lambdas.user.model.User;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    @Override
    public Collection<User> findUsersWithSpecificSkill(Collection<User> userList, String name) {
        return userList.stream()
                .filter(it -> it.getSkills().stream()
                            .anyMatch(skill -> skill.getNameOfSkill().equals(name)))
                .collect(Collectors.toList());
    }

    @Override
    public Integer findMaxAgeUser(Collection<User> userList) {
        return userList.stream()
                .map(User::getAge)
                .max(Comparator.naturalOrder())
                .orElseThrow();
    }

    @Override
    public Collection<Skill> findAllSkills(Collection<User> userList) {
        return userList.stream()
                .flatMap(it -> it.getSkills().stream())
                .collect(Collectors.toList());

    }
}
