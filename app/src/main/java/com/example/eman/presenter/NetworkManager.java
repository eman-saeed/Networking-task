package com.example.eman.presenter;

import android.util.Log;
import android.widget.Toast;

import com.example.eman.Model.NetworkApi;
import com.example.eman.pojo.MyRespone;
import com.example.eman.pojo.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by EMAN on 05/05/2016.
 */
public class NetworkManager {

    private static final String BASE_URL = "http://www.mobiledeveloperweekend.net/";

    String status;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    NetworkApi networkApi = retrofit.create(NetworkApi.class);

//    public User userLogIn (String userName,String password){
//
//        Call<MyRespone> userCall = networkApi.userLogIn(userName, password);
//        //create new user to be returned
//        final User[] user = {new User()};
//        //handle on respone
//        userCall.enqueue(new Callback<MyRespone>() {
//            @Override
//            public void onResponse(Response<MyRespone> response) {
//                user[0] = response.body().getResult();
//            }
//
//            @Override
//            public void onFailure(Throwable t) {
//            }
//        });
//
//        return user[0];
//    }

    public  String getStatus (String userName,String password){

        Log.i("*********","inside get status");
        Call<MyRespone> userCall = networkApi.userLogIn(userName, password);

        userCall.enqueue(new Callback<MyRespone>() {
            @Override
            public void onResponse(Response<MyRespone> response) {
                Log.i("**********","onresposnse");
                MyRespone myRespone = response.body();
                status = myRespone.getStatus();
                Log.i("onresposnse",myRespone.getStatus());
                Log.i("onresposnse",status);
            }

            @Override
            public void onFailure(Throwable t) {
                Log.i("onfailure",t.getMessage());
            }
        });

        return status;
    }
}
