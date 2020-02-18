package com.football.Controllers;

import com.football.Models.Competitions;
import com.football.Models.Country;
import com.football.Models.ResultModel;
import com.football.Models.Standings;
import com.football.Services.FootBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class MasterController {

    @Autowired
    FootBallService footBallService ;


    @GetMapping(path = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultModel getListofSubscriberCountries(@RequestParam(name = "countryName" , required = true) String countryName ,
                                                    @RequestParam(name = "leagueName" , required = true) String leagueName,
                                                    @RequestParam(name = "teamName" , required = true) String teamName){



                Country[]  getAllCountries = footBallService.getAllCountries().getBody();
                String countryId = Arrays.asList(getAllCountries).stream().filter(country -> country.getCountryName() == countryName).findFirst().get().countryId ;
                Competitions[] getAllCompetitions  = footBallService.getAllCompetitions(countryId).getBody();
                List<Competitions> competitionsList = Arrays.asList(getAllCompetitions).stream().filter(comp -> comp.getCountryName().equals(countryName)&& comp.getLeagueName().equals(leagueName)).collect(Collectors.toList());
                Standings[] getStanding  = footBallService.getStandingsFromLeagueId("148").getBody();
                ResultModel resultModel = ResultModel.builder()
                        .country_id(countryId)
                        .country_name(countryName)
                        .team_name(teamName)
                        .team_id("")
                        .overAllLeaguePosition("").build() ;

            return resultModel ;

    }

}
