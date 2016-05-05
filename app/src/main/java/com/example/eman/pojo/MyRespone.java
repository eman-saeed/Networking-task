package com.example.eman.pojo;

/**
 * Created by EMAN on 05/05/2016.
 */
public class MyRespone {

    String status;
    User result;

    public void setResult(User result) {
        this.result = result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getResult() {
        return result;
    }

    public String getStatus() {
        return status;
    }
}
