package com.crick.apis.controller;

import com.crick.apis.entities.Match;
import com.crick.apis.services.MatchServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    private MatchServices matchServices;

    public MatchController(MatchServices matchServices) {
        this.matchServices = matchServices;
    }
    //get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        return new ResponseEntity<List<Match>>(this.matchServices.getLiveMatches() , HttpStatus.OK);
    }

    //get all matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches()
    {
        return new ResponseEntity<List<Match>>(this.matchServices.getAllMatches(), HttpStatus.OK);
    }

    //get point table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable()
    {
        return new ResponseEntity<>(this.matchServices.getPointTable(), HttpStatus.OK);
    }

}
