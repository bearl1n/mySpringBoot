package de.springboot.dao;

import de.springboot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by 1 on 29/06/2017.
 */
@Repository
public interface UserDao extends JpaRepository<Users, Long> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */
   // public Users findAll();

} // class UserDao