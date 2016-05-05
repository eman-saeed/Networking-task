package com.example.eman.networkingtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.eman.pojo.User;
import com.example.eman.presenter.NetworkManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyActivity extends AppCompatActivity {

    //private static final String BASE_URL = "http://www.mobiledeveloperweekend.net/";
    TextView id;
    TextView email;
    TextView firstName;
    TextView lastName;

    int userId;
    String userEmail,userFirstName,userLastName;

    NetworkManager networkManager;

    User user;

    Button button;

    String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //bind compenent
       // bindCompenent();

        networkManager = new NetworkManager();

        status = networkManager.getStatus("eng.medhat.cs.h@gmail.com", "medhat123");

//        button = (Button) findViewById(R.id.click);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("*********","oncick");
//                //get user ifo
//                //user = getUserInfo();
//                //show info on the activity
//                if (user != null)
//                   // showInfo(user);
//                //show status
//                Toast.makeText(MyActivity.this, status, Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void showInfo(User user) {
        id.setText(user.getId()+"");
        email.setText(user.getEmail());
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
    }
//
//    private void bindCompenent() {
//        id = (TextView) findViewById(R.id.userId);
//        email = (TextView) findViewById(R.id.userEmail);
//        firstName = (TextView) findViewById(R.id.userFirstName);
//        lastName = (TextView) findViewById(R.id.userLastName);
//    }

//    public User getUserInfo() {
//        //get user call from network manager class (user name and password could be taken from user)
//        return networkManager.userLogIn("eng.medhat.cs.h@gmail.com","medhat123");
//    }
}
