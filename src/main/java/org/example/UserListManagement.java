package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class UserListManagement implements UserManagement{
    ArrayList<User> userList = new ArrayList<>();


    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }

    @Override
    public ArrayList<User> getAllUsers() {
        userList.stream().forEach(user -> System.out.println(
                    "Id "
                    + user.getId()
                    + ": "
                    + user.getFirstName() + " "
                    + user.getLastName() + " is a "
                    + user.getUserRole() + "."
                ));
        return userList;
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