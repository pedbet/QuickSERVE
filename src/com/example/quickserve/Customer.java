package com.example.quickserve;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Customer extends Activity{
	
	protected void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.customer);
		final Button a = (Button) findViewById(R.id.customer_b1);
		a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(Customer.this,AddMain.class);
				startActivity(intent1);
				
			}
		});
	
	}
	
}
