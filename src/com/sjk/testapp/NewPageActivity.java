package com.sjk.testapp;

import com.example.testapp.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class NewPageActivity extends Activity {
	TextView tvkey;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_page);
		//Retrieve extended data from the intent.
		String key=getIntent().getStringExtra("key");
		tvkey=(TextView)findViewById(R.id.tv_key);
		//Append the specified text to the TextView's display buffer
		tvkey.append(key);
	}
}
