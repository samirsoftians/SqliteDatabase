package com.example.twtech.androidproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";





    @GET("marvel")
    Call<List<Hero>> getHeroes();

   /* @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("marvel")
    Call<List<Hero>> getHeroes();

    @GET("marvel")
    Call<List<Hero>> getHeroes();*/
}
