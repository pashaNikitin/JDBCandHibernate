package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        final UserService userService = new UserServiceImpl();

            userService.createUsersTable();
            userService.saveUser("Кевин", "кевин", (byte) 44);
            userService.saveUser("миша", "иванов", (byte) 34);
            userService.saveUser("олег", "олег", (byte) 34);
            userService.saveUser("бен", "бен", (byte) 91);
            userService.removeUserById(2);
            userService.getAllUsers();
            System.out.println(userService.getAllUsers());
            userService.cleanUsersTable();
            userService.dropUsersTable();
        }
        // реализуйте алгоритм здесь
    }

