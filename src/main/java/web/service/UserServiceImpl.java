package web.service;

import org.springframework.stereotype.Component;
import web.DAO.UserDAO;
import web.DAO.UserDAOImpl;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    public void edit(User user, int id) {
        userDAO.edit(user, id);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
