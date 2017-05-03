package de.springboot.web;

import de.springboot.model.StackoverflowWebsite;
import de.springboot.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 1 on 18/04/2017.
 */
@Controller
@RequestMapping("api/stackoverflow")
public class siteController {
    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    @ResponseBody
    public List<StackoverflowWebsite> getListOfProviders(){
        return stackoverflowService.findAll();
    }
}
