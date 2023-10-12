package org.example;

import java.util.ArrayList;
import java.util.Optional;

public interface UserManagement {
    void addUser(User user);
    ArrayList<User> getAllUsers();
    Optional<User> findUserById(String userId);
    void removeUser(String userId);
    void changeUserRole(String userId, Role userRole);


}
