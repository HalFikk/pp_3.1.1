package ru.loktaevalex.pp_311.dao;

import ru.loktaevalex.pp_311.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void deleteUser(long id);
    public void updateUser(long id, User user);
    public User getUser(long id);
}
