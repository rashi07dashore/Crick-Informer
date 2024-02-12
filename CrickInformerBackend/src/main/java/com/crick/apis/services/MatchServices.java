package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;

public interface MatchServices {
    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get cricket world cup point table
    List<List<String>> getPointTable();


}
