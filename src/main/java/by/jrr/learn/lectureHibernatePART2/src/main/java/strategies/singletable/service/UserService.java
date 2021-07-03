package strategies.singletable.service;

import strategies.singletable.User;

public interface UserService {
    User createUser(String name);

    User createAdmin(String name, Boolean hasFullAccess);

    User createLecturer(String name, Integer studentCount);
}
