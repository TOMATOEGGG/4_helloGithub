package com.emap.zzy.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("activity_life","onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity_life","onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity_life","onPause()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("activity_life","onPostResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity_life","onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity_life","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity_life","onRestart()");
    }
}
