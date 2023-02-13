package web.dao;

import org.springframework.stereotype.Component;
import model.User;

import java.util.List;

@Component
public interface UserDAO {

    List<User> index();

    User showUser(int id);

    void saveUser(User user);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);
}
