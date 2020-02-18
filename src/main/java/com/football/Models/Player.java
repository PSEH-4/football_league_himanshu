package com.football.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Player {

    public Integer playerKey;
    public String playerName;
    public String playerNumber;
    public String playerCountry;
    public String playerType;
    public String playerAge;
    public String playerMatchPlayed;
    public String playerGoals;
    public String playerYellowCards;
    public String playerRedCards;

}