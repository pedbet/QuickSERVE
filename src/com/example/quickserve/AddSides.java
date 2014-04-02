package com.example.quickserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class AddSides extends Activity implements OnClickListener {
	
	Order customerOrder;
	CheckBox fries;
	CheckBox mashed;
	CheckBox onion;
	CheckBox cole;
	
	public void onCreate (Bundle savedInstanceState )
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addsides);
		
		fries = (CheckBox) findViewById(R.id.sides_cb1);
		mashed = (CheckBox) findViewById(R.id.sides_cb2);
		onion = (CheckBox) findViewById(R.id.sides_cb3);
		cole = (CheckBox) findViewById(R.id.sides_cb4);
		
		Button cancel = (Button) findViewById(R.id.sides_b1);
		Button next = (Button) findViewById(R.id.sides_b2);
		
		cancel.setOnClickListener(this);
		next.setOnClickListener(this);
		
		Intent intent = getIntent();
		
		customerOrder = (Order) intent.getSerializableExtra("com.example.quickserve.Order.class");
	
	}

	@Override
	public void onClick(View v) 
	{
		if (v.getId() == R.id.sides_b1)
		{			
			// Kill activity return to main activity
			
		}
		
		else if (v.getId() == R.id.sides_b2)
		{			
			if(fries.isChecked())
				customerOrder.addSide(fries.getText().toString());
			if(mashed.isChecked())
				customerOrder.addSide(mashed.getText().toString());
			if(onion.isChecked())
				customerOrder.addSide(onion.getText().toString());
			if(cole.isChecked())
				customerOrder.addSide(cole.getText().toString());
			
			Intent intent1 = new Intent(AddSides.this,ParseSelected.class);
			intent1.putExtra("com.example.quickserve.Order.class", customerOrder);
            startActivity(intent1);
		
		}
		
	}

}