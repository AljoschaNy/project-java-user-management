package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserListManagementTest {

    @Test
    void addUser_addOneUser_listSizeIs1 () {
        UserListManagement userListManagement = new UserListManagement();
        ArrayList<User> users = userListManagement.userList;
        userListManagement.addUser(new User("u1","Max","Mustermann","maxi",Role.USER));
        assertEquals(1, users.size());
    }

    @Test
    void addUser_addTwoUsers_listSizeIs2 () {
        UserListManagement userListManagement = new UserListManagement();
        ArrayList<User> users = userListManagement.userList;
        userListManagement.addUser(new User("u1","Max","Mustermann","maxi",Role.USER));
        userListManagement.addUser(new User("u2","Max","Mustermann","maxi",Role.USER));
        assertEquals(2, users.size());
    }

}