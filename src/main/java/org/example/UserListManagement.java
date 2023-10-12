package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class UserListManagement implements UserManagement{
    ArrayList<User> userList = new ArrayList<>();


    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public ArrayList<User> showAllUsers() {
        return null;
    }

    @Override
    public Optional<User> findUserById(String userId) {
        return Optional.empty();
    }

    @Override
    public void removeUser(String userId) {

    }

    @Override
    public void changeUserRole(String userId, Role userRole) {

    }


}