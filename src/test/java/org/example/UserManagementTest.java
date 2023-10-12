package org.example;

import lombok.Builder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserManagementTest {

    @Test
    void addUser_addOneUser_listSizeIs1 () {
        UserManagement userManagement = new UserManagement();
        ArrayList<User> users = userManagement.usersList;
        userManagement.addUser(new User("u1","Max","Mustermann","maxi",Role.USER));
        assertEquals(1, users.size());
    }

    @Test
    void addUser_addTwoUsers_listSizeIs2 () {
        UserManagement userManagement = new UserManagement();
        ArrayList<User> users = userManagement.usersList;
        userManagement.addUser(new User("u1","Max","Mustermann","maxi",Role.USER));
        userManagement.addUser(new User("u2","Max","Mustermann","maxi",Role.USER));
        assertEquals(2, users.size());
    }

}