package de.springboot.controllers;

import de.springboot.dao.UserDao;
import de.springboot.model.Users;
import de.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 1 on 15/06/2017.
 */
@RestController // include anotation Responsebody
//@Controller --v1
@RequestMapping("/api")
public class ApiController {

    // ob'yavlyaem servece
    private UserDao userDao;

    public ApiController(UserDao userDao){
        this.userDao=userDao;
    }

    @RequestMapping(value = "/get_users",method = RequestMethod.GET)
   // @ResponseBody --v1
    public List<Users> getUsers() {
        return userDao.findAll();
    }
}
