package com.example.eman.Model;

import com.example.eman.pojo.MyRespone;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by EMAN on 05/05/2016.
 */
public interface NetworkApi {

    @GET("service/login")
    Call<MyRespone> userLogIn (@Query("userName") String userName,@Query("password") String password);
}
