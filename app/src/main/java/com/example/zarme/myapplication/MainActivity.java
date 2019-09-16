package com.example.zarme.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnGo(View v)
    {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(),TabbedActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_tabbed);
    }
    public void exit(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    //public void btnGo(View view)
//    {
//        startActivity(new Intent(this,TabbedActivity.class));
//    }
}
