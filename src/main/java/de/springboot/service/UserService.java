package de.springboot.service;

import de.springboot.dao.UserDao;
import de.springboot.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by 1 on 15/06/2017.
 */
@Service
public class UserService {

    @Autowired
    private UserDao repository;

   /* Comment
   private static List<Users> items= new ArrayList<>();
    static {
        items.add(new Users("Email1","Name1"));
    } */


    public List<Users> findAll(){return  repository.findAll();
    }

    public List<Users> getAll() { return repository.getAll();
    }

    public List<Users> getUserByName(String userId) {
        return repository.findAllByName(userId);
    }
    //  public Collection<Users> findAll(){return  repository.findAll();
  //  }



}
