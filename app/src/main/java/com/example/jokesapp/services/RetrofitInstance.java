package com.example.jokesapp.services;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit =null;
    private static String BASE_URL = "https://v2.jokeapi.dev/";

    //singleton Pattern

    public static JokesInterface getService(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }


        return retrofit.create(JokesInterface.class);
    }
}
