package de.springboot.controllers;

import de.springboot.model.Users;
import de.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * Created by 1 on 15/06/2017.
 */
@RestController // include anotation Responsebody
//@Controller --v1
@RequestMapping("/api")
public class ApiController {

    // ob'yavlyaem servece
    @Autowired
    private UserService userService;


   @RequestMapping(value = "/get_users",method = RequestMethod.GET)

    public List<Users> getUsers(){
       return userService.findAll();
    }

    @RequestMapping(value = "/get_all", method = RequestMethod.GET)

    public List<Users> getAll(){
        return userService.getAll();
    }

    @RequestMapping(value = "/get_users/{userId}", method = RequestMethod.GET)

    public List<Users> getUserByName(@PathVariable(value = "userId") String userId){
        return userService.getUserByName(userId);
    }


}
