package OOP_DZ5.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    User updatetUser(User user);
    void deleteUser(User user);
}
