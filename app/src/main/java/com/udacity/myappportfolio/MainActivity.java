package com.udacity.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This method will be invoked when SPOTIFY STREAMER button is clicked.
    public void Click1(View view)
    {
        Toast.makeText(this,"This button will launch my SPOTIFY STREAMER app.",Toast.LENGTH_SHORT).show();
    }

    //This method will be invoked when SCORES APP button is clicked.
    public void Click2(View view)
    {
        Toast.makeText(this,"This button will launch my SCORES APP.",Toast.LENGTH_SHORT).show();
    }

    //This method will be invoked when LIBRARY APP button is clicked.
    public void Click3(View view)
    {
        Toast.makeText(this,"This button will launch my LIBRARY APP.",Toast.LENGTH_SHORT).show();
    }

    //This method will be invoked when BUILD IT BIGGER button is clicked.
    public void Click4(View view)
    {
        Toast.makeText(this,"This button will launch my BUILD IT BIGGER app.",Toast.LENGTH_SHORT).show();
    }

    //This method will be invoked when BACON READER button is clicked.
    public void Click5(View view)
    {
        Toast.makeText(this,"This button will launch my BACON READER app.",Toast.LENGTH_SHORT).show();
    }

    //This method will be invoked when CAPSTONE:MY OWN APP button is clicked.
    public void Click6(View view)
    {
        Toast.makeText(this,"This button will launch my CAPSTONE:MY OWN APP.",Toast.LENGTH_SHORT).show();
    }
}
