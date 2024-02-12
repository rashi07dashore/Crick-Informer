package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    //to fetch the match data
    // we provide --> TeamName
    Optional<Match> findByTeamHeading(String teamHeadig);

}
