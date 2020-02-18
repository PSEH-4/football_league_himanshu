package com.football;

import com.football.Models.Competitions;
import com.football.Models.Country;
import com.football.Models.Standings;
import com.google.gson.Gson;

import java.io.FileWriter;

public class Mock {

        public static Standings[]  getStandings(){
        Gson gson = new Gson();
        String json =  "[\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2621\",\n" +
                "        \"team_name\": \"Liverpool\",\n" +
                "        \"overall_promotion\": \"Promotion - Champions League (Group Stage)\",\n" +
                "        \"overall_league_position\": \"1\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"25\",\n" +
                "        \"overall_league_D\": \"1\",\n" +
                "        \"overall_league_L\": \"0\",\n" +
                "        \"overall_league_GF\": \"61\",\n" +
                "        \"overall_league_GA\": \"15\",\n" +
                "        \"overall_league_PTS\": \"76\",\n" +
                "        \"home_league_position\": \"1\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"13\",\n" +
                "        \"home_league_D\": \"0\",\n" +
                "        \"home_league_L\": \"0\",\n" +
                "        \"home_league_GF\": \"35\",\n" +
                "        \"home_league_GA\": \"9\",\n" +
                "        \"home_league_PTS\": \"39\",\n" +
                "        \"away_league_position\": \"1\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"12\",\n" +
                "        \"away_league_D\": \"1\",\n" +
                "        \"away_league_L\": \"0\",\n" +
                "        \"away_league_GF\": \"26\",\n" +
                "        \"away_league_GA\": \"6\",\n" +
                "        \"away_league_PTS\": \"37\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2621_liverpool.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2626\",\n" +
                "        \"team_name\": \"Manchester City\",\n" +
                "        \"overall_promotion\": \"Promotion - Champions League (Group Stage)\",\n" +
                "        \"overall_league_position\": \"2\",\n" +
                "        \"overall_league_payed\": \"25\",\n" +
                "        \"overall_league_W\": \"16\",\n" +
                "        \"overall_league_D\": \"3\",\n" +
                "        \"overall_league_L\": \"6\",\n" +
                "        \"overall_league_GF\": \"65\",\n" +
                "        \"overall_league_GA\": \"29\",\n" +
                "        \"overall_league_PTS\": \"51\",\n" +
                "        \"home_league_position\": \"3\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"12\",\n" +
                "        \"home_league_W\": \"8\",\n" +
                "        \"home_league_D\": \"2\",\n" +
                "        \"home_league_L\": \"2\",\n" +
                "        \"home_league_GF\": \"31\",\n" +
                "        \"home_league_GA\": \"12\",\n" +
                "        \"home_league_PTS\": \"26\",\n" +
                "        \"away_league_position\": \"2\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"8\",\n" +
                "        \"away_league_D\": \"1\",\n" +
                "        \"away_league_L\": \"4\",\n" +
                "        \"away_league_GF\": \"34\",\n" +
                "        \"away_league_GA\": \"17\",\n" +
                "        \"away_league_PTS\": \"25\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2626_manchester-city.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2611\",\n" +
                "        \"team_name\": \"Leicester\",\n" +
                "        \"overall_promotion\": \"Promotion - Champions League (Group Stage)\",\n" +
                "        \"overall_league_position\": \"3\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"15\",\n" +
                "        \"overall_league_D\": \"5\",\n" +
                "        \"overall_league_L\": \"6\",\n" +
                "        \"overall_league_GF\": \"54\",\n" +
                "        \"overall_league_GA\": \"26\",\n" +
                "        \"overall_league_PTS\": \"50\",\n" +
                "        \"home_league_position\": \"2\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"8\",\n" +
                "        \"home_league_D\": \"3\",\n" +
                "        \"home_league_L\": \"2\",\n" +
                "        \"home_league_GF\": \"26\",\n" +
                "        \"home_league_GA\": \"14\",\n" +
                "        \"home_league_PTS\": \"27\",\n" +
                "        \"away_league_position\": \"3\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"7\",\n" +
                "        \"away_league_D\": \"2\",\n" +
                "        \"away_league_L\": \"4\",\n" +
                "        \"away_league_GF\": \"28\",\n" +
                "        \"away_league_GA\": \"12\",\n" +
                "        \"away_league_PTS\": \"23\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2611_leicester.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2616\",\n" +
                "        \"team_name\": \"Chelsea\",\n" +
                "        \"overall_promotion\": \"Promotion - Champions League (Group Stage)\",\n" +
                "        \"overall_league_position\": \"4\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"12\",\n" +
                "        \"overall_league_D\": \"5\",\n" +
                "        \"overall_league_L\": \"9\",\n" +
                "        \"overall_league_GF\": \"43\",\n" +
                "        \"overall_league_GA\": \"36\",\n" +
                "        \"overall_league_PTS\": \"41\",\n" +
                "        \"home_league_position\": \"12\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"5\",\n" +
                "        \"home_league_D\": \"3\",\n" +
                "        \"home_league_L\": \"5\",\n" +
                "        \"home_league_GF\": \"16\",\n" +
                "        \"home_league_GA\": \"14\",\n" +
                "        \"home_league_PTS\": \"18\",\n" +
                "        \"away_league_position\": \"4\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"7\",\n" +
                "        \"away_league_D\": \"2\",\n" +
                "        \"away_league_L\": \"4\",\n" +
                "        \"away_league_GF\": \"27\",\n" +
                "        \"away_league_GA\": \"22\",\n" +
                "        \"away_league_PTS\": \"23\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2616_chelsea.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2628\",\n" +
                "        \"team_name\": \"Tottenham\",\n" +
                "        \"overall_promotion\": \"Promotion - Europa League (Group Stage)\",\n" +
                "        \"overall_league_position\": \"5\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"11\",\n" +
                "        \"overall_league_D\": \"7\",\n" +
                "        \"overall_league_L\": \"8\",\n" +
                "        \"overall_league_GF\": \"43\",\n" +
                "        \"overall_league_GA\": \"34\",\n" +
                "        \"overall_league_PTS\": \"40\",\n" +
                "        \"home_league_position\": \"4\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"8\",\n" +
                "        \"home_league_D\": \"2\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"25\",\n" +
                "        \"home_league_GA\": \"12\",\n" +
                "        \"home_league_PTS\": \"26\",\n" +
                "        \"away_league_position\": \"11\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"5\",\n" +
                "        \"away_league_L\": \"5\",\n" +
                "        \"away_league_GF\": \"18\",\n" +
                "        \"away_league_GA\": \"22\",\n" +
                "        \"away_league_PTS\": \"14\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2628_tottenham.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2654\",\n" +
                "        \"team_name\": \"Sheffield Utd\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"6\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"10\",\n" +
                "        \"overall_league_D\": \"9\",\n" +
                "        \"overall_league_L\": \"7\",\n" +
                "        \"overall_league_GF\": \"28\",\n" +
                "        \"overall_league_GA\": \"24\",\n" +
                "        \"overall_league_PTS\": \"39\",\n" +
                "        \"home_league_position\": \"8\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"6\",\n" +
                "        \"home_league_D\": \"2\",\n" +
                "        \"home_league_L\": \"5\",\n" +
                "        \"home_league_GF\": \"15\",\n" +
                "        \"home_league_GA\": \"12\",\n" +
                "        \"home_league_PTS\": \"20\",\n" +
                "        \"away_league_position\": \"6\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"4\",\n" +
                "        \"away_league_D\": \"7\",\n" +
                "        \"away_league_L\": \"2\",\n" +
                "        \"away_league_GF\": \"13\",\n" +
                "        \"away_league_GA\": \"12\",\n" +
                "        \"away_league_PTS\": \"19\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2654_sheffield-utd.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2627\",\n" +
                "        \"team_name\": \"Manchester Utd\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"7\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"10\",\n" +
                "        \"overall_league_D\": \"8\",\n" +
                "        \"overall_league_L\": \"8\",\n" +
                "        \"overall_league_GF\": \"38\",\n" +
                "        \"overall_league_GA\": \"29\",\n" +
                "        \"overall_league_PTS\": \"38\",\n" +
                "        \"home_league_position\": \"6\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"6\",\n" +
                "        \"home_league_D\": \"5\",\n" +
                "        \"home_league_L\": \"2\",\n" +
                "        \"home_league_GF\": \"24\",\n" +
                "        \"home_league_GA\": \"12\",\n" +
                "        \"home_league_PTS\": \"23\",\n" +
                "        \"away_league_position\": \"8\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"4\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"6\",\n" +
                "        \"away_league_GF\": \"14\",\n" +
                "        \"away_league_GA\": \"17\",\n" +
                "        \"away_league_PTS\": \"15\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2627_manchester-united.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2646\",\n" +
                "        \"team_name\": \"Wolves\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"8\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"8\",\n" +
                "        \"overall_league_D\": \"12\",\n" +
                "        \"overall_league_L\": \"6\",\n" +
                "        \"overall_league_GF\": \"35\",\n" +
                "        \"overall_league_GA\": \"32\",\n" +
                "        \"overall_league_PTS\": \"36\",\n" +
                "        \"home_league_position\": \"13\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"4\",\n" +
                "        \"home_league_D\": \"6\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"18\",\n" +
                "        \"home_league_GA\": \"17\",\n" +
                "        \"home_league_PTS\": \"18\",\n" +
                "        \"away_league_position\": \"7\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"4\",\n" +
                "        \"away_league_D\": \"6\",\n" +
                "        \"away_league_L\": \"3\",\n" +
                "        \"away_league_GF\": \"17\",\n" +
                "        \"away_league_GA\": \"15\",\n" +
                "        \"away_league_PTS\": \"18\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2646_wolves.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2612\",\n" +
                "        \"team_name\": \"Everton\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"9\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"10\",\n" +
                "        \"overall_league_D\": \"6\",\n" +
                "        \"overall_league_L\": \"10\",\n" +
                "        \"overall_league_GF\": \"34\",\n" +
                "        \"overall_league_GA\": \"38\",\n" +
                "        \"overall_league_PTS\": \"36\",\n" +
                "        \"home_league_position\": \"5\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"7\",\n" +
                "        \"home_league_D\": \"3\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"18\",\n" +
                "        \"home_league_GA\": \"14\",\n" +
                "        \"home_league_PTS\": \"24\",\n" +
                "        \"away_league_position\": \"13\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"7\",\n" +
                "        \"away_league_GF\": \"16\",\n" +
                "        \"away_league_GA\": \"24\",\n" +
                "        \"away_league_PTS\": \"12\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2612_everton.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2617\",\n" +
                "        \"team_name\": \"Arsenal\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"10\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"7\",\n" +
                "        \"overall_league_D\": \"13\",\n" +
                "        \"overall_league_L\": \"6\",\n" +
                "        \"overall_league_GF\": \"36\",\n" +
                "        \"overall_league_GA\": \"34\",\n" +
                "        \"overall_league_PTS\": \"34\",\n" +
                "        \"home_league_position\": \"7\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"5\",\n" +
                "        \"home_league_D\": \"5\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"22\",\n" +
                "        \"home_league_GA\": \"18\",\n" +
                "        \"home_league_PTS\": \"20\",\n" +
                "        \"away_league_position\": \"10\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"2\",\n" +
                "        \"away_league_D\": \"8\",\n" +
                "        \"away_league_L\": \"3\",\n" +
                "        \"away_league_GF\": \"14\",\n" +
                "        \"away_league_GA\": \"16\",\n" +
                "        \"away_league_PTS\": \"14\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2617_arsenal.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2629\",\n" +
                "        \"team_name\": \"Burnley\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"11\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"10\",\n" +
                "        \"overall_league_D\": \"4\",\n" +
                "        \"overall_league_L\": \"12\",\n" +
                "        \"overall_league_GF\": \"30\",\n" +
                "        \"overall_league_GA\": \"39\",\n" +
                "        \"overall_league_PTS\": \"34\",\n" +
                "        \"home_league_position\": \"10\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"6\",\n" +
                "        \"home_league_D\": \"1\",\n" +
                "        \"home_league_L\": \"6\",\n" +
                "        \"home_league_GF\": \"16\",\n" +
                "        \"home_league_GA\": \"18\",\n" +
                "        \"home_league_PTS\": \"19\",\n" +
                "        \"away_league_position\": \"9\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"4\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"6\",\n" +
                "        \"away_league_GF\": \"14\",\n" +
                "        \"away_league_GA\": \"21\",\n" +
                "        \"away_league_PTS\": \"15\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2629_burnley.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2614\",\n" +
                "        \"team_name\": \"Southampton\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"12\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"9\",\n" +
                "        \"overall_league_D\": \"4\",\n" +
                "        \"overall_league_L\": \"13\",\n" +
                "        \"overall_league_GF\": \"32\",\n" +
                "        \"overall_league_GA\": \"48\",\n" +
                "        \"overall_league_PTS\": \"31\",\n" +
                "        \"home_league_position\": \"20\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"3\",\n" +
                "        \"home_league_D\": \"2\",\n" +
                "        \"home_league_L\": \"8\",\n" +
                "        \"home_league_GF\": \"14\",\n" +
                "        \"home_league_GA\": \"30\",\n" +
                "        \"home_league_PTS\": \"11\",\n" +
                "        \"away_league_position\": \"5\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"6\",\n" +
                "        \"away_league_D\": \"2\",\n" +
                "        \"away_league_L\": \"5\",\n" +
                "        \"away_league_GF\": \"18\",\n" +
                "        \"away_league_GA\": \"18\",\n" +
                "        \"away_league_PTS\": \"20\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2614_southampton.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2630\",\n" +
                "        \"team_name\": \"Newcastle\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"13\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"8\",\n" +
                "        \"overall_league_D\": \"7\",\n" +
                "        \"overall_league_L\": \"11\",\n" +
                "        \"overall_league_GF\": \"24\",\n" +
                "        \"overall_league_GA\": \"40\",\n" +
                "        \"overall_league_PTS\": \"31\",\n" +
                "        \"home_league_position\": \"9\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"5\",\n" +
                "        \"home_league_D\": \"5\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"12\",\n" +
                "        \"home_league_GA\": \"12\",\n" +
                "        \"home_league_PTS\": \"20\",\n" +
                "        \"away_league_position\": \"15\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"2\",\n" +
                "        \"away_league_L\": \"8\",\n" +
                "        \"away_league_GF\": \"12\",\n" +
                "        \"away_league_GA\": \"28\",\n" +
                "        \"away_league_PTS\": \"11\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2630_newcastle.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2619\",\n" +
                "        \"team_name\": \"Crystal Palace\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"14\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"7\",\n" +
                "        \"overall_league_D\": \"9\",\n" +
                "        \"overall_league_L\": \"10\",\n" +
                "        \"overall_league_GF\": \"23\",\n" +
                "        \"overall_league_GA\": \"32\",\n" +
                "        \"overall_league_PTS\": \"30\",\n" +
                "        \"home_league_position\": \"15\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"4\",\n" +
                "        \"home_league_D\": \"4\",\n" +
                "        \"home_league_L\": \"5\",\n" +
                "        \"home_league_GF\": \"10\",\n" +
                "        \"home_league_GA\": \"13\",\n" +
                "        \"home_league_PTS\": \"16\",\n" +
                "        \"away_league_position\": \"12\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"5\",\n" +
                "        \"away_league_L\": \"5\",\n" +
                "        \"away_league_GF\": \"13\",\n" +
                "        \"away_league_GA\": \"19\",\n" +
                "        \"away_league_PTS\": \"14\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2619_crystal-palace.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2613\",\n" +
                "        \"team_name\": \"Brighton\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"15\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"6\",\n" +
                "        \"overall_league_D\": \"9\",\n" +
                "        \"overall_league_L\": \"11\",\n" +
                "        \"overall_league_GF\": \"31\",\n" +
                "        \"overall_league_GA\": \"38\",\n" +
                "        \"overall_league_PTS\": \"27\",\n" +
                "        \"home_league_position\": \"11\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"4\",\n" +
                "        \"home_league_D\": \"6\",\n" +
                "        \"home_league_L\": \"3\",\n" +
                "        \"home_league_GF\": \"17\",\n" +
                "        \"home_league_GA\": \"14\",\n" +
                "        \"home_league_PTS\": \"18\",\n" +
                "        \"away_league_position\": \"18\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"2\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"8\",\n" +
                "        \"away_league_GF\": \"14\",\n" +
                "        \"away_league_GA\": \"24\",\n" +
                "        \"away_league_PTS\": \"9\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2613_brighton.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2615\",\n" +
                "        \"team_name\": \"Bournemouth\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"16\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"7\",\n" +
                "        \"overall_league_D\": \"5\",\n" +
                "        \"overall_league_L\": \"14\",\n" +
                "        \"overall_league_GF\": \"26\",\n" +
                "        \"overall_league_GA\": \"40\",\n" +
                "        \"overall_league_PTS\": \"26\",\n" +
                "        \"home_league_position\": \"16\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"4\",\n" +
                "        \"home_league_D\": \"4\",\n" +
                "        \"home_league_L\": \"5\",\n" +
                "        \"home_league_GF\": \"15\",\n" +
                "        \"home_league_GA\": \"19\",\n" +
                "        \"home_league_PTS\": \"16\",\n" +
                "        \"away_league_position\": \"16\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"1\",\n" +
                "        \"away_league_L\": \"9\",\n" +
                "        \"away_league_GF\": \"11\",\n" +
                "        \"away_league_GA\": \"21\",\n" +
                "        \"away_league_PTS\": \"10\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2615_bournemouth.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2632\",\n" +
                "        \"team_name\": \"Aston Villa\",\n" +
                "        \"overall_promotion\": \"\",\n" +
                "        \"overall_league_position\": \"17\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"7\",\n" +
                "        \"overall_league_D\": \"4\",\n" +
                "        \"overall_league_L\": \"15\",\n" +
                "        \"overall_league_GF\": \"34\",\n" +
                "        \"overall_league_GA\": \"50\",\n" +
                "        \"overall_league_PTS\": \"25\",\n" +
                "        \"home_league_position\": \"14\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"5\",\n" +
                "        \"home_league_D\": \"2\",\n" +
                "        \"home_league_L\": \"6\",\n" +
                "        \"home_league_GF\": \"18\",\n" +
                "        \"home_league_GA\": \"24\",\n" +
                "        \"home_league_PTS\": \"17\",\n" +
                "        \"away_league_position\": \"19\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"2\",\n" +
                "        \"away_league_D\": \"2\",\n" +
                "        \"away_league_L\": \"9\",\n" +
                "        \"away_league_GF\": \"16\",\n" +
                "        \"away_league_GA\": \"26\",\n" +
                "        \"away_league_PTS\": \"8\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2632_aston-villa.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2620\",\n" +
                "        \"team_name\": \"West Ham\",\n" +
                "        \"overall_promotion\": \"Relegation - Championship\",\n" +
                "        \"overall_league_position\": \"18\",\n" +
                "        \"overall_league_payed\": \"25\",\n" +
                "        \"overall_league_W\": \"6\",\n" +
                "        \"overall_league_D\": \"6\",\n" +
                "        \"overall_league_L\": \"13\",\n" +
                "        \"overall_league_GF\": \"30\",\n" +
                "        \"overall_league_GA\": \"43\",\n" +
                "        \"overall_league_PTS\": \"24\",\n" +
                "        \"home_league_position\": \"18\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"3\",\n" +
                "        \"home_league_D\": \"3\",\n" +
                "        \"home_league_L\": \"7\",\n" +
                "        \"home_league_GF\": \"20\",\n" +
                "        \"home_league_GA\": \"25\",\n" +
                "        \"home_league_PTS\": \"12\",\n" +
                "        \"away_league_position\": \"14\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"12\",\n" +
                "        \"away_league_W\": \"3\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"6\",\n" +
                "        \"away_league_GF\": \"10\",\n" +
                "        \"away_league_GA\": \"18\",\n" +
                "        \"away_league_PTS\": \"12\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2620_west-ham.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2623\",\n" +
                "        \"team_name\": \"Watford\",\n" +
                "        \"overall_promotion\": \"Relegation - Championship\",\n" +
                "        \"overall_league_position\": \"19\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"5\",\n" +
                "        \"overall_league_D\": \"9\",\n" +
                "        \"overall_league_L\": \"12\",\n" +
                "        \"overall_league_GF\": \"24\",\n" +
                "        \"overall_league_GA\": \"40\",\n" +
                "        \"overall_league_PTS\": \"24\",\n" +
                "        \"home_league_position\": \"17\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"3\",\n" +
                "        \"home_league_D\": \"5\",\n" +
                "        \"home_league_L\": \"5\",\n" +
                "        \"home_league_GF\": \"13\",\n" +
                "        \"home_league_GA\": \"17\",\n" +
                "        \"home_league_PTS\": \"14\",\n" +
                "        \"away_league_position\": \"17\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"2\",\n" +
                "        \"away_league_D\": \"4\",\n" +
                "        \"away_league_L\": \"7\",\n" +
                "        \"away_league_GF\": \"11\",\n" +
                "        \"away_league_GA\": \"23\",\n" +
                "        \"away_league_PTS\": \"10\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2623_watford.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"league_id\": \"148\",\n" +
                "        \"league_name\": \"Premier League\",\n" +
                "        \"team_id\": \"2641\",\n" +
                "        \"team_name\": \"Norwich\",\n" +
                "        \"overall_promotion\": \"Relegation - Championship\",\n" +
                "        \"overall_league_position\": \"20\",\n" +
                "        \"overall_league_payed\": \"26\",\n" +
                "        \"overall_league_W\": \"4\",\n" +
                "        \"overall_league_D\": \"6\",\n" +
                "        \"overall_league_L\": \"16\",\n" +
                "        \"overall_league_GF\": \"24\",\n" +
                "        \"overall_league_GA\": \"48\",\n" +
                "        \"overall_league_PTS\": \"18\",\n" +
                "        \"home_league_position\": \"19\",\n" +
                "        \"home_promotion\": \"\",\n" +
                "        \"home_league_payed\": \"13\",\n" +
                "        \"home_league_W\": \"3\",\n" +
                "        \"home_league_D\": \"3\",\n" +
                "        \"home_league_L\": \"7\",\n" +
                "        \"home_league_GF\": \"18\",\n" +
                "        \"home_league_GA\": \"26\",\n" +
                "        \"home_league_PTS\": \"12\",\n" +
                "        \"away_league_position\": \"20\",\n" +
                "        \"away_promotion\": \"\",\n" +
                "        \"away_league_payed\": \"13\",\n" +
                "        \"away_league_W\": \"1\",\n" +
                "        \"away_league_D\": \"3\",\n" +
                "        \"away_league_L\": \"9\",\n" +
                "        \"away_league_GF\": \"6\",\n" +
                "        \"away_league_GA\": \"22\",\n" +
                "        \"away_league_PTS\": \"6\",\n" +
                "        \"league_round\": \"\",\n" +
                "        \"team_badge\": \"https://apiv2.apifootball.com/badges/2641_norwich.png\"\n" +
                "    }\n" +
                "]" ;

        Standings[] st = gson.fromJson(json, Standings[].class);

        return st;
        }

