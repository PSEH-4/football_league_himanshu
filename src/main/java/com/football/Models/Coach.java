package com.football.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Coach {
    public String coachName;
    public String coachCountry;
    public String coachAge;
}
