package com.PG.testingapp.Api;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppUrl {

    public static final String BASE_URL =  "http://phpphp.pg-erp.com/index.php/";
   // public static final String BASE_URL =  "http://ghapapp.pg-erp.com/";

    public static Retrofit retrofit=null;

    public static Retrofit getApiClient(){
        if (retrofit==null){

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;

    }
}
