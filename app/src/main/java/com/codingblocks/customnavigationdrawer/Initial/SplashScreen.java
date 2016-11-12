package com.codingblocks.customnavigationdrawer.Initial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codingblocks.customnavigationdrawer.ChatbotFiles.ChatActivity;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
        finish();
    }
}
