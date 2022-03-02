package com.example.workshopday13.controller;


import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import com.example.workshopday13.model.Person;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/demo", produces=MediaType.TEXT_HTML_VALUE)
public class IndexController {
    
    @GetMapping("/currtime")
    public String getCurrDateTime(Model model){
    
        model.addAttribute("currtime", new Date().toString());
        return "currtime";
    }

    @GetMapping("/allperson")
    public String getAllPerson(Model model){
        List<Person> allperson = new ArrayList<Person>();
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Arian");
        p.setLastName("Sani");
        p.setGender('M');

      
        allperson.add(p);
        
        Person p2 = new Person();
        p2.setId(2);
        p2.setFirstName("Syainda");
        p2.setLastName("Fox");
        p2.setGender('F');

        allperson.add(p2);
        model.addAttribute("currtime", new Date().toString());
        model.addAttribute("p",p);
        model.addAttribute("allperson",allperson);
        return "currtime";
                
    }

    @GetMapping("/searchPerson")
    public String searchPerson(@RequestParam(required=true) String firstName,Model model){
        List<Person> allperson = new ArrayList<Person>();
        Person pResult = null;
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Arian");
        p.setLastName("Sani");
        p.setGender('M');

      
        allperson.add(p);
        
        Person p2 = new Person();
        p2.setId(2);
        p2.setFirstName("Syainda");
        p2.setLastName("Fox");
        p2.setGender('F');

        allperson.add(p2);
        if(firstName.equals("Arian")){
            pResult = p;
        }
        if(firstName.equals("Syainda")){
            pResult = p2;
        }

        model.addAttribute("currtime", new Date().toString());
        model.addAttribute("p",p);
        model.addAttribute("allperson",allperson);
        model.addAttribute("result",pResult);
        return "currtime";
                
    }
    
    @GetMapping("/getSomeone/{firstName}")
    public String getSomeone(@PathVariable(name="firstName") String firstName,Model model){
        
        Person p = new Person();
        p.setId(1);
        p.setFirstName("Arian");
        p.setLastName("Sani");
        p.setGender('M');

        

        model.addAttribute("result",p);
        return "pathvar";
                
    }
}
