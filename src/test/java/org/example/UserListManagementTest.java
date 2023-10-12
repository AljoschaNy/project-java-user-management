package org.example;

import org.example.exception.NoSuchUserException;
import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Test
    void findUserById_wrongId_returnEmptyOptional() {
        Optional<User> actual = userListManagement.findUserById("a");
        assertEquals(Optional.empty(),actual);
    }

    @Test
    void findUserById_emptyStringId_returnEmptyOptional() {
        Optional<User> actual = userListManagement.findUserById("");
        assertEquals(Optional.empty(),actual);
    }

    @Test
    void findUserById_correctId_returnUser() {
        users.add(user1);
        Optional<User> actual = userListManagement.findUserById("u1");
        assertEquals(user1,actual.get());
    }

    @Test
    void findUserById_correctId2_returnUser2() {
        users.add(user1);
        users.add(user2);
        Optional<User> actual = userListManagement.findUserById("u2");
        assertEquals(user2,actual.get());
    }

    @Test
    void removeUser_fromEmptyList_throwNoSuchUserException() {
        assertThrows(NoSuchUserException.class, () -> {
            userListManagement.removeUser("u1");
        });
    }

    @Test
    void removeUser_correctIdOfUser_removeThisUserFromList() throws NoSuchUserException {
        users.add(user1);
        userListManagement.removeUser("u1");
        assertEquals(List.of(),users);
    }

    @Test
    void removeUser_idOfUserInvalid_throwNoSuchUserException() {
        users.add(user1);
        assertThrows(NoSuchUserException.class, () ->{
            userListManagement.removeUser("u2");
        });
    }

}