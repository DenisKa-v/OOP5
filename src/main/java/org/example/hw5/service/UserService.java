package org.example.hw5.service;

import org.example.hw5.model.User;
import org.example.hw5.view.Messages;

public class UserService {
    public User createUser(int id, String name){
        return new User(id,name);
    }
    public void changeBalance(User user, int amount){
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
