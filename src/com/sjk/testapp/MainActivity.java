package com.sjk.testapp;

import com.example.testapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button b_newPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_newPage=(Button)findViewById(R.id.button_newpage);

        b_newPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, NewPageActivity.class);
                myIntent.putExtra("key", "Key Value"); //Optional parameters
                startActivity(myIntent);
            }
        });

}


   
}