package ru.loktaevalex.pp_311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.loktaevalex.pp_311.dao.UserDAO;
import ru.loktaevalex.pp_311.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDao;

    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Transactional
    @Override
    public void updateUser(long id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return userDao.getUser(id);
    }
}

