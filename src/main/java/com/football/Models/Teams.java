package com.football.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Teams {
    public String teamKey;
    public String teamName;
    public String teamBadge;
    public List<Player> players = null;
    public List<Coach> coaches = null;
}
