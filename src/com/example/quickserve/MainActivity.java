package com.example.quickserve;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button a = (Button) findViewById(R.id.home_button1);
		
		
         a.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Intent intent1 = new Intent(MainActivity.this,Customer.class);
                 startActivity(intent1);
                 
             }
         });
		
		
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	       

	
}
