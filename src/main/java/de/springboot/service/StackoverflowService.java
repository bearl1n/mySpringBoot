package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import de.springboot.persistence.StackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 18/04/2017.
 */
@Service
public class StackoverflowService {
    @Autowired

    private StackoverflowWebsiteRepository repository;



    private static List<StackoverflowWebsite> items= new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("site id  test", "icon", "name site", "description site"));

    }

//    @PostConstruct
//
//    public void init(){
//        repository.save(items);
//    }


    public List<StackoverflowWebsite> findAll() {

        return repository.findAll();
    }
}
