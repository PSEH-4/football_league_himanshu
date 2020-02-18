package com.football.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Standings {
    public String countryName;
    public String leagueId;
    public String leagueName;
    public String teamId;
    public String teamName;
    public String overallLeaguePosition;
    public String overallLeaguePayed;
    public String overallLeagueW;
    public String overallLeagueD;
    public String overallLeagueL;
    public String overallLeagueGF;
    public String overallLeagueGA;
    public String overallLeaguePTS;
    public String homeLeaguePosition;
    public String homeLeaguePayed;
    public String homeLeagueW;
    public String homeLeagueD;
    public String homeLeagueL;
    public String homeLeagueGF;
    public String homeLeagueGA;
    public String homeLeaguePTS;
    public String awayLeaguePosition;
    public String awayLeaguePayed;
    public String awayLeagueW;
    public String awayLeagueD;
    public String awayLeagueL;
    public String awayLeagueGF;
    public String awayLeagueGA;
    public String awayLeaguePTS;
}
