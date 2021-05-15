package lambdas.user.service;

import lambdas.user.model.Skill;
import lambdas.user.model.User;

import java.util.Collection;

public interface UserService {

    Collection<User> findUsersWithSpecificSkill(Collection<User> userList, String name);

    Integer findMaxAgeUser(Collection<User> userList);

    Collection<Skill> findAllSkills(Collection<User> userList);
}
