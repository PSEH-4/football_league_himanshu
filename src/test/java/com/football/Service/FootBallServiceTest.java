package com.football.Service;

import com.football.Models.Standings;
import com.football.Services.FootBallService;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.*;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class FootBallServiceTest {


    public static final String NO_COMPETITIONS_DETAILS_PRESENT = "No Competitions Details Present";
    public static final String NO_COUNTRY_DETAILS_PRESENT = "No Country Details Present";
    public static final String NO_STANDING_DETAILS_PRESENT = "No Standing Details Present";


    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private FootBallService empService = new FootBallService();

    @Rule
    ExpectedException expectedException = ExpectedException.none() ;

    @Test
    public void getStandingsFromLeagueId_whenSuccess() {

        Mockito.when(restTemplate.exchange("<url>"
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Standings[].class)).thenReturn(new ResponseEntity(new Standings[0], HttpStatus.OK)) ;
        Assert.notNull(empService.getStandingsFromLeagueId("148"));

    }

    @Test
    public void getStandingsFromLeagueId_whenException() {

        expectedException.expectMessage(NO_STANDING_DETAILS_PRESENT);
        Mockito.when(restTemplate.exchange("<url>"
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Standings[].class)).thenReturn(new ResponseEntity(new Standings[0], HttpStatus.OK)) ;
        empService.getStandingsFromLeagueId("148");
    }

    @Test
    public void getAllCompetition_whenSuccess() {

        Mockito.when(restTemplate.exchange("<url>"
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Standings[].class)).thenReturn(new ResponseEntity(new Standings[0], HttpStatus.OK)) ;
        Assert.notNull(empService.getAllCompetitions("148"));

    }

    @Test
    public void getAllCompetition_whenException() {

        expectedException.expectMessage(NO_COMPETITIONS_DETAILS_PRESENT);
        Mockito.when(restTemplate.exchange("<url>"
                , HttpMethod.GET
                , new HttpEntity<String>(new HttpHeaders())
                , Standings[].class)).thenReturn(new ResponseEntity(new Standings[0], HttpStatus.OK)) ;
        empService.getAllCompetitions("148");
    }
}
