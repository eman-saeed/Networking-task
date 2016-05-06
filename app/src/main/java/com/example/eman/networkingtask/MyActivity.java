package com.example.eman.networkingtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.eman.pojo.User;
import com.example.eman.presenter.NetworkManager;

import rx.Observable;
import rx.functions.Action1;

public class MyActivity extends AppCompatActivity {

    TextView id;
    TextView email;
    TextView firstName;
    TextView lastName;

    TextView statusTxtView;

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
        bindCompenent();

        if (networkManager == null)
            networkManager = new NetworkManager(this);

        button = (Button) findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("*********", "oncick");
                //get user ifo
                //user = getUserInfo();
                //show info on the activity
//                if (user != null)
//                   // showInfo(user);
//                //show status
//                Toast.makeText(MyActivity.this, status, Toast.LENGTH_SHORT).show();
                networkManager.getStatus("eng.medhat.cs.h@gmail.com", "medhat123");
            }
        });
    }

    public void showStatus(String status){
        statusTxtView.setText(status);
    }
//    private void showInfo(User user) {
//        id.setText(user.getId()+"");
//        email.setText(user.getEmail());
//        firstName.setText(user.getFirstName());
//        lastName.setText(user.getLastName());
//    }

    private void bindCompenent() {
//        id = (TextView) findViewById(R.id.userId);
//        email = (TextView) findViewById(R.id.userEmail);
//        firstName = (TextView) findViewById(R.id.userFirstName);
//        lastName = (TextView) findViewById(R.id.userLastName);
        statusTxtView = (TextView) findViewById(R.id.statusTxtView);
    }

//    public User getUserInfo() {
//        //get user call from network manager class (user name and password could be taken from user)
//        return networkManager.userLogIn("eng.medhat.cs.h@gmail.com","medhat123");
//    }
}
