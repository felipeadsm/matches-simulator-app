package com.example.matches_simulator_app.data;

import java.util.List;

import com.example.matches_simulator_app.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
