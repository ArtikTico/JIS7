package entity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import entity.model.User;
import entity.repository.UserRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.platform.commons.util.StringUtils.isNotBlank;

public class UserServiceImpl implements UserService {
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User createUser(String userName, String password) {
        if (isNotBlank(userName) && isNotBlank(password) && !hasUsernamePresent(userName)) {
            log.info("Creating user with username " + userName);

            var user = new User(userName, password);
            UserRepository.getUserList().add(user);

            log.info(userName + " user has been created and added in database successfully");
            return user;

        } else {
            log.error("Cannot save user");
            throw new IllegalStateException(String.format("Cannot save user with %s name. Illegal state",
                    Optional.ofNullable(userName).orElse(" 'Undefined' ")));
        }
    }

    @Override
    public List<User> findAllUsers() {
        log.info("Getting user lists");
        return UserRepository.getUserList();
    }

    @Override
    public User findByUserName(String username) {
        if (isNotBlank(username)) {
            log.info("Getting user with username " + username);
            return UserRepository.getUserList().stream()
                    .filter(it -> isEqualsUsername(username, it))
                    .findFirst()
                    .orElseThrow(() -> new UserNotFoundException("Cannot find user with username " + username));
        } else {
            log.warn("Username is null!");
        }
        return null;
    }

    @Override
    public void deleteByUsername(String username) {
        if (isNotBlank(username)) {
            var userList = UserRepository.getUserList();
            var deletingUser = userList.stream()
                    .filter(it -> isEqualsUsername(username, it))
                    .findFirst()
                    .orElseThrow(() -> new UserNotFoundException("Cannot find user with username " + username));
            log.info("User with username " + username + " has been deleted successfully");
            userList.remove(deletingUser);
        } else {
            log.warn("Username is null!");
        }
    }

    private boolean hasUsernamePresent(String userName) {
        return UserRepository.getUserList().stream()
                .anyMatch(it -> isEqualsUsername(userName, it));
    }

    private boolean isEqualsUsername(String username, User it) {
        return Objects.equals(it.getUsername(), username);
    }
}
