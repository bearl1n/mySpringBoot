package de.springboot.persistence;

import de.springboot.model.StackoverflowWebsite;
import de.springboot.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

/**
 * Created by 1 on 04/05/2017.
 */
@Repository
public interface StackoverflowWebsiteRepository extends MongoRepository<StackoverflowWebsite,String> {
//    Autowired
//    private MongoTemplate mongoTemplate;
//
//    public List<StackoverflowWebsite> findAll() {
//        return mongoTemplate.findAll(StackoverflowWebsite.class);
//    }
}