    public static Country[]  getCountry(){
        Gson gson = new Gson();
        String json = "[\n" +
                "    {\n" +
                "        \"country_id\": \"41\",\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"country_logo\": \"https://apiv2.apifootball.com/badges/logo_country/41_england.png\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"country_id\": \"46\",\n" +
                "        \"country_name\": \"France\",\n" +
                "        \"country_logo\": \"https://apiv2.apifootball.com/badges/logo_country/46_france.png\"\n" +
                "    }\n" +
                "]" ;

        Country[] st = gson.fromJson(json, Country[].class);

        return st;
    }


    public static Competitions[] getCompetitions() {
        Gson gson = new Gson();
            String json  = "[\n" +
                    "    {\n" +
                    "        \"country_id\": \"41\",\n" +
                    "        \"country_name\": \"England\",\n" +
                    "        \"league_id\": \"149\",\n" +
                    "        \"league_name\": \"Championship\",\n" +
                    "        \"league_season\": \"2019/2020\",\n" +
                    "        \"league_logo\": \"https://apiv2.apifootball.com/badges/logo_leagues/149_championship.png\",\n" +
                    "        \"country_logo\": \"https://apiv2.apifootball.com/badges/logo_country/41_england.png\"\n" +
                    "    }\n" +
                    "]";

        Competitions[] st = gson.fromJson(json, Competitions[].class);

        return st;

    }
}
