package de.springboot.service;

import de.springboot.dao.UserDao;
import de.springboot.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 15/06/2017.
 */
@Service
public class UserService {

    private UserDao repository;

    private static List<Users> items= new ArrayList<>();
    static {
        items.add(new Users("Email1","Name1"));
    }

    public List<Users> findAll(){
    return  repository.findAll();
    }

}
