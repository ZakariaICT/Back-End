package com.example.myapllication.Controller;

import com.example.myapllication.Model.Teams;
import com.example.myapllication.Repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class TeamsController {

    @Autowired
    private TeamsRepository teamsRepository;

    //get All Customers
    @GetMapping("/teams")
    public List<Teams> getAllTeams(){
        return teamsRepository.findAll();
    }
}
