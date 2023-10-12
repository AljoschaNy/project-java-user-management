package org.example;

import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserListManagementTest {

    UserListManagement userListManagement = new UserListManagement();
    ArrayList<User> users = userListManagement.userList;
    User user1 = new User("u1","Max","Mustermann","maxi",Role.USER);
    User user2 = new User("u2","Tina","Mustermann","maxi",Role.USER);

    @Test
    void addUser_addOneUser_listSizeIs1 () {
        userListManagement.addUser(user1);
        assertEquals(1, users.size());
    }

    @Test
    void addUser_addTwoUsers_listSizeIs2 () {
        userListManagement.addUser(user1);
        userListManagement.addUser(user2);
        assertEquals(2, users.size());
    }

    @Test
    void showAllUsers_addOneUser() {
        userListManagement.addUser(user1);
        ArrayList<User> actual = userListManagement.getAllUsers();
        List<User> expect = List.of(user1);
        assertEquals(expect,actual);
    }

    @Test
    void showAllUsers_addTwoUsers() {
        userListManagement.addUser(user1);
        userListManagement.addUser(user2);
        ArrayList<User> actual = userListManagement.getAllUsers();
        List<User> expect = List.of(user1,user2);
        assertEquals(expect,actual);
    }

}