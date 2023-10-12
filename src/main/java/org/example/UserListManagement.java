package org.example;

import java.util.ArrayList;

public class UserListManagement {
    ArrayList<User> userList = new ArrayList<>();


    public void addUser(User user) {
        this.userList.add(user);
    }
}