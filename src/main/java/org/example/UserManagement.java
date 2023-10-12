package org.example;

import java.util.ArrayList;

public class UserManagement {
    ArrayList<User> usersList = new ArrayList<>();


    public void addUser(User user) {
        this.usersList.add(user);
    }
}