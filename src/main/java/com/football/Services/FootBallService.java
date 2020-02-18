package com.football.Services;

import com.football.Mock;
import com.football.Models.Competitions;
import com.football.Models.Country;
import com.football.Models.Standings;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

@Service
public class FootBallService {

    public static final String NO_COMPETITIONS_DETAILS_PRESENT = "No Competitions Details Present";
    public static final String NO_COUNTRY_DETAILS_PRESENT = "No Country Details Present";
    public static final String NO_STANDING_DETAILS_PRESENT = "No Standing Details Present";

    @Autowired
    private RestTemplate restTemplate ;

    @Value("${standingurl}")
    private String standingsUrl;


    @Value("${countryUrl}")
    private String countryUrl;

    @Value("${competitionUrl}")
    private String competitionUrl;

    @Value("${apiKey}")
    private String apiKey;



    @HystrixCommand(fallbackMethod = "defaultResponseEntityforgetStandingsFromLeagueId")
    public ResponseEntity<Standings[]> getStandingsFromLeagueId(String league_id) {

        String standingsFormattedUrl = MessageFormat.format(standingsUrl, league_id, apiKey);
         ResponseEntity<Standings[]> response = restTemplate.exchange(standingsFormattedUrl
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Standings[].class) ;

        if (response.getStatusCode().is2xxSuccessful()) {
            return ResponseEntity.status(HttpStatus.OK).body(Mock.getStandings());
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, NO_STANDING_DETAILS_PRESENT);
        }

    }

    public ResponseEntity<Standings[]> defaultResponseEntityforgetStandingsFromLeagueId(String league_id) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Standings[0]);
    }

    @HystrixCommand(fallbackMethod = "defaultResponseEntityforgetAllCompetitions")
    public ResponseEntity<Competitions[]> getAllCompetitions(String league_id) {

        String standingsFormattedUrl = MessageFormat.format(competitionUrl, league_id, apiKey);
        ResponseEntity<Competitions[]> response = restTemplate.exchange(standingsFormattedUrl
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Competitions[].class) ;


        if (response.getStatusCode().is2xxSuccessful()) {
            return ResponseEntity.status(HttpStatus.OK).body(Mock.getCompetitions());
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, NO_COMPETITIONS_DETAILS_PRESENT);
        }

    }

    public ResponseEntity<Competitions[]> defaultResponseEntityforgetAllCompetitions(String league_id) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Competitions[0]);
    }

    @HystrixCommand(fallbackMethod = "defaultResponseEntityforgetAllCountries")
    public ResponseEntity<Country[]> getAllCountries() {

        String standingsFormattedUrl = MessageFormat.format(countryUrl, apiKey);
        ResponseEntity<Country[]> response = restTemplate.exchange(standingsFormattedUrl
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Country[].class) ;


        if (response.getStatusCode().is2xxSuccessful()) {
            return ResponseEntity.status(HttpStatus.OK).body(Mock.getCountry());
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, NO_COUNTRY_DETAILS_PRESENT);
        }
        
    }


    public ResponseEntity<Country[]> defaultResponseEntityforgetAllCountries() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Country[0]);
    }



}
