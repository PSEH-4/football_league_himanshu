package com.football.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultModel {
    private String country_id ;
    private String country_name ;
    private String league_id ;
    private String league_name ;
    private String team_id ;
    private String team_name ;
    private String overAllLeaguePosition ;




}
