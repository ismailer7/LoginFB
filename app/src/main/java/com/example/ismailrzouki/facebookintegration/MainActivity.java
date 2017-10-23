package com.example.ismailrzouki.facebookintegration;

import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.ProfilePictureView;


import java.util.Arrays;


public class MainActivity extends AppCompatActivity {


    LoginButton loginButton;
    CallbackManager callbackManager;
    String userId = "1972444303000019";
    //String EMAIL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this);
        setContentView(R.layout.activity_main);
        initialize();

       /* loginButton.setReadPermissions(Arrays.asList(
                "public_profile", "email", "user_birthday", "user_friends"));*/

        loginWithFB();


    }


    public void initialize() {
        callbackManager = CallbackManager.Factory.create();
        loginButton = (LoginButton)findViewById(R.id.login_button);
    }

    public void loginWithFB() {
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

               /* ProfilePictureView profilePictureView;
                profilePictureView = (ProfilePictureView) findViewById(R.id.friendProfilePicture);
                profilePictureView.setCropped(true);
                profilePictureView.setProfileId(userId);*/


                //String UserImageUrl="https://graph.facebook.com/" + userId + "/picture?type=small";





            }
            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

































}



