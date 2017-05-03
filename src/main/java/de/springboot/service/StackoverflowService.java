package de.springboot.service;

import de.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 18/04/2017.
 */
@Service
public class StackoverflowService {

    private static List<StackoverflowWebsite> items= new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite("site id  test", "icon", "name site", "description site"));

    }


    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
