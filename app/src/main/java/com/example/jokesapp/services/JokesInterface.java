package com.example.jokesapp.services;

import com.example.jokesapp.model.JokesModel;
import com.example.jokesapp.model.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JokesInterface {

  @GET ("joke/Any?type=single&amount=10")
    Call<Result> getjokes();

}
