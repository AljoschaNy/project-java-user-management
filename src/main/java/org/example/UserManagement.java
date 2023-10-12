package org.example;

import org.example.exception.NoSuchUserException;

import java.util.ArrayList;
import java.util.Optional;

public interface UserManagement {
    void addUser(User user);
    ArrayList<User> getAllUsers();
    Optional<User> findUserById(String userId);
    void removeUser(String userId) throws NoSuchUserException;
    void changeUserRole(String userId, Role userRole);


}
