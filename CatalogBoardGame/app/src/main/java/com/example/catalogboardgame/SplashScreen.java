package com.example.catalogboardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.catalogboardgame.Sign.Login;
import com.example.catalogboardgame.firebaseauth.LoginAuth;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginAuth.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}