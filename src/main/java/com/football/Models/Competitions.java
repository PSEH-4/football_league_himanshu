package com.football.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Competitions {

    public String countryId;
    public String countryName;
    public String leagueId;
    public String leagueName;

}
