package com.example.flixster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codepath.asynchttpclient.AsyncHttpClient;

public class MainActivity extends AppCompatActivity {

    public static final String NOW_PLAYING_URL = "https://api.themoviedb.org/3/movie/now_playing?api_key=c60762c624beca97b93230c623d9b12e";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AsyncHttpClient client = new AsyncHttpClient();
    }
}