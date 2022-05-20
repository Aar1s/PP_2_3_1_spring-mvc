package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class UserDAOImpl implements UserDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> users = new HashMap<>();
    {
        User user1 = new User("James","Clement", 37);
        user1.setID(AUTO_ID.getAndIncrement());
        User user2 = new User("Nick","Mason", 39);
        user2.setID(AUTO_ID.getAndIncrement());
        User user3 = new User("Claire","Tonti", 37);
        user3.setID(AUTO_ID.getAndIncrement());
        users.put(user1.getID(), user1);
        users.put(user2.getID(), user2);
        users.put(user3.getID(), user3);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setID(AUTO_ID.getAndIncrement());
        users.put(user.getID(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getID());
    }

    @Override
    public void edit(User user) {
        users.put(user.getID(), user);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
