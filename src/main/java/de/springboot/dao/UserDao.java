package de.springboot.dao;

import de.springboot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by 1 on 29/06/2017.
 */
@Repository
public interface UserDao extends JpaRepository<Users, Long> {

   @Query(value = "select p from p1users p where p.name='Alex'",nativeQuery=true)
    List<Users> getAll();

    List<Users> findAllByName(String userId);

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */


}