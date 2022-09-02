package ru.loktaevalex.pp_311.service;

import ru.loktaevalex.pp_311.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void saveUser(User user);
    public void deleteUser(long id);
    public void updateUser(long id, User user);
    public User getUser(long id);
}

