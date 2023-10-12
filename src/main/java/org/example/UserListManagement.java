package org.example;

import org.example.exception.NoSuchUserException;

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
        for(User user : userList) {
            if(user.getId().equals(userId)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public void removeUser(String userId) throws NoSuchUserException {
        Optional<User> userToRemove = findUserById(userId);
        if(userToRemove.isPresent()) {
            userList.remove(userToRemove.get());
        } else {
            throw new NoSuchUserException("Can't find the user with the id " + userId);
        }
    }

    @Override
    public void changeUserRole(String userId, Role userRole) {

    }


}